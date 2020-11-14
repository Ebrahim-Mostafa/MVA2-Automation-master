package tests.networkUsage;

import common.BaseTest;
import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.OOBEallow;
import screens.OOBEdeny;
import screens.OpenNetworkUsage;
import screens.OpenPrivacy;

import java.io.IOException;

public class CheckHeaderSectionNetworkUsageScreenDisplayedAfterDeleteAll_6 extends BaseTest {
    /*
          Launch the component with :
                - WI-FI or 3G connection.
                - Device location is ON.
                - App calls & location permission is ON.
                - Network Optimisation is ON.
                - Data Usage Access is ON.
    */
    @Test
    public static void CheckHeaderSectionNetworkUsageScreenDisplayedAfterDeleteAll() throws InterruptedException, IOException {

        SoftAssert soft = new SoftAssert();
        Utils.setGPSOn();
        Utils.appCenter();
        OOBEallow.run();
        OpenPrivacy.openPrivacy();
        String NetworkOptimisationtoggle = element(ObjectRepo.Checkbox_Network_Optimisation_toggle).getText();
        if (NetworkOptimisationtoggle.contains("OFF")) {
            element(ObjectRepo.Checkbox_Network_Optimisation_toggle).click();
            Utils.waitFor(ObjectRepo.id_overlay_positive_btn, 2);
            element(ObjectRepo.id_overlay_positive_btn).click();
            wait(3);
        }
        OpenNetworkUsage.run();
        Utils.waitFor(ObjectRepo.Button_NetworkUsage_Prim_btn, 5);
        soft.assertEquals(element(ObjectRepo.Button_NetworkUsage_Prim_btn).getText(),
                "Learn more", "Button Learn More in Network Usage Not displayed");
        element(ObjectRepo.Button_NetworkUsage_Prim_btn).click();
        Utils.waitFor(ObjectRepo.Id_Landing_Title, 5);
        wait(5);
        System.out.println(element(ObjectRepo.Id_Landing_Title).getText());
        soft.assertEquals(element(ObjectRepo.Id_Landing_Title).getText(),
                "Privacy Policy", "Privacy Policy Screen Not Opened");

        element(ObjectRepo.Id_landing_back_button).click();
        Utils.waitFor(ObjectRepo.NetworkUsage_wifi_tab, 5);
        element(ObjectRepo.NetworkUsage_wifi_tab).click();
        Utils.scrollDownTo(ObjectRepo.NetworkUsage_clear_Button, 5);
        element(ObjectRepo.NetworkUsage_clear_Button).click();
        Utils.waitFor(ObjectRepo.id_overlay_header, 5);
        soft.assertEquals(element(ObjectRepo.id_overlay_header).isEnabled(), true, "Header Title isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_main_description).isEnabled(), true, "Text Description isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_closeButton).isEnabled(), true, "Close Button isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_negative_btn).isEnabled(), true, "Negative CTA isn't Displayed");
        soft.assertEquals(element(ObjectRepo.id_overlay_positive_btn).isEnabled(), true, "Positive CTA isn't Displayed");
        element(ObjectRepo.id_overlay_negative_btn).click();
        Utils.scrollDownTo(ObjectRepo.NetworkUsage_clear_Button, 5);
        element(ObjectRepo.NetworkUsage_clear_Button).click();
        Utils.waitFor(ObjectRepo.id_overlay_positive_btn, 5);
        element(ObjectRepo.id_overlay_positive_btn).click();
        Utils.waitFor(ObjectRepo.Button_NetworkUsage_Prim_btn, 5);
        element(ObjectRepo.NetworkUsage_network_tab).click();
        soft.assertEquals(element(ObjectRepo.Network_Coverage_Network).getText(),
                "0%", "Network Coverage Should be Equal 0% ");
        soft.assertEquals(element(ObjectRepo.Call_Made_Network).getText(),
                "Total call time 00:00:00", "Calls Made Should be Equal Total call time 00:00:00");
        Utils.scrollDownTo(ObjectRepo.NetworkUsage_clear_Button, 5);
        soft.assertEquals(element(ObjectRepo.Data_Usage_Network).getText(),
                "Total data used 0.0(MB)", "Data Used Should be Equal Total data used 0.0(MB)");
        soft.assertEquals(element(ObjectRepo.Data_Usage_App_Network).getText(),
                "No data has been collected yet, start using your device and we can show you which apps you use the most!",
                "Data Usage Per App is Wrong ");
        Utils.scrollUpTo(ObjectRepo.Button_NetworkUsage_Prim_btn, 5);
        Utils.waitFor(ObjectRepo.NetworkUsage_wifi_tab, 5);
        element(ObjectRepo.NetworkUsage_wifi_tab).click();
        Utils.waitFor(ObjectRepo.Wifi_Usage_WIFI, 5);
        soft.assertEquals(element(ObjectRepo.Wifi_Usage_WIFI).getText(),
                "Total data used 0.0(MB)", "Wifi Usage Should be Equal Total data used 0.0(MB)");
        soft.assertAll();
    }
}