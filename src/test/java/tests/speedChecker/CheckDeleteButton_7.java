package tests.speedChecker;

import common.BaseTest;
import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.OpenSpeedChecker;

import java.io.IOException;

public class CheckDeleteButton_7 extends BaseTest {

    @Test
    public static void CheckDeleteButton() throws InterruptedException, IOException {
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

        Utils.scrollDownTo(ObjectRepo.Name_previous_results_delete_all_btn,5);
        element(ObjectRepo.name_previus_results_wifi_tab).click();

        Utils.swipeHorizontal(ObjectRepo.Id_previous_results_arrow,"left");
        element(ObjectRepo.id_previous_results_delete_btn).click();

        Utils.scrollDownTo(ObjectRepo.Name_previous_results_delete_all_btn,5);
        Utils.waitFor(ObjectRepo.Name_previous_results_delete_all_btn,5);
        element(ObjectRepo.Name_previous_results_delete_all_btn).click();

        Utils.waitFor(ObjectRepo.id_overlay_negative_btn,5);
        element(ObjectRepo.id_overlay_negative_btn).click();

        Utils.waitFor(ObjectRepo.Name_previous_results_delete_all_btn,5);
        element(ObjectRepo.Name_previous_results_delete_all_btn).click();

        Utils.waitFor(ObjectRepo.id_overlay_closeButton,5);
        element(ObjectRepo.id_overlay_closeButton).click();

        Utils.waitFor(ObjectRepo.Name_previous_results_delete_all_btn,5);
        element(ObjectRepo.Name_previous_results_delete_all_btn).click();

        Utils.waitFor(ObjectRepo.id_overlay_positive_btn,5);
        element(ObjectRepo.id_overlay_positive_btn).click();

        Utils.checkInVisibleElement(ObjectRepo.Name_previous_results_delete_all_btn,5);


        soft.assertAll();
    }
}