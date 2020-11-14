package tests.speedChecker;

import common.BaseTest;
import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.GrantDataUsageAccess;
import screens.OOBEallow;
import screens.OpenSpeedChecker;

import java.io.IOException;

public class CheckTestResultSpeedcardDateAndTime_3 extends BaseTest {
    /**
     * Connection is on using wifi or 3G.
     * Loctaion service is on.
     * Network optimization is enabled."
     **/
    @Test
    public void Result_Speed_Card() throws InterruptedException, IOException {

        SoftAssert soft = new SoftAssert();
//        Utils.setGPSOn();
   //     OOBEallow.run();
//        GrantDataUsageAccess.run();
        Utils.enableNetwork();
        OpenSpeedChecker.openSpeedChecker();
        Utils.waitFor(ObjectRepo.Id_Landing_Primary_button, 5);
        element(ObjectRepo.Id_Landing_Primary_button).click();
        try {
        Utils.waitFor(ObjectRepo.Id_test_result_speed_desc, 35);
        Utils.waitFor(ObjectRepo.Id_test_result_speed_usage, 35);
        Utils.waitFor(ObjectRepo.Id_Test_Result_Time, 35);
        soft.assertTrue(element(ObjectRepo.Id_test_result_speed_desc).getText().contains("Your speed is great for"), " Test description is Not appeared - the test is not completed");
            System.out.println(element(ObjectRepo.Id_test_result_speed_desc).getText());
        soft.assertTrue(element(ObjectRepo.Id_test_result_speed_usage).getText().contains("streaming"), " Test speed usage is Not appeared - the test is not completed");
        soft.assertTrue(element(ObjectRepo.Id_Test_Result_Time).isDisplayed());
        soft.assertTrue(element(ObjectRepo.Id_Test_Result_Time).getText().contains("Tested on"), "Test date is not appeared");
        soft.assertTrue(element(ObjectRepo.Id_Test_Result_Time).getText().contains("Wi-Fi"), "Wifi Text is not appeared");
        }catch (RuntimeException e){
            Utils.handleSpeedTestError();
        }
        soft.assertAll();
    }
}