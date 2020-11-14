package tests.networkUsage;

import common.BaseTest;
import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.OOBEdeny;
import screens.OpenNetworkUsage;
import screens.OpenPrivacy;
import screens.OpenSpeedChecker;

import java.io.IOException;

public class CheckBehaviourWhenCheckingOnDontAskAgain_2 extends BaseTest {
/*
      Launch the component with :
            - WI-FI or 3G connection.
            - Device location is ON.
            - App calls & location permission is OFF.
            - Network Optimisation is ON.
            - Data Usage Access is OFF.
*/
    @Test
    public static void CheckBehaviourWhenCheckingOnDontAskAgain() throws InterruptedException, IOException {

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
        element(ObjectRepo.Checkbox_Never_ask_again).click();
        element(ObjectRepo.Button_Deny).click();
        element(ObjectRepo.Checkbox_Never_ask_again).click();
        element(ObjectRepo.Button_Deny).click();
        soft.assertEquals(element(ObjectRepo.id_overlay_header).isEnabled(), true, "Header Title isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_main_description).isEnabled(), true, "Text Description isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_closeButton).isEnabled(), true, "Close Button isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_negative_btn).isEnabled(), true, "Negative CTA isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_positive_btn).isEnabled(), true, "Positive CTA isn't Displayed");
        element(ObjectRepo.id_overlay_negative_btn).click();
        wait(1);
        element(ObjectRepo.id_overlay_negative_btn).click();
        wait(2);
        Utils.waitFor(ObjectRepo.Button_NetworkUsage_Prim_btn, 5);
        soft.assertEquals(element(ObjectRepo.Button_NetworkUsage_Prim_btn).getText(),
                "Change via Android settings", "Button Change via Android Settings in Network Usage Not displayed");
        element(ObjectRepo.Id_landing_back_button).click();
        OpenNetworkUsage.run();
        Utils.waitFor(ObjectRepo.id_overlay_negative_btn, 5);
        element(ObjectRepo.id_overlay_negative_btn).click();
        Utils.waitFor(ObjectRepo.id_overlay_closeButton, 5);
        element(ObjectRepo.id_overlay_closeButton).click();
        wait(2);
        Utils.waitFor(ObjectRepo.Button_NetworkUsage_Prim_btn, 5);
        element(ObjectRepo.Button_NetworkUsage_Prim_btn).click();
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