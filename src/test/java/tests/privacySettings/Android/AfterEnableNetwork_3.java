package tests.privacySettings.Android;

import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.*;
import common.BaseTest;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AfterEnableNetwork_3 extends BaseTest {
    /**
     * "Pre-Condition:
     * 1- launch app with internet connection
     * 2- Device location is ON
     * 3- App location permission is ON
     * 4- Phone permission is ON
     * 5- Tailored services toggle is OFF
     * 6- Network optimization toggle is OFF"
     **/
    @Test
    public static void After_Enable_Network() throws InterruptedException, IOException {
        SoftAssert soft = new SoftAssert();
        Utils.setGPSOn();
        OOBEallow.run();
        GrantDataUsageAccess.run();
        OpenPrivacy.openPrivacy();
        String TailoredToggleText = element(ObjectRepo.Checkbox_Tailored_Services_Toggle).getText();
        String NetworkToggleText = element(ObjectRepo.Checkbox_Network_Optimisation_toggle).getText();

        //Assert Tailored and network Toggles are OFF with Warning Bubbles
        soft.assertEquals(TailoredToggleText, "OFF", "Tailored Toggle is still open");
        soft.assertEquals(NetworkToggleText, "OFF", "Network Optimization Toggle is still open");
        soft.assertTrue(element(ObjectRepo.Tailored_warning_bubble).isDisplayed(), "Tailored Bubble is Not Exist");
        soft.assertTrue(element(ObjectRepo.Network_warning_bubble).isDisplayed(), "Network Bubble is Not Exist");

        // enable Network and check Tailored is Still OFF
        if (NetworkToggleText.contains("OFF")) {
            element(ObjectRepo.Checkbox_Network_Optimisation_toggle).click();
            wait(2);
            soft.assertEquals(NetworkToggleText, "ON", "Network Optimization Toggle is still OFF");
            soft.assertFalse(element(ObjectRepo.Network_warning_bubble).isDisplayed(), "Network Bubble is still Exist");
            soft.assertEquals(NetworkToggleText, "OFF", "Network Optimization Toggle is Opened");

        }
        if (TailoredToggleText.contains("OFF")) {
            element(ObjectRepo.Checkbox_Network_Optimisation_toggle).click();
            wait(2);
            soft.assertEquals(TailoredToggleText, "ON", "Tailored Toggle is still OFF");
            soft.assertTrue(element(ObjectRepo.Tailored_warning_bubble).isDisplayed(), "Tailored Bubble is Still Exist");
            //Assert Toast
            // Toast is not Displayed

        }
        OpenSpeedChecker.openSpeedChecker();
        wait(1);
    }
}