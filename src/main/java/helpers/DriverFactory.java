package helpers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

import java.net.URL;

public class DriverFactory {
    public static AppiumDriver<MobileElement> driver;
    private AppiumDriverLocalService service;
    private AppiumServiceBuilder builder;
    public WebDriverWait wait;


    public DriverFactory() {
        builder = new AppiumServiceBuilder();
        builder.withIPAddress(GlobalParameters.APPIUM_IP_ADDRESS);
        builder.usingPort(GlobalParameters.APPIUM_PORT);
        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
        // If you need display only errors on terminal
        //builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");
        service = AppiumDriverLocalService.buildService(builder);
        service.start();
    }

    @Parameters({"deviceType"})
    public static AppiumDriver<MobileElement> getDriver() {
        if (driver == null) {
            if (GlobalParameters.ENV.equals("remote")){
                DriverFactory.createDriverDeviceFarm(GlobalParameters.DEVICE_TYPE);
            }
            else {
                DriverFactory.createDriver(GlobalParameters.DEVICE_TYPE);
            }
        }
        return driver;

    }

    public void setDriver(AppiumDriver<MobileElement> driver) {
        DriverFactory.driver = driver;
    }

    public static AppiumDriver<MobileElement> createDriver(String deviceType){
        try {
            if (deviceType.equals("android")) {
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("platformName", GlobalParameters.ANDROID_PLATFORM_NAME);
                caps.setCapability("platformVersion", GlobalParameters.ANDROID_PLATFORM_VERSION);
                caps.setCapability("deviceName", GlobalParameters.ANDROID_DEVICE_NAME);
                caps.setCapability("app", GlobalParameters.ANDROID_APP_PATH);
                caps.setCapability("browserName", GlobalParameters.ANDROID_APP_BROWSER_NAME);
                caps.setCapability("udid", GlobalParameters.ANDROID_UDID);
                caps.setCapability("noReset", GlobalParameters.ANDROID_APP_NO_RESET);
                caps.setCapability("fullReset", GlobalParameters.ANDROID_APP_FULL_RESET);
                caps.setCapability("orientation", GlobalParameters.ANDROID_APP_ORIENTATION);
                caps.setCapability("automationName", GlobalParameters.APPIUM_AUTOMATION_NAME);
                driver = new AndroidDriver(new URL(GlobalParameters.AppiumServer), caps);
            }
            else if (deviceType.equals("ios"))
            {
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("platformName", GlobalParameters.IOS_PLATFORM_NAME);
                caps.setCapability("platformVersion", GlobalParameters.IOS_PLATFORM_VERSION);
                caps.setCapability("deviceName", GlobalParameters.IOS_DEVICE_NAME);
                caps.setCapability("automationName", GlobalParameters.IOS_AUTOMATION_NAME);
                caps.setCapability("app", GlobalParameters.IOS_APP_PATH);
                //caps.setCapability("bundleId", GlobalParameters.IOSBundleId);
                //caps.setCapability("udid", GlobalParameters.IOSUDID);
                //caps.setCapability(CapabilityType.BROWSER_NAME, "safari");
                //caps.setCapability("noReset", GlobalParameters.IOSNoReset);
                //caps.setCapability("fullReset", GlobalParameters.IOSFullReset);
                driver = new IOSDriver(new URL(GlobalParameters.AppiumServer), caps);
            }
        }
        catch (Exception e)
        {
            System.out.print("Alert! Could not create the APPIUM driver!!!!!");
        }
        return driver;
    }

    public static AppiumDriver<MobileElement> createDriverDeviceFarm(String deviceType){
        try {
            if (deviceType.equals("android")) {
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("platformName", GlobalParameters.ANDROID_PLATFORM_NAME);
                caps.setCapability("automationName", GlobalParameters.APPIUM_AUTOMATION_NAME);
                caps.setCapability("testobject_api_key", GlobalParameters.TEST_OBJECT_API_KEY);
                caps.setCapability("appiumVersion", GlobalParameters.APPIUM_VERSION);
                driver = new AndroidDriver(new URL(GlobalParameters.TEST_OBJECT_URL), caps);
            }
            else if (deviceType.equals("ios")) {

            }

        }
        catch (Exception e)
        {
            System.out.print("Alert! Could not create the APPIUM driver!!!!!");
        }
        return driver;
    }

    public static void killDriver()     {
        if (driver != null)
        {
            driver.quit();
            driver = null;
        }
    }
    public static void resetDriver()     {
        if (driver != null)
        {
            driver.closeApp();
            driver.resetApp();
        }
    }
}
