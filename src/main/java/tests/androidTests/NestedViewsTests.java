package tests.androidTests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MenuPage;
import pages.NestedViewsPage;


public class NestedViewsTests extends BaseTests {

    private HomePage homePage;
    private MenuPage menuPage;
    NestedViewsPage nestedViewsPage;

    @Test(priority = 1, description = "teste de navegacao next")
    public void Test_NestedViewsUpNavigation() {
        homePage = new HomePage();
        menuPage = new MenuPage();
        nestedViewsPage= new NestedViewsPage();

        String textPaginaFinal = "Final Level";

        homePage.clicarBtnMenu();
        menuPage.clicarBtnNestedViews();
        nestedViewsPage.clicarBtnUpNavigation();
        nestedViewsPage.clicarBtnNextLevels();

        String text = nestedViewsPage.obterTextoLevelFinalNext();
        Assert.assertEquals(text, textPaginaFinal);
    }

    @Test(priority = 1, description = "teste de navegacao back")
    public void Test_NestedViewsBackNavigation() {
        homePage = new HomePage();
        menuPage = new MenuPage();
        nestedViewsPage= new NestedViewsPage();

        String textPaginaFinal = "2";

        homePage.clicarBtnMenu();
        menuPage.clicarBtnNestedViews();
        nestedViewsPage.clicarBtnBackNavigation();
        nestedViewsPage.clicarBtnBackNextLevel();

        String text = nestedViewsPage.obterTextoLevelFinalBack();
        Assert.assertEquals(text, textPaginaFinal);
    }
}
