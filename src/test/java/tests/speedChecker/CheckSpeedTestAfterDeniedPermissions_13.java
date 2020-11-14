package tests.speedChecker;

import common.BaseTest;
import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.OOBEdeny;
import screens.OpenPrivacy;
import screens.OpenSpeedChecker;

import java.io.IOException;

public class CheckSpeedTestAfterDeniedPermissions_13 extends BaseTest {

    @Test
    public static void CheckSpeedTestAfterDeniedPermissions() throws InterruptedException, IOException {
        SoftAssert soft = new SoftAssert();
        Utils.setGPSOFF();
        OOBEdeny.run();
        OpenPrivacy.openPrivacy();
        String NetworkOptimisationtoggle = element(ObjectRepo.Checkbox_Network_Optimisation_toggle).getText();
        if (NetworkOptimisationtoggle.contains("ON")) {
            element(ObjectRepo.Checkbox_Network_Optimisation_toggle).click();
            Utils.waitFor(ObjectRepo.id_overlay_positive_btn, 2);
            element(ObjectRepo.id_overlay_positive_btn).click();
            wait(3);
        }
        OpenSpeedChecker.openSpeedChecker();
        soft.assertEquals(element(ObjectRepo.id_overlay_header).isEnabled(), true, "Header Title isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_main_description).isEnabled(), true, "Text Description isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_closeButton).isEnabled(), true, "Close Button isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_negative_btn).isEnabled(), true, "Negative CTA isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_positive_btn).isEnabled(), true, "Positive CTA isn't Displayed");
        element(ObjectRepo.id_overlay_negative_btn).click();
        wait(2);
        element(ObjectRepo.Button_Deny).click();
        element(ObjectRepo.Button_Deny).click();
        Utils.waitFor(ObjectRepo.id_overlay_header, 5);
        soft.assertEquals(element(ObjectRepo.id_overlay_header).isEnabled(), true, "Header Title isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_main_description).isEnabled(), true, "Text Description isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_closeButton).isEnabled(), true, "Close Button isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_negative_btn).isEnabled(), true, "Negative CTA isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_positive_btn).isEnabled(), true, "Positive CTA isn't Displayed");
        element(ObjectRepo.id_overlay_positive_btn).click();
        Utils.waitFor(ObjectRepo.Id_Landing_Primary_button, 5);
        soft.assertEquals(element(ObjectRepo.Id_Landing_Primary_button).isEnabled(), true, "Start Test Button Not Displayed");
        element(ObjectRepo.Id_Landing_Primary_button).click();
        wait(35);
        Utils.waitFor(ObjectRepo.Id_test_result_speed_desc,10);
        Utils.waitFor(ObjectRepo.Id_test_result_speed_usage,10);
        Utils.waitFor(ObjectRepo.Id_Test_Result_Time,10);
        soft.assertAll();
    }
}