package tests.privacySettings.Android;

import common.BaseTest;
import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.OpenPrivacy;

import java.io.IOException;
import java.time.Duration;

public class DisableNetwork_4 extends BaseTest {

    @Test
    public static void Disable_Network() throws InterruptedException, IOException {

        SoftAssert soft = new SoftAssert();
        Utils.setGPSOn();
//        OOBEallow.run();
//        GrantDataUsageAccess.run();
        wait(5);
        OpenPrivacy.openPrivacy();
        String tailoredtoggle = element(ObjectRepo.Checkbox_Tailored_Services_Toggle).getText();
        if (tailoredtoggle.contains("OFF")) {
            element(ObjectRepo.Checkbox_Tailored_Services_Toggle).click();
            wait(3);
        }
        soft.assertEquals(tailoredtoggle, "ON", "Tailored Toggle Not Opened");
        String NetworkOptimisationtoggle = element(ObjectRepo.Checkbox_Network_Optimisation_toggle).getText();
        if (NetworkOptimisationtoggle.contains("OFF")) {
            element(ObjectRepo.Checkbox_Network_Optimisation_toggle).click();
            wait(3);
        }
        soft.assertEquals(NetworkOptimisationtoggle, "ON", "Network Optimisation Toggle Not Opened");
        Utils.waitFor(ObjectRepo.Checkbox_Network_Optimisation_toggle, 2);
        element(ObjectRepo.Checkbox_Network_Optimisation_toggle).click();
        soft.assertTrue(element(ObjectRepo.id_overlay_header).isDisplayed());
        wait(1);
        driver.runAppInBackground(Duration.ofSeconds(3));
        wait(3);
        soft.assertEquals(element(ObjectRepo.id_overlay_header).isEnabled(), true, "Header Title isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_main_description).isEnabled(), true, "Text Description isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_closeButton).isEnabled(), true, "Close Button isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_negative_btn).isEnabled(), true, "Negative CTA isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_positive_btn).isEnabled(), true, "Positive CTA isn't Displayed");
        element(ObjectRepo.id_overlay_closeButton).click();
        Utils.waitFor(ObjectRepo.Checkbox_Network_Optimisation_toggle, 2);
        String NetworkOptimisationtoggle1 = element(ObjectRepo.Checkbox_Network_Optimisation_toggle).getText();
        soft.assertEquals(NetworkOptimisationtoggle1, "ON", "Network Toggle Not Opened");
        Utils.waitFor(ObjectRepo.Checkbox_Tailored_Services_Toggle, 2);
        element(ObjectRepo.Checkbox_Tailored_Services_Toggle).click();
        soft.assertTrue(element(ObjectRepo.id_overlay_header).isDisplayed());
        wait(1);
        driver.runAppInBackground(Duration.ofSeconds(3));
        Utils.waitFor(ObjectRepo.id_overlay_header, 2);
        soft.assertEquals(element(ObjectRepo.id_overlay_header).isEnabled(), true, "Header Title isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_main_description).isEnabled(), true, "Text Description isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_closeButton).isEnabled(), true, "Close Button isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_negative_btn).isEnabled(), true, "Negative CTA isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_positive_btn).isEnabled(), true, "Positive CTA isn't Displayed");
        element(ObjectRepo.id_overlay_closeButton).click();
        Utils.waitFor(ObjectRepo.Checkbox_Tailored_Services_Toggle, 2);
        String tailoredtoggle1 = element(ObjectRepo.Checkbox_Tailored_Services_Toggle).getText();
        soft.assertEquals(tailoredtoggle1, "ON", "Tailored Toggle Not Opened");
        wait(1);
        soft.assertAll();
    }
}