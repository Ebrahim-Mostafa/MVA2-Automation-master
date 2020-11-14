package tests.speedChecker;

import common.BaseTest;
import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.OpenSpeedChecker;

import java.io.IOException;

public class CheckResultListDisplayedSuccessfullyWiFi_10 extends BaseTest {

    @Test
    public static void CheckResultListDisplayedSuccessfullyWiFi() throws InterruptedException, IOException {
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
        Utils.scrollDownTo(ObjectRepo.Name_previous_results_delete_all_btn,5);
        Utils.waitFor(ObjectRepo.Name_previous_results_delete_all_btn,5);
        soft.assertEquals(element(ObjectRepo.id_previous_results_date).isEnabled(), true, "Previous Result Date Not Displayed");
        soft.assertEquals(element(ObjectRepo.id_previous_results_description).isEnabled(), true, "Previous Result Description Not Displayed");
        soft.assertEquals(element(ObjectRepo.id_previous_results_icon).isEnabled(), true, "Previous Result Icon Not Displayed");
        soft.assertAll();
    }
}