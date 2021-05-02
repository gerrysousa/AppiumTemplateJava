package pages;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class InputControlsToggleButtonPage extends BasePage {

    @iOSFindBy(xpath = "//XCUIElementTypeSwitch")
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_switch")
    private MobileElement btnSwitch;

    @iOSFindBy(xpath = "//XCUIElementTypeSwitch")
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_switch_display")
    private MobileElement lblStatusSwitch;

    @iOSFindBy(xpath = "//XCUIElementTypeSwitch")
    private MobileElement valorToggle;

    public void clicarBtnSwitch()
    {
        click(btnSwitch);
    }

    public String obterStatusSwitch()
    {
        if (driver.getCapabilities().getCapability("platformName").toString().equals("Android"))
        {
            String aux = getElementDescription(lblStatusSwitch);
            return aux;
        }
        else {
            String aux = getText(lblStatusSwitch);
            return aux;
        }
    }

    public String obterStatusToggleIos()
    {
        String aux = getValue(valorToggle);
        return aux;
    }
}