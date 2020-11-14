package tests.speedChecker;

import common.BaseTest;
import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.OpenSpeedChecker;

import java.io.IOException;

public class CheckBehaviorIncaseCuttingoffConnection_11 extends BaseTest {

    @Test
    public static void CheckBehaviorIncaseCuttingoffConnection() throws InterruptedException, IOException {
        SoftAssert soft = new SoftAssert();

//        OOBEallow.run();
//        GrantDataUsageAccess.run();

        OpenSpeedChecker.openSpeedChecker();
        Utils.waitFor(ObjectRepo.Id_Landing_Primary_button,5);
        soft.assertEquals(element(ObjectRepo.Id_Landing_Primary_button).isEnabled(), true, "Start Test Button Not Displayed");
        Utils.KillApp();
        Utils.setWifiOff();
        Utils.ReOpenApp();
        wait(5);
        OpenSpeedChecker.openSpeedChecker();
        element(ObjectRepo.Id_Landing_Primary_button).click();
        soft.assertEquals(element(ObjectRepo.id_overlay_header).isEnabled(), true, "Header Title isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_main_description).isEnabled(), true, "Text Description isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_closeButton).isEnabled(), true, "Close Button isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_negative_btn).isEnabled(), true, "Negative CTA isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_positive_btn).isEnabled(), true, "Positive CTA isn't Displayed");
        element(ObjectRepo.id_overlay_positive_btn).click();
        wait(2);
        soft.assertEquals(element(ObjectRepo.id_overlay_header).isEnabled(), true, "Header Title isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_main_description).isEnabled(), true, "Text Description isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_closeButton).isEnabled(), true, "Close Button isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_negative_btn).isEnabled(), true, "Negative CTA isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_positive_btn).isEnabled(), true, "Positive CTA isn't Displayed");
        element(ObjectRepo.id_overlay_negative_btn).click();
        soft.assertEquals(element(ObjectRepo.Id_Landing_Primary_button).isEnabled(), true, "Start Test Button Not Displayed");

        soft.assertAll();
    }
}