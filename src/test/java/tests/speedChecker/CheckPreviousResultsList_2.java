package tests.speedChecker;

import common.BaseTest;
import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.OpenSpeedChecker;

import java.io.IOException;

public class CheckPreviousResultsList_2 extends BaseTest {

    @Test
    public static void CheckPreviousResultsList() throws InterruptedException, IOException {
        SoftAssert soft = new SoftAssert();

//        OOBEallow.run();
//        GrantDataUsageAccess.run();
        OpenSpeedChecker.openSpeedChecker();
        Utils.waitFor(ObjectRepo.Id_Landing_Primary_button,5);
        element(ObjectRepo.Id_Landing_Primary_button).click();
        wait(35);
        Utils.waitFor(ObjectRepo.Id_test_result_speed_desc,10);
        Utils.waitFor(ObjectRepo.Id_test_result_speed_usage,10);
        Utils.waitFor(ObjectRepo.Id_Test_Result_Time,10);
        Utils.scrollDownTo(ObjectRepo.name_previus_results_wifi_tab,5);
        element(ObjectRepo.name_previus_results_wifi_tab).click();
        soft.assertEquals(element(ObjectRepo.id_previous_results_date).isEnabled(), true, "Previous Result Date Not Displayed");
        soft.assertEquals(element(ObjectRepo.id_previous_results_description).isEnabled(), true, "Previous Result Description Not Displayed");
        element(ObjectRepo.id_previous_results_date).click();
        Utils.waitFor(ObjectRepo.Id_test_result_speed_desc,10);
        Utils.waitFor(ObjectRepo.Id_test_result_speed_usage,10);
        Utils.waitFor(ObjectRepo.Id_Test_Result_Time,10);
        Utils.scrollDownTo(ObjectRepo.Id_Retest_btn,5);
        element(ObjectRepo.Id_Retest_btn).click();
        wait(35);
        Utils.waitFor(ObjectRepo.Id_test_result_speed_desc,10);
        Utils.waitFor(ObjectRepo.Id_test_result_speed_usage,10);
        Utils.waitFor(ObjectRepo.Id_Test_Result_Time,10);
        soft.assertAll();
    }
}