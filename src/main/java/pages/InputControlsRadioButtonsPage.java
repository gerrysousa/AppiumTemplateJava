package pages;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class InputControlsRadioButtonsPage extends BasePage {

    @iOSFindBy(xpath = "xxxxxxxxx")
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/radio_button_1")
    private MobileElement rdbAmazon;

    @iOSFindBy(xpath = "xxxxxxxxx")
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/radio_button_2")
    private MobileElement rdbWeb;

    @iOSFindBy(xpath = "xxxxxxxxx")
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/radio_button_3")
    private MobileElement rdbService;

    @iOSFindBy(xpath = "xxxxxxxxx")
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_radio_button_display")
    private MobileElement lblRadioButtonMarcado;

    public void clicarRdbAmazon()
    {
        click(rdbAmazon);
    }

    public void clicarRdbWeb()
    {
        click(rdbWeb);
    }

    public void clicarRdbService()
    {
        click(rdbService);
    }

    public String obterRadioButtonMarcado() {
        String aux = getText(lblRadioButtonMarcado);
        return aux;
    }
}
