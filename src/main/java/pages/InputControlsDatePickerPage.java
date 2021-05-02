package pages;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import helpers.DataUtils;

public class InputControlsDatePickerPage extends BasePage {
    //Mapeamento
    @iOSFindBy(id= "android:id/date_picker_header_year")
    @AndroidFindBy(id= "android:id/date_picker_header_year")
    private MobileElement lblAno;

    @iOSFindBy(id= "android:id/date_picker_header_date")
    @AndroidFindBy(id= "android:id/date_picker_header_date")
    private MobileElement lblDiaSelecionado;

    @iOSFindBy(id= "android:id/next")
    @AndroidFindBy(id= "android:id/next")
    private MobileElement btnMesProximo;

    @iOSFindBy(id= "android:id/prev")
    @AndroidFindBy(id= "android:id/prev")
    private MobileElement btnMesAnterior;

    @iOSFindBy(xpath= "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText")
    @AndroidFindBy(id= "com.amazonaws.devicefarm.android.referenceapp:id/input_date_display")
    private MobileElement lblDataCompletaSelecionada;

    @iOSFindBy(id= "android:id/month_view")
    @AndroidFindBy(id= "android:id/month_view")
    private MobileElement gridCalendario;



    //Fim mapeamento
    //Ações
    public void clicarLblAno()
    {
        click(lblAno);
    }

    public void clicarBtnMesProximo()
    {
        click(btnMesProximo);
    }

    public void clicarBtnMesAnterior()
    {
        click(btnMesAnterior);
    }

    public void clicarNoDiaDoCalendario(String dia)
    {
        clickByText(dia);
    }

    public String obterDataSelecionada() {
        String aux = getText(lblDataCompletaSelecionada);
        aux= DataUtils.convertDateToAndroid(aux);

        return aux;
    }

    public String obterDataSelecionadaIos() {
        String aux = getText(lblDataCompletaSelecionada);//Oct 10, 2019
        aux= DataUtils.convertDateToIos(aux);

        return aux;
    }


    //Fim Ações
}
