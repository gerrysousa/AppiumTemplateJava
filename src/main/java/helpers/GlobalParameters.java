package helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.http.annotation.Contract;

public class GlobalParameters {

    public static final String PKG_QA = "com.abinbev.hive.brazil.qa";
    public static final String PKG_UAT = "com.abinbev.hive.brazil.uat";

    private String BROWSER_DEFAULT;
    private int TIMEOUT_DEFAULT;
    private String SELENIUM_HUB;
    private String URL_DEFAULT;
    private String REPORT_NAME;
    private String GET_SCREENSHOT_FOR_EACH_STEP;
    private String DOWNLOAD_DEFAULT_PATH;
    private String REPORT_PATH;
    private String REPORT_BY_EXECUTION;
    private String DEVICE_TYPE;
    private String ENV;
    private String PATH_PROJECT = System.getProperty("user.dir");
    private String DEVICE_FARM;

    private String APPIUM_AUTOMATION_NAME;
    private String APPIUM_IP_ADDRESS;
    private int APPIUM_PORT;
    private String APPIUM_VERSION;
    private String AppiumServer;

    private String ANDROID_DEVICE_NAME;
    private String ANDROID_UDID;
    private String ANDROID_PLATFORM_NAME;
    private String ANDROID_PLATFORM_VERSION;
    private String ANDROID_APP_PACKAGE;
    private String ANDROID_APP_ACTIVITY;
    private String ANDROID_APP_PATH;
    private String ANDROID_APP_BROWSER_NAME;
    private String ANDROID_APP_NO_RESET;
    private String ANDROID_APP_FULL_RESET;
    private String ANDROID_APP_ORIENTATION;
    private String ANDROID_AUTO_GRANT_PERMISSIONS;

    private String IOS_UDID;
    private String IOS_PLATFORM_NAME;
    private String IOS_PLATFORM_VERSION;
    private String IOS_REPORT_FORMAT;
    private String IOS_TEST_NAME;
    private String IOS_NO_RESET;
    private String IOS_FULL_RESET;
    private String IOS_SEND_KEY_STRATEGY;
    private String IOS_AUTOMATION_NAME;
    private String IOS_DEVICE_NAME;
    private String IOS_APP_PATH;
    private String IOS_BUNDLE_ID;

    private String TEST_OBJECT_API_KEY;
    private String TEST_OBJECT_URL;

    private String BROWSERSTACK_USER;
    private String BROWSERSTACK_KEY ;
    private String BROWSERSTACK_APP ;
    private String BROWSERSTACK_DEVICE;
    private String BROWSERSTACK_OS_VERSION;
    private String BROWSERSTACK_PROJECT ;
    private String BROWSERSTACK_BUILD ;
    private String BROWSERSTACK_NAME;
    private String BROWSERSTACK_URL;


    private Properties properties;

    public static final GlobalParameters params = new GlobalParameters();

    public GlobalParameters() {
        properties = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream(PATH_PROJECT + "/globalParameters.properties");
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
        DEVICE_FARM=properties.getProperty("device.farm");

        AppiumServer = properties.getProperty("AppiumServer");
        APPIUM_IP_ADDRESS = properties.getProperty("AppiumIPAddress");
        APPIUM_PORT = Integer.parseInt(properties.getProperty("AppiumPort"));
        APPIUM_AUTOMATION_NAME = properties.getProperty("AppiumAutomationName");
        APPIUM_VERSION = properties.getProperty("AppiumVersion");

        ANDROID_DEVICE_NAME = properties.getProperty("AndroidDeviceName");
        ANDROID_UDID = properties.getProperty("AndroidUDID");
        ANDROID_PLATFORM_NAME = properties.getProperty("AndroidPlatformName");
        ANDROID_PLATFORM_VERSION = properties.getProperty("AndroidPlatformVersion");
        ANDROID_APP_PACKAGE = properties.getProperty("AndroidAppPackage");
        ANDROID_APP_ACTIVITY = properties.getProperty("AndroidAppActivity");
        ANDROID_APP_PATH = PATH_PROJECT + "/src/main/resources/app/android/" + properties.getProperty("AndroidApp");
        ANDROID_APP_BROWSER_NAME = properties.getProperty("AndroidBrowserName");
        ANDROID_APP_NO_RESET = properties.getProperty("AndroidNoReset");
        ANDROID_APP_FULL_RESET = properties.getProperty("AndroidFullReset");
        ANDROID_APP_ORIENTATION = properties.getProperty("AndroidOrientation");
        ANDROID_AUTO_GRANT_PERMISSIONS = properties.getProperty("AndroidAutoGrantPermissions");

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
        IOS_DEVICE_NAME = properties.getProperty("IOSDeviceName");
        IOS_APP_PATH = PATH_PROJECT + "/src/main/resources/app/ios/" + properties.getProperty("IOSApp");

        TEST_OBJECT_API_KEY = properties.getProperty("TestObjectApiKey");
        TEST_OBJECT_URL = properties.getProperty("TestObjectURL");

        BROWSERSTACK_USER = properties.getProperty("browserstack.user");
        BROWSERSTACK_KEY = properties.getProperty("browserstack.key");
        BROWSERSTACK_APP = properties.getProperty("browserstack.app");
        BROWSERSTACK_DEVICE = properties.getProperty("browserstack.device");
        BROWSERSTACK_OS_VERSION = properties.getProperty("browserstack.os_version");
        BROWSERSTACK_PROJECT = properties.getProperty("browserstack.project");
        BROWSERSTACK_BUILD = properties.getProperty("browserstack.build");
        BROWSERSTACK_NAME = properties.getProperty("browserstack.name");
        BROWSERSTACK_URL=properties.getProperty("browserstack.url");


    }

    public String getBROWSER_DEFAULT() {
        return BROWSER_DEFAULT;
    }

    public int getTIMEOUT_DEFAULT() {
        return TIMEOUT_DEFAULT;
    }

    public String getSELENIUM_HUB() {
        return SELENIUM_HUB;
    }

    public String getURL_DEFAULT() {
        return URL_DEFAULT;
    }

    public String getREPORT_NAME() {
        return REPORT_NAME;
    }

    public String getGET_SCREENSHOT_FOR_EACH_STEP() {
        return GET_SCREENSHOT_FOR_EACH_STEP;
    }

    public String getDOWNLOAD_DEFAULT_PATH() {
        return DOWNLOAD_DEFAULT_PATH;
    }

    public String getREPORT_PATH() {
        return REPORT_PATH;
    }

    public String getREPORT_BY_EXECUTION() {
        return REPORT_BY_EXECUTION;
    }

    public String getDEVICE_TYPE() {
        return DEVICE_TYPE;
    }

    public String getENV() {
        return ENV;
    }

    public String getPATH_PROJECT() {
        return PATH_PROJECT;
    }

    public String getDEVICE_FARM() {
        return DEVICE_FARM;
    }

    public String getAPPIUM_AUTOMATION_NAME() {
        return APPIUM_AUTOMATION_NAME;
    }

    public String getAPPIUM_IP_ADDRESS() {
        return APPIUM_IP_ADDRESS;
    }

    public int getAPPIUM_PORT() {
        return APPIUM_PORT;
    }

    public String getAPPIUM_VERSION() {
        return APPIUM_VERSION;
    }

    public String getAppiumServer() {
        return AppiumServer;
    }

    public String getANDROID_DEVICE_NAME() {
        return ANDROID_DEVICE_NAME;
    }

    public String getANDROID_UDID() {
        return ANDROID_UDID;
    }

    public String getANDROID_PLATFORM_NAME() {
        return ANDROID_PLATFORM_NAME;
    }

    public String getANDROID_PLATFORM_VERSION() {
        return ANDROID_PLATFORM_VERSION;
    }

    public String getANDROID_APP_PACKAGE() {
        return ANDROID_APP_PACKAGE;
    }

    public String getANDROID_APP_ACTIVITY() {
        return ANDROID_APP_ACTIVITY;
    }

    public String getANDROID_APP_PATH() {
        return ANDROID_APP_PATH;
    }

    public String getANDROID_APP_BROWSER_NAME() {
        return ANDROID_APP_BROWSER_NAME;
    }

    public String getANDROID_APP_NO_RESET() {
        return ANDROID_APP_NO_RESET;
    }

    public String getANDROID_APP_FULL_RESET() {
        return ANDROID_APP_FULL_RESET;
    }

    public String getANDROID_APP_ORIENTATION() {
        return ANDROID_APP_ORIENTATION;
    }

    public String getANDROID_AUTO_GRANT_PERMISSIONS() {
        return ANDROID_AUTO_GRANT_PERMISSIONS;
    }

    public String getIOS_UDID() {
        return IOS_UDID;
    }

    public String getIOS_PLATFORM_NAME() {
        return IOS_PLATFORM_NAME;
    }

    public String getIOS_PLATFORM_VERSION() {
        return IOS_PLATFORM_VERSION;
    }

    public String getIOS_REPORT_FORMAT() {
        return IOS_REPORT_FORMAT;
    }

    public String getIOS_TEST_NAME() {
        return IOS_TEST_NAME;
    }

    public String getIOS_NO_RESET() {
        return IOS_NO_RESET;
    }

    public String getIOS_FULL_RESET() {
        return IOS_FULL_RESET;
    }

    public String getIOS_SEND_KEY_STRATEGY() {
        return IOS_SEND_KEY_STRATEGY;
    }

    public String getIOS_AUTOMATION_NAME() {
        return IOS_AUTOMATION_NAME;
    }

    public String getIOS_DEVICE_NAME() {
        return IOS_DEVICE_NAME;
    }

    public String getIOS_APP_PATH() {
        return IOS_APP_PATH;
    }

    public String getIOS_BUNDLE_ID() {
        return IOS_BUNDLE_ID;
    }

    public String getTEST_OBJECT_API_KEY() {
        return TEST_OBJECT_API_KEY;
    }

    public String getTEST_OBJECT_URL() {
        return TEST_OBJECT_URL;
    }

    public String getBROWSERSTACK_USER() {
        return BROWSERSTACK_USER;
    }

    public String getBROWSERSTACK_KEY() {
        return BROWSERSTACK_KEY;
    }

    public String getBROWSERSTACK_APP() {
        return BROWSERSTACK_APP;
    }

    public String getBROWSERSTACK_DEVICE() {
        return BROWSERSTACK_DEVICE;
    }

    public String getBROWSERSTACK_OS_VERSION() {
        return BROWSERSTACK_OS_VERSION;
    }

    public String getBROWSERSTACK_PROJECT() {
        return BROWSERSTACK_PROJECT;
    }

    public String getBROWSERSTACK_BUILD() {
        return BROWSERSTACK_BUILD;
    }

    public String getBROWSERSTACK_NAME() {
        return BROWSERSTACK_NAME;
    }

    public String getBROWSERSTACK_URL() {
        return BROWSERSTACK_URL;
    }
}
