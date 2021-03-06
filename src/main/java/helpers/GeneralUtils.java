package helpers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestResult;

public class GeneralUtils {

  public static String getNowDate(String mask){
    DateFormat dateFormat = new SimpleDateFormat(mask);
    Date date = new Date();
    return dateFormat.format(date);
  }

  public static String getMethodNameByLevel(int level){
    StackTraceElement[] stackTrace = new Throwable().getStackTrace();

    return stackTrace[level].getMethodName();
  }

  public static String getAllStackTrace(ITestResult result){
    String allStackTrace = "";

    for(StackTraceElement stackTrace : result.getThrowable().getStackTrace()){
      allStackTrace = allStackTrace + "<br>" + stackTrace.toString();
    }

    return allStackTrace;
  }

  public static String getDateFormat_yyyyMMddHHmmssSSS() {
    return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
  }

}
