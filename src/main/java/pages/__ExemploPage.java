package pages;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class __ExemploPage extends BasePage {
    @iOSFindBy(accessibility= "Username Input Field")
    @AndroidFindBy(accessibility= "Username Input Field")
    private MobileElement usernameField;

    @iOSFindBy(accessibility = "Password Input Field")
    @AndroidFindBy(accessibility = "Password Input Field")
    private MobileElement passwordField;

    @iOSFindBy(accessibility = "Login Button")
    @AndroidFindBy(accessibility = "Login Button")
    private MobileElement loginBtn;

    @iOSFindBy(xpath = "//android.widget.TextView[@text='Login Page']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Login Page']")
    private MobileElement btnLoginPage;

    @iOSFindBy(accessibility = "Alt Message")
    @AndroidFindBy(accessibility = "Alt Message")
    private MobileElement message;

    public void preencherNome(String username)
    {
        sendKeys(usernameField,username);
    }
    public void preencherSenha(String password)
    {
        sendKeys(passwordField,password);
    }
    public void clicarBtnLogin()
    {
        click(loginBtn);
    }
    public String getMessageText()
    {
        return message.getText();
    }
}
