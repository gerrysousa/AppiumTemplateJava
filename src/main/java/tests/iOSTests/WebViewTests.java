package tests.iOSTests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MenuPage;
import pages.WebViewPage;


public class WebViewTests extends BaseTests {
    private HomePage homePage;
    private MenuPage menuPage;
    WebViewPage webViewPage;

    @Test(priority = 1, description = "Teste para manipular webview ")
    public void Test_AcessarWebview() {
        homePage = new HomePage();
        menuPage = new MenuPage();
        webViewPage = new WebViewPage();

        String textBemVindo = "2";

        homePage.clicarBtnMenu();
        menuPage.clicarBtnWebViewPage();
        webViewPage.clicarBtnSignIn();

        String teste2 = webViewPage.obterMensagemDeBemVindo();
        Assert.assertEquals(teste2, textBemVindo);
    }
}