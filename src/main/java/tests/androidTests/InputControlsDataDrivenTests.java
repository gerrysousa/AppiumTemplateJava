package tests.androidTests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.InputControlsDatePickerPage;
import pages.InputControlsTimePickerPage;
import helpers.ExcelUtils;
import steps.*;
import static helpers.GlobalParameters.params;

public class InputControlsDataDrivenTests extends BaseTests {

    InputControlsSteps inputControlsSteps;
    InputControlsDatePickerPage inputControlsDatePickerPage;
    InputControlsTimePickerPage inputControlsTimePickerPage;

    InputControlsDatePickerSteps inputControlsDatePickerSteps;
    InputControlsTimePickerSteps inputControlsTimePickerSteps;

    @DataProvider
    public Object[][] obterDadosParaTesteDatePicker(){
        Object[][] testObjArray = ExcelUtils.getTableArray(params.getPATH_PROJECT() +"/src/main/resources/TestData.xlsx","datePicker");
        return (testObjArray);
    }

    @DataProvider
    public Object[][] obterDadosParaTesteTimePicker(){
        Object[][] testObjArray = ExcelUtils.getTableArray(params.getPATH_PROJECT() +"/src/main/resources/TestData.xlsx","timePicker");
        return (testObjArray);
    }

    @Test(dataProvider="obterDadosParaTesteDatePicker")
    public void Test_ManipularCampoDatePicker(
            String dataEscolhida
    ){
        String dataPadrao = "05/07/1994";
        inputControlsSteps = new InputControlsSteps();
        inputControlsDatePickerPage= new InputControlsDatePickerPage();
        inputControlsDatePickerSteps= new InputControlsDatePickerSteps();


        inputControlsSteps.AcessarInputControlsDatePicker();
        String dataInicial = inputControlsDatePickerPage.obterDataSelecionada();
        Assert.assertEquals(dataInicial, dataPadrao);

        inputControlsDatePickerSteps.SelecionarNovaData(dataEscolhida);

        String dataFinal = inputControlsDatePickerPage.obterDataSelecionada();
        Assert.assertEquals(dataFinal, dataEscolhida);//Expected:21/01/1990 --- Actual:1/21/1990
    }

    @Test(dataProvider="obterDadosParaTesteTimePicker")
    public void Test_ManipularCampoTimePicker(
            String hora,
            String minutos,
            String AmPm
    ){
        String horaNaoSelecionada = "Select a time";
        inputControlsSteps = new InputControlsSteps();
        inputControlsTimePickerPage= new InputControlsTimePickerPage();
        inputControlsTimePickerSteps= new InputControlsTimePickerSteps();
        String horaNova = inputControlsTimePickerSteps.converterAmPmNovaHora(hora, minutos, AmPm);//12:30 >> 0:30

        inputControlsSteps.AcessarInputControlsTimePicker();
        String textInicial = inputControlsTimePickerPage.obterHoraSelecionada();
        Assert.assertEquals(textInicial, horaNaoSelecionada);

        inputControlsTimePickerSteps.SelecionarNovaHora(hora, minutos, AmPm);

        String horaSelecionada = inputControlsTimePickerPage.obterHoraSelecionada();
        Assert.assertEquals(horaNova, horaSelecionada);
    }


}
