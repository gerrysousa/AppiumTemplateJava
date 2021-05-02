package pages;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class InputControlsSpinnerPage extends BasePage {

    @iOSFindBy(xpath = "//XCUIElementTypePickerWheel")
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_spinner")
    private MobileElement btnSelecao;

    @iOSFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_spinner_message")
    private MobileElement lblOpcaoSelecionada;

    public void clicarBtnSelecao()
    {
        click(btnSelecao);
    }

    public String obterOpcaoSelecionada() {
        String aux = getText(lblOpcaoSelecionada);
        return aux;
    }

    public void selecionarOpcaoGenerica(String opcaoEscolhida) {
        if (driver.getCapabilities().getCapability("platformName").toString().equals("Android")) {
            // codigo para android
            clicarBtnSelecao();
            clickByText(opcaoEscolhida);
        }
        else if (driver.getCapabilities().getCapability("platformName").toString().equals("iOS"))
        {
            //codigo para iOS
            scrollbyCoordinates(170,240,170,270);
        }

    }
}

