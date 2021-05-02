package tests.androidTests;

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


    @Test(priority = 1, description = "Teste para acessar Image Collection")
    public void Test_AcessarImageCollection() {
        homePage = new HomePage();
        menuPage = new MenuPage();
        nativeComponentsPage= new NativeComponentsPage();
        nativeComponentsImageCollectionPage = new NativeComponentsImageCollectionPage();

        String textTitulo = "Native Components";
        String textTituloImagemColletion = "Image Collection";

        homePage.clicarBtnMenu();
        menuPage.clicarBtnNativeComponentsPage();

        String teste1 = nativeComponentsPage.obterTextoTitulo();
        Assert.assertEquals(teste1, textTitulo);

        String teste2 = nativeComponentsImageCollectionPage.obterTextoTitulo();
        nativeComponentsImageCollectionPage.takeAScreenShot();
        Assert.assertEquals(teste2, textTituloImagemColletion);
    }

    @Test(priority = 1, description = "Teste para acessar Content Scrolling")
    public void Test_AcessarContentScrolling() {
        nativeComponentsSteps = new NativeComponentsSteps();
        nativeComponentsContentScrollingPage = new NativeComponentsContentScrollingPage();

        String textTituloImagemColletion = "Content Scrolling";

        nativeComponentsSteps.acessarContentScrollingPage();
        String teste2 = nativeComponentsContentScrollingPage.obterTextoTitulo();
        nativeComponentsContentScrollingPage.takeAScreenShot();

        Assert.assertEquals(teste2, textTituloImagemColletion);
    }

    @Test(priority = 1, description = "Teste para acessar Video Player")
    public void Test_AcessarVideoPlayer() {
        nativeComponentsSteps = new NativeComponentsSteps();
        nativeComponentsVideoPlayerPage = new NativeComponentsVideoPlayerPage();

        String textTituloImagemColletion = "Video Player";

        nativeComponentsSteps.acessarVideoPlayerPage();
        String teste2 = nativeComponentsVideoPlayerPage.obterTextoTitulo();
        nativeComponentsVideoPlayerPage.takeAScreenShot();

        Assert.assertEquals(teste2, textTituloImagemColletion);
    }

    @Test(priority = 1, description = "Teste para acessar Camera")
    public void Test_AcessarCamera() {
        nativeComponentsSteps = new NativeComponentsSteps();
        nativeComponentsCameraPage = new NativeComponentsCameraPage();

        String textTituloImagemColletion = "Camera";

        nativeComponentsSteps.acessarCameraPage();
        String teste2 = nativeComponentsCameraPage.obterTextoTitulo();
        nativeComponentsCameraPage.takeAScreenShot();

        Assert.assertEquals(teste2, textTituloImagemColletion);
    }

    @Test(priority = 1, description = "Teste para acessar Content Out of View")
    public void Test_AcessarContentOutOfView() {
        nativeComponentsSteps = new NativeComponentsSteps();
        nativeComponentsContentOutOfViewPage = new NativeComponentsContentOutOfViewPage();

        String textTituloImagemColletion = "Content Out of View";
        String textComponenteEscondido = "This is hidden text";

        nativeComponentsSteps.acessarContentOutofViewPage();
        String teste1 = nativeComponentsContentOutOfViewPage.obterTextoTitulo();
        nativeComponentsContentOutOfViewPage.takeAScreenShot();

        Assert.assertEquals(teste1, textTituloImagemColletion);

        nativeComponentsContentOutOfViewPage.scrollUp();
        nativeComponentsContentOutOfViewPage.scrollUp();
        String teste2 = nativeComponentsContentOutOfViewPage.obterTextoDoComponenteEscondido();
        nativeComponentsContentOutOfViewPage.takeAScreenShot();

        Assert.assertEquals(teste2, textComponenteEscondido);
    }





}
