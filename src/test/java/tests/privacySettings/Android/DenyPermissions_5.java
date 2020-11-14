package tests.privacySettings.Android;

import common.BaseTest;
import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.OpenPrivacy;

import java.io.IOException;

public class DenyPermissions_5 extends BaseTest {

    @Test
    public static void Deny_Permissions() throws InterruptedException, IOException {

        SoftAssert soft = new SoftAssert();
        Utils.setGPSOn();
//        OOBEdeny.run();
        wait(5);
        OpenPrivacy.openPrivacy();
        String tailoredtoggle = element(ObjectRepo.Checkbox_Tailored_Services_Toggle).getText();
        if (tailoredtoggle.contains("ON")) {
            element(ObjectRepo.Checkbox_Tailored_Services_Toggle).click();
            Utils.waitFor(ObjectRepo.id_overlay_positive_btn,2);
            element(ObjectRepo.id_overlay_positive_btn).click();
            wait(3);
        }
        Utils.waitFor(ObjectRepo.Tailored_warning_bubble, 2);
        soft.assertEquals(element(ObjectRepo.Tailored_warning_bubble).isEnabled(), true, "Tailored Bubble isn't Displayed");
        String NetworkOptimisationtoggle = element(ObjectRepo.Checkbox_Network_Optimisation_toggle).getText();
        if (NetworkOptimisationtoggle.contains("ON")) {
            element(ObjectRepo.Checkbox_Network_Optimisation_toggle).click();
            Utils.waitFor(ObjectRepo.id_overlay_positive_btn,2);
            element(ObjectRepo.id_overlay_positive_btn).click();
            wait(3);
        }
        Utils.waitFor(ObjectRepo.Network_warning_bubble, 2);
        soft.assertEquals(element(ObjectRepo.Network_warning_bubble).isEnabled(), true, "Network Bubble isn't Displayed");
        Utils.scrollDownTo(ObjectRepo.Checkbox_Network_Optimisation_toggle,5);
        element(ObjectRepo.Checkbox_Network_Optimisation_toggle).click();
        String NetworkOptimisationtoggle1 = element(ObjectRepo.Checkbox_Network_Optimisation_toggle).getText();
        soft.assertEquals(NetworkOptimisationtoggle1, "ON", "Network Toggle Not Opened");
        soft.assertAll();
    }
}