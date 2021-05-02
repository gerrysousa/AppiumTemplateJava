package tests.iOSTests;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import steps.*;

public class NativeComponentsTests extends BaseTests {
    HomePage homePage;
    MenuPage menuPage;
    NativeComponentsPage nativeComponentsPage;
    NativeComponentsImageCollectionPage nativeComponentsImageCollectionPage;
    NativeComponentsSteps nativeComponentsSteps;
    NativeComponentsContentScrollingPage nativeComponentsContentScrollingPage;
    NativeComponentsVideoPlayerPage nativeComponentsVideoPlayerPage;
    NativeComponentsCameraPage nativeComponentsCameraPage;
    NativeComponentsContentOutOfViewPage nativeComponentsContentOutOfViewPage;
    NativeComponentsTableOfElementsPage nativeComponentsTableOfElementsPage;

    @Test(priority = 1, description = "Teste para acessar Image Collection")
    public void Test_AcessarImageCollection() {
        homePage = new HomePage();
        menuPage = new MenuPage();
        nativeComponentsPage= new NativeComponentsPage();
        nativeComponentsImageCollectionPage = new NativeComponentsImageCollectionPage();

        homePage.clicarBtnMenu();
        menuPage.clicarBtnNativeComponentsPage();
        nativeComponentsPage.acessarImageCollectionPage();

        String textTituloImagemColletion = "Image Gallery";
        String teste2 = nativeComponentsImageCollectionPage.obterTextoTitulo();
        nativeComponentsImageCollectionPage.takeAScreenShot();

        Assert.assertEquals(teste2, textTituloImagemColletion);
    }


    @Test(priority = 1, description = "Teste para acessar Content Scrolling")
    public void Test_AcessarContentScrolling() {
        nativeComponentsSteps = new NativeComponentsSteps();
        nativeComponentsContentScrollingPage = new NativeComponentsContentScrollingPage();

        String textTituloImagemColletion = "Scrolling View";

        nativeComponentsSteps.acessarContentScrollingPage();

        String aux = nativeComponentsContentScrollingPage.obterTextoTitulo();
        nativeComponentsContentScrollingPage.takeAScreenShot();

        Assert.assertEquals(aux, textTituloImagemColletion);
    }

    @Test(priority = 1, description = "Teste para acessar Video Player")
    public void Test_AcessarVideoPlayer() {
        nativeComponentsSteps = new NativeComponentsSteps();
        nativeComponentsVideoPlayerPage = new NativeComponentsVideoPlayerPage();

        String textTituloImagemColletion = "Video Player";

        nativeComponentsSteps.acessarVideoPlayerPage();
        //String teste2 = nativeComponentsVideoPlayerPage.obterTextoTitulo();
        nativeComponentsVideoPlayerPage.takeAScreenShot();
        //Assert.assertEquals(teste2, textTituloImagemColletion);
    }

    @Test(priority = 1, description = "Teste para acessar Camera")
    public void Test_AcessarCamera() {
        nativeComponentsSteps = new NativeComponentsSteps();
        nativeComponentsCameraPage = new NativeComponentsCameraPage();

        String textTituloImagemColletion = "Camera";

        nativeComponentsSteps.acessarCameraPage();
        //String teste2 = nativeComponentsCameraPage.obterTextoTitulo();
        nativeComponentsCameraPage.takeAScreenShot();
        //Assert.assertEquals(teste2, textTituloImagemColletion);
    }

    @Test(priority = 1, description = "Teste para acessar Tabuleiro de elementos")
    public void Test_AcessarTableOfElements() {
        nativeComponentsSteps = new NativeComponentsSteps();
        nativeComponentsTableOfElementsPage = new NativeComponentsTableOfElementsPage();

        String textEsperado = "1";

        nativeComponentsSteps.acessarTableOfElementsPage();
        String teste2 = nativeComponentsTableOfElementsPage.obterTextoLinha1();
        nativeComponentsTableOfElementsPage.takeAScreenShot();

        Assert.assertEquals(teste2, textEsperado);
    }


/*
    @Test(priority = 1, description = "Teste para acessar Content Out of View")
    public void Test_AcessarContentOutOfView() {
        nativeComponentsSteps = new NativeComponentsSteps();
        nativeComponentsContentOutOfViewPage = new NativeComponentsContentOutOfViewPage();

        nativeComponentsSteps.acessarContentOutofViewPage();

        //String textTituloImagemColletion = "Content Out of View";
        //String teste1 = nativeComponentsContentOutOfViewPage.obterTextoTitulo();
        nativeComponentsContentOutOfViewPage.tirarScreenShotDaTela();
        //Assert.assertEquals(teste1, textTituloImagemColletion);

        nativeComponentsContentOutOfViewPage.scrollUp();
        nativeComponentsContentOutOfViewPage.scrollUp();

        String textComponenteEscondido = "This is hidden text";
        String teste2 = nativeComponentsContentOutOfViewPage.obterTextoDoComponenteEscondido();
        nativeComponentsContentOutOfViewPage.tirarScreenShotDaTela();
        Assert.assertEquals(teste2, textComponenteEscondido);
    }
    */

}
