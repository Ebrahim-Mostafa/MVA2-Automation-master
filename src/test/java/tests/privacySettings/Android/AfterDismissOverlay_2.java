package tests.privacySettings.Android;

import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.OpenPrivacy;
import common.BaseTest;

import java.io.IOException;

public class AfterDismissOverlay_2 extends BaseTest {

    @Test
    public static void After_Dismiss_Overlay() throws InterruptedException, IOException {

        SoftAssert soft = new SoftAssert();
        Utils.setGPSOn();
//        OOBEallow.run();
//        GrantDataUsageAccess.run();
        OpenPrivacy.openPrivacy();
        String tailoredtoggle = element(ObjectRepo.Checkbox_Tailored_Services_Toggle).getText();
        System.out.println(tailoredtoggle);
        if (tailoredtoggle.contains("OFF")) {
            element(ObjectRepo.Checkbox_Tailored_Services_Toggle).click();
            wait(3);
        }
        soft.assertEquals(tailoredtoggle, "ON", "Tailored Toggle Not Opened");
        String NetworkOptimisationtoggle = element(ObjectRepo.Checkbox_Network_Optimisation_toggle).getText();
        System.out.println(NetworkOptimisationtoggle);
        if (NetworkOptimisationtoggle.contains("OFF")) {
            element(ObjectRepo.Checkbox_Network_Optimisation_toggle).click();
            wait(3);
        }
        soft.assertEquals(NetworkOptimisationtoggle, "ON", "Network Optimisation Toggle Not Opened");
        Utils.waitFor(ObjectRepo.Checkbox_Tailored_Services_Toggle, 2);
        element(ObjectRepo.Checkbox_Tailored_Services_Toggle).click();
        Utils.waitFor(ObjectRepo.id_overlay_header, 2);
        soft.assertTrue(element(ObjectRepo.id_overlay_header).isDisplayed());
        Utils.waitFor(ObjectRepo.id_overlay_closeButton, 2);
        element(ObjectRepo.id_overlay_closeButton).click();
        Utils.waitFor(ObjectRepo.Checkbox_Tailored_Services_Toggle, 2);
        String tailoredtoggle1 = element(ObjectRepo.Checkbox_Tailored_Services_Toggle).getText();
        soft.assertEquals(tailoredtoggle1, "ON", "Tailored Toggle Not Opened");
        Utils.waitFor(ObjectRepo.Checkbox_Tailored_Services_Toggle, 2);
        element(ObjectRepo.Checkbox_Tailored_Services_Toggle).click();
        Utils.waitFor(ObjectRepo.id_overlay_header, 2);
        soft.assertTrue(element(ObjectRepo.id_overlay_header).isDisplayed());
        Utils.waitFor(ObjectRepo.id_overlay_negative_btn, 2);
        element(ObjectRepo.id_overlay_negative_btn).click();
        wait(1);
        String NetworkOptimisationtoggle1 = element(ObjectRepo.Checkbox_Network_Optimisation_toggle).getText();
        soft.assertEquals(NetworkOptimisationtoggle1, "ON", "Network Toggle Not Opened");
        Utils.waitFor(ObjectRepo.Checkbox_Network_Optimisation_toggle, 2);
        element(ObjectRepo.Checkbox_Network_Optimisation_toggle).click();
        Utils.waitFor(ObjectRepo.id_overlay_header, 2);
        soft.assertTrue(element(ObjectRepo.id_overlay_header).isDisplayed());
        Utils.waitFor(ObjectRepo.id_overlay_closeButton, 2);
        element(ObjectRepo.id_overlay_closeButton).click();
        wait(1);
        String tailoredtoggle2 = element(ObjectRepo.Checkbox_Tailored_Services_Toggle).getText();
        soft.assertEquals(tailoredtoggle2, "ON", "Tailored Toggle Not Opened");
        Utils.waitFor(ObjectRepo.Checkbox_Network_Optimisation_toggle, 2);
        element(ObjectRepo.Checkbox_Network_Optimisation_toggle).click();
        Utils.waitFor(ObjectRepo.id_overlay_header, 2);
        soft.assertTrue(element(ObjectRepo.id_overlay_header).isDisplayed());
        Utils.waitFor(ObjectRepo.id_overlay_negative_btn, 2);
        element(ObjectRepo.id_overlay_negative_btn).click();
        wait(1);
        String NetworkOptimisationtoggle2 = element(ObjectRepo.Checkbox_Network_Optimisation_toggle).getText();
        soft.assertEquals(NetworkOptimisationtoggle2, "ON", "Network Toggle Not Opened");
        wait(1);
    }
}