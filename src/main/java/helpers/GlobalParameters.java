package helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GlobalParameters {

    public static String BROWSER_DEFAULT;
    public static int TIMEOUT_DEFAULT;
    public static String SELENIUM_HUB;
    public static String URL_DEFAULT;
    public static String REPORT_NAME;
    public static String GET_SCREENSHOT_FOR_EACH_STEP;
    public static String DOWNLOAD_DEFAULT_PATH;
    public static String REPORT_PATH;
    public static String DB_SID;
    public static String REPORT_BY_EXECUTION;
    public static String DEVICE_TYPE;
    public static String ENV;
    public static String PATH_PROJECT = System.getProperty("user.dir");

    public static String APPIUM_AUTOMATION_NAME;
    public static String APPIUM_IP_ADDRESS;
    public static int APPIUM_PORT;
    public static String APPIUM_VERSION;
    public static String AppiumServer;

    public static String ANDROID_DEVICE_NAME;
    public static String ANDROID_UDID;
    public static String ANDROID_PLATFORM_NAME;
    public static String ANDROID_PLATFORM_VERSION;
    public static String ANDROID_APP_PACKAGE;
    public static String ANDROID_APP_ACTIVITY;
    public static String ANDROID_APP_PATH;
    public static String ANDROID_APP_BROWSER_NAME;
    public static String ANDROID_APP_NO_RESET;
    public static String ANDROID_APP_FULL_RESET;
    public static String ANDROID_APP_ORIENTATION;

    public static String IOS_UDID;
    public static String IOS_PLATFORM_NAME;
    public static String IOS_PLATFORM_VERSION;
    public static String IOS_REPORT_FORMAT;
    public static String IOS_TEST_NAME;
    public static String IOS_NO_RESET;
    public static String IOS_FULL_RESET;
    public static String IOS_SEND_KEY_STRATEGY;
    public static String IOS_AUTOMATION_NAME;
    public static String IOS_DEVICE_NAME;
    public static String IOS_APP_PATH;
    public static String IOS_BUNDLE_ID;

    public static String TEST_OBJECT_API_KEY;
    public static String TEST_OBJECT_URL;

    private Properties properties;

    public GlobalParameters(){
        properties = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream(PATH_PROJECT +"/globalParameters.properties");
            properties.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BROWSER_DEFAULT = properties.getProperty("browser.default");
        ENV = properties.getProperty("env");
        TIMEOUT_DEFAULT = Integer.parseInt(properties.getProperty("timeout.default"));
        SELENIUM_HUB = properties.getProperty("selenium.hub");
        URL_DEFAULT = properties.getProperty("url.default");
        REPORT_NAME = properties.getProperty("report.name");
        GET_SCREENSHOT_FOR_EACH_STEP = properties.getProperty("get.screenshot.for.each.step");
        DOWNLOAD_DEFAULT_PATH = properties.getProperty("download.defaul.path");
        REPORT_PATH = properties.getProperty("report.path");
        DEVICE_TYPE = properties.getProperty("device.type");
        REPORT_BY_EXECUTION = properties.getProperty("report.separate.by.execution");

        AppiumServer = properties.getProperty("AppiumServer");
        APPIUM_IP_ADDRESS = properties.getProperty("AppiumIPAddress");
        APPIUM_PORT = Integer.parseInt(properties.getProperty("AppiumPort"));
        APPIUM_AUTOMATION_NAME =  properties.getProperty("AppiumAutomationName");
        APPIUM_VERSION = properties.getProperty("AppiumVersion");

        ANDROID_DEVICE_NAME = properties.getProperty("AndroidDeviceName");
        ANDROID_UDID = properties.getProperty("AndroidUDID");
        ANDROID_PLATFORM_NAME = properties.getProperty("AndroidPlatformName");
        ANDROID_PLATFORM_VERSION = properties.getProperty("AndroidPlatformVersion");
        ANDROID_APP_PACKAGE = properties.getProperty("AndroidAppPackage");
        ANDROID_APP_ACTIVITY = properties.getProperty("AndroidAppActivity");
        ANDROID_APP_PATH = PATH_PROJECT +"/src/main/resources/app/android/"+properties.getProperty("AndroidApp");
        ANDROID_APP_BROWSER_NAME =properties.getProperty("AndroidBrowserName");
        ANDROID_APP_NO_RESET =properties.getProperty("AndroidNoReset");
        ANDROID_APP_FULL_RESET =properties.getProperty("AndroidFullReset");
        ANDROID_APP_ORIENTATION =properties.getProperty("AndroidOrientation");

        IOS_UDID = properties.getProperty("IOSUDID");
        IOS_PLATFORM_NAME = properties.getProperty("IOSPlatformName");
        IOS_PLATFORM_VERSION = properties.getProperty("IOSPlatformVersion");
        IOS_BUNDLE_ID = properties.getProperty("IOSBundleId");
        IOS_REPORT_FORMAT = properties.getProperty("IOSReportFormat");
        IOS_TEST_NAME = properties.getProperty("IOSTestName");
        IOS_NO_RESET = properties.getProperty("IOSNoReset");
        IOS_FULL_RESET = properties.getProperty("IOSFullReset");
        IOS_SEND_KEY_STRATEGY = properties.getProperty("IOSSendKeyStrategy");
        IOS_AUTOMATION_NAME = properties.getProperty("IOSAutomationName");
        IOS_DEVICE_NAME =properties.getProperty("IOSDeviceName");
        IOS_APP_PATH = PATH_PROJECT +"/src/main/resources/app/ios/"+properties.getProperty("IOSApp");

        TEST_OBJECT_API_KEY =properties.getProperty("TestObjectApiKey");
        TEST_OBJECT_URL =properties.getProperty("TestObjectURL");
    }
}
