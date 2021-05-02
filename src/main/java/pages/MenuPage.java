package pages;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MenuPage extends BasePage {
    //Mapeamento
    @iOSFindBy(accessibility= "Login")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Login Page']")
    private MobileElement btnLoginPage;

    @iOSFindBy(accessibility= "Inputs")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Input Controls']")
    private MobileElement btnInputControls;

    @iOSFindBy(accessibility= "Nested")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Nested Views']")
    private MobileElement btnNestedViews;

    @iOSFindBy(accessibility= "Web")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Local Web View']")
    private MobileElement btnLocalWebView;

    //@iOSFindBy(accessibility= "Username Input Field")
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/drawerList")
    private MobileElement menuLista;

    @iOSFindBy(accessibility= "Alerts")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Alerts']")
    private MobileElement btnAlertsDialogsPage;

    @iOSFindBy(accessibility= "Native")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Native Components']")
    private MobileElement btnNativeComponentsPage;

    //@iOSFindBy(accessibility= "Username Input Field")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Fixtures']")
    private MobileElement btnFixturesPage;

    @iOSFindBy(accessibility= "HTTP")
    @AndroidFindBy(xpath = "xxxxxxxx")
    private MobileElement btnHttp;

    @iOSFindBy(accessibility= "Web")
    @AndroidFindBy(xpath = "xxxxxxxx")
    private MobileElement btnWebView;


    //Fim Mapeamento
    //Ações
    public void clicarBtnLoginPage()
    {
        click(btnLoginPage);
    }
    public void clicarInputControls()
    {
        click(btnInputControls);
    }

    public void clicarBtnNestedViews()
    {
        click(btnNestedViews);
    }

    public void clicarBtnLocalWebViewPage() {
        excutarScrowDownMenuLista();
        click(btnLocalWebView);
    }

    public void excutarScrowDownMenuLista() {
        scrollElement(menuLista,0.8, 0.3);
    }

    public void clicarBtnAlertsDialogsPage() {
        click(btnAlertsDialogsPage);
    }

    public void clicarBtnNativeComponentsPage() {
        click(btnNativeComponentsPage);
    }

    public void clicarBtnFixturesPage() {
        excutarScrowDownMenuLista();
        click(btnFixturesPage);
    }

    public void clicarBtnHttp() {
        click(btnHttp);
    }

    public void clicarBtnWebViewPage() {
        click(btnWebView);
    }
}
