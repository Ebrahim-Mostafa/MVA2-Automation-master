package tests.networkUsage;

import common.BaseTest;
import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.OOBEallow;
import screens.OpenNetworkUsage;
import screens.OpenPrivacy;

import java.io.IOException;

public class CheckProgressBarNetworkCoverageAndInternetConnectivityinFullState_9 extends BaseTest {
    /*
          Launch the component with :
                - WI-FI or 3G connection.
                - Device location is ON.
                - App calls & location permission is ON.
                - Network Optimisation is ON.
                - Data Usage Access is Empty.
    */
    @Test
    public static void CheckProgressBarNetworkCoverageAndInternetConnectivityinFullState() throws InterruptedException, IOException {

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
        soft.assertEquals(element(ObjectRepo.Network_Coverage_Network).getText(),
                "0%", "Network Coverage Should be Equal 100% ");
        soft.assertEquals(element(ObjectRepo.Internet_Connectivity_Network).getText(),
                "0%", "Internet Coverage Should be Equal 100% ");
        soft.assertAll();
    }
}