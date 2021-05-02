package pages;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class InputControlsCampoInformacaoPage extends BasePage {

    @iOSFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeButton[1]")
    private MobileElement btnMaisInformacao;

    public void clicarBtnMaisInformacao() {
        click(btnMaisInformacao);
    }

    public String obterTextoBtnMaisInformacao() {
        String aux = getText(btnMaisInformacao);
        return aux;
    }
}