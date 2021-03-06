package pages;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AlertsDialogsPage extends BasePage {
    @iOSFindBy(accessibility = "Modal")
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/notifications_toast_button")
    private MobileElement btnToast;

    @iOSFindBy(accessibility = "Alert")
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/notifications_alert_button")
    private MobileElement btnAlert;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='This is an alert']")
    @AndroidFindBy(id = "android:id/message")
    private MobileElement lblMensagemAlerta;

    @iOSFindBy(accessibility = "OK")
    @AndroidFindBy(id = "android:id/button1")
    private MobileElement btnAlertaOK;

    //XCUIElementTypeStaticText[@name="This is a modal view"]
    @iOSFindBy(accessibility = "This is a modal view")
    private MobileElement lblMensagemAlertaModal;

    public void clicarBtnToast()
    {
        click(btnToast);
    }

    public void clicarBtnAlert()
    {
        click(btnAlert);
    }

    public void clicarBtnAlertaOK()
    {
        click(btnAlertaOK);
    }

    public String obterMensagemDoAlerta()
    {
        String text = getText(lblMensagemAlerta);
        return text;
    }

    public String obterMensagemDoModal()
    {
        String text = getText(lblMensagemAlertaModal);
        return text;
    }

}
