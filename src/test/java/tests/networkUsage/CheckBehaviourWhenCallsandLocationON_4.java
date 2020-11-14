package tests.networkUsage;

import common.BaseTest;
import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.OOBEdeny;
import screens.OpenNetworkUsage;
import screens.OpenPrivacy;

import java.io.IOException;

public class CheckBehaviourWhenCallsandLocationON_4 extends BaseTest {
/*
      Launch the component with :
            - WI-FI or 3G connection
            - Device location is ON
            - App calls & location permission is OFF.
            - Network Optimisation is ON.
            - Data Usage Access is OFF.
*/
    @Test
    public static void CheckBehaviourWhenCallsLocationON() throws InterruptedException, IOException {

        SoftAssert soft = new SoftAssert();
        Utils.setGPSOn();
        Utils.appCenter();
        OOBEdeny.run();
        OpenPrivacy.openPrivacy();
        String NetworkOptimisationtoggle = element(ObjectRepo.Checkbox_Network_Optimisation_toggle).getText();
        if (NetworkOptimisationtoggle.contains("OFF")) {
            element(ObjectRepo.Checkbox_Network_Optimisation_toggle).click();
            Utils.waitFor(ObjectRepo.id_overlay_positive_btn, 2);
            element(ObjectRepo.id_overlay_positive_btn).click();
            wait(3);
        }
        OpenNetworkUsage.run();
        Utils.waitFor(ObjectRepo.Button_Allow, 5);
        element(ObjectRepo.Button_Allow).click();
        Utils.waitFor(ObjectRepo.Button_Allow, 5);
        element(ObjectRepo.Button_Allow).click();
        Utils.waitFor(ObjectRepo.id_overlay_header,5);
        soft.assertEquals(element(ObjectRepo.id_overlay_header).isEnabled(), true, "Header Title isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_main_description).isEnabled(), true, "Text Description isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_closeButton).isEnabled(), true, "Close Button isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_negative_btn).isEnabled(), true, "Negative CTA isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_positive_btn).isEnabled(), true, "Positive CTA isn't Displayed");
        element(ObjectRepo.id_overlay_positive_btn).click();
        wait(2);
        Utils.scrollDownTo(ObjectRepo.Usage_Data_Access_appname, 5);
        wait(1);
        element(ObjectRepo.Usage_Data_Access_appname).click();
        wait(1);
        element(ObjectRepo.Button_Usage_Access_Toggle).click();
        wait(1);
        Utils.ReOpenApp();
        OpenNetworkUsage.run();
        soft.assertEquals(element(ObjectRepo.Button_NetworkUsage_Prim_btn).getText(),
                "Learn more", "Button Learn More in Network Usage Not displayed");
        soft.assertAll();
    }
}