package tests.iOSTests;


import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.InputControlsDatePickerPage;
import helpers.ExcelUtils;
import steps.*;

import static helpers.GlobalParameters.PATH_PROJECT;

public class InputControlsDataDrivenTests extends BaseTests {

    InputControlsSteps inputControlsSteps;
    InputControlsDatePickerPage inputControlsDatePickerPage;
    InputControlsDatePickerSteps inputControlsDatePickerSteps;

    @DataProvider
    public Object[][] obterDadosParaTesteDatePicker(){
        Object[][] testObjArray = ExcelUtils.getTableArray(PATH_PROJECT +"/src/main/resources/TestData.xlsx","datePicker");
        return (testObjArray);
    }

    @Test(dataProvider="obterDadosParaTesteDatePicker")
    public void Test_ManipularCampoDatePicker(
            String dataEscolhida
    ){
        inputControlsSteps = new InputControlsSteps();
        inputControlsDatePickerPage= new InputControlsDatePickerPage();
        inputControlsDatePickerSteps= new InputControlsDatePickerSteps();

        inputControlsSteps.AcessarInputControlsDatePicker();
        inputControlsDatePickerSteps.SelecionarNovaData(dataEscolhida);

        String dataFinal = inputControlsDatePickerPage.obterDataSelecionadaIos();
        Assert.assertEquals(dataFinal, dataEscolhida);
    }



}
