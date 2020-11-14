package tests.speedChecker;

import common.BaseTest;
import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.OpenSpeedChecker;

import java.io.IOException;

public class CheckNavigationTapPreviousSpeedResults_9 extends BaseTest {

    @Test
    public static void CheckNavigationTapPreviousSpeedResults() throws InterruptedException, IOException {
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
        element(ObjectRepo.id_previous_results_date).click();
        Utils.waitFor(ObjectRepo.Id_Test_Result_Title,10);
        soft.assertEquals(element(ObjectRepo.Id_Test_Result_Title).isEnabled(), true, "Speed Result Title Not Displayed");

        Utils.waitFor(ObjectRepo.Id_test_result_speed_desc,10);
        soft.assertEquals(element(ObjectRepo.Id_test_result_speed_desc).isEnabled(), true, "Speed Result Description Not Displayed");

        Utils.waitFor(ObjectRepo.Id_test_result_speed_usage,10);
        soft.assertEquals(element(ObjectRepo.Id_test_result_speed_usage).isEnabled(), true, "Speed Result Usage Not Displayed");

        Utils.waitFor(ObjectRepo.Id_Test_Result_Time,10);
        soft.assertEquals(element(ObjectRepo.Id_Test_Result_Time).isEnabled(), true, "Speed Result Time Not Displayed");

        Utils.waitFor(ObjectRepo.xpath_ping_value,10);
        soft.assertEquals(element(ObjectRepo.xpath_ping_value).isEnabled(), true, "Ping Value Not Displayed");

        Utils.waitFor(ObjectRepo.xpath_upload_value,10);
        soft.assertEquals(element(ObjectRepo.xpath_upload_value).isEnabled(), true, "Upload Value Not Displayed");

        Utils.waitFor(ObjectRepo.Xpath_download_value,10);
        soft.assertEquals(element(ObjectRepo.Xpath_download_value).isEnabled(), true, "Download Value Not Displayed");
        soft.assertAll();
    }
}