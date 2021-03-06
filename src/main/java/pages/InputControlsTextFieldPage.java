package pages;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class InputControlsTextFieldPage extends BasePage {
    @iOSFindBy(xpath = "//XCUIElementTypeTextView")
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_edit_text")
    private MobileElement txtCampoTexto;

    public void preencherCampoTexto(String text)
    {
        sendKeys(txtCampoTexto,text);
    }

    public String obterTextoDoElementoCampoTexto() {
        String aux = getText(txtCampoTexto);
        return aux;
    }
}
