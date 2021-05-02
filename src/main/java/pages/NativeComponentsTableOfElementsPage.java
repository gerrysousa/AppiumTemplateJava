package pages;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class NativeComponentsTableOfElementsPage extends BasePage {

    @iOSFindBy(id = "1")
    private MobileElement linha1;

    public String obterTextoLinha1() {
        String text = getText(linha1);
        return text;
    }
}