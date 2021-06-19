# AppiumTemplateJava
Made by @gerrysousa

Setup Project

Introduction
- Step 1: Install the Java Development Kit (JDK)
  - (JDK)[JDK Download](https://www.oracle.com/java/technologies/javase-downloads.html)

- Step 2: Set Up Java Environment Variable Path
  - (% JAVA_HOME% \ bin ou C: Progam Files \ Java \ jdk1.8.0_45 \ bin)
  - Check if configuration is correct running the follow command in terminal: 
  - ```$java -version```

- Step 3: Install Android SDK / ADB on Windows
  - [Android Studio- SDK Download](https://developer.android.com/studio#Other)

- Step 4: Install Android SDK Packages in Android Studio

- Step 5: Set up Android Environment Variable and Path
  - Environment Variable : "ANDROID_HOME" = "C:\Program Files (x86)\Android\android-sdk"
  - Path: %ANDROID_HOME%\platform-tools
  - Path: %ANDROID_HOME%\tools
  - Path: %ANDROID_HOME%\tools\bin
  
- Step 6: Download and Install NodeJs
  - [Download Node JS](https://nodejs.org/en/download/)
  - Install the Appium service using the npm command.
  - ```$npm install -g appium```

- Step 7: Install Microsoft .net Framework
  - [Dot Net Core 3.1- Download](https://dotnet.microsoft.com/download/dotnet-core/3.1)

- Step 8: Download And Install Appium Desktop Client
  - [Appium v1.18.0 - Download](https://github.com/appium/appium-desktop/releases/tag/v1.18.0-1)
  - [All Appium Versions - Download](https://github.com/appium/appium-desktop/tags)
  
- Step 9: Enabling Developer Mode Options on Android Phone or Tablet

- Step 10: Install your IDE And Set up a Project
  - [IntelliJ IDEA - Download](https://www.jetbrains.com/idea/download/#section=windows)
  - [Eclipse IDE - Download](https://www.eclipse.org/downloads/)

- Step 11: Download Maven Dependencies
  - Inside path project run the command: ````$mvn clean````
  
- Step 12: Running Appium Tests
  - Run Appium Desktop
  - Click "Start Server v1.18.0" on Appium Desktop
  - Run Android Emulator
  - On IDE, run test as testng tests.
  
--------------------------------------
- Expect mobile Screens on Appium Desktop
  - Click button "Start Inspector Session" on Appium Desktop
  - Fill in capabilities 
    - "platformName": "android",
    - "deviceName": "Teste",
    - "platform": "android",
    - "app": "C:\caminho\para\o\App\app-debug.apk",
    - "AutomationName": "UiAutomator2",
    - "udid": "emulator-5554"
  - Click button "Start Session". Appium must install and run "app-debug.apk" in emulador/device informed "UDID"
- Obs:  The emulator must be running, or the device must be conected on usb port that Appium Desktop is running.

Sample config to Appium server install the apk in a device:
```
{
  "platformName": "android",
  "deviceName": "Teste",
  "platform": "android",
  "app": "C:\caminho\para\o\App\app-debug.apk",
  "AutomationName": "UiAutomator2",
  "udid": "emulator-5554"
}
```

- Expect mobile Screens Android uiautomatorviewer
 - In the android sdk folder "C:\Program Files\Android\android-sdk\tools\bin" execute "uiautomatorviewer.bat" file


Useful Commands:
- List Adb devices , to catch device UDID:
```
$adb devices
Result: emulator-5554   device
```
- List Emulators, to catch device names:
```
$emulator -list-avds
Result: Pixel_3a_API_28
```
- Install Appium Service on Node.
```$npm install -g appium```

- Tests execution on Device Farms:
    - Modify some parameter on "globalParameters.properties" file on root path project: 
    ```env=remote``` , ```device.farm=browserstack```, and run the follow command: 
    
```$mvn test "-DsuiteXmlFile=src/main/java/tests/xml/LoginTests.xml"```


- Running Tests parallel execution on Device Farms: 
   
```$mvn test "-DsuiteXmlFile=src/main/java/tests/xml/ParallelTests.xml"```




Upload app to BrowserStack:
```
curl -u "bt_user:bt_Key" -X POST "https://api-cloud.browserstack.com/app-automate/upload" -F "file=@path/to/app.apk" -F "custom_id=AppNameOptional"
```
Response example:
```
{
	"app_url": "bs://xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
	"custom_id": "AppNameOptional",
	"shareable_id": "bt_user/AppNameOptional"
}
```



Made by @gerrysousa