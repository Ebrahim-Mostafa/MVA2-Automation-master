package tests.speedChecker;

import common.BaseTest;
import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.OOBEallow;
import screens.OpenSpeedChecker;

import java.io.IOException;

public class CheckTextsWithNoPreviousTestResut_6 extends BaseTest {
    /**
     * "launching the app with :-
     *  - optmization network permissions is enabled.
     * - location services of device permissions is enabled.
     * - 1st time visit / no previous speed test results"
     */
    @Test
    public static void checkTextsWithNoPreviousTestResut() throws InterruptedException, IOException {
        SoftAssert soft = new SoftAssert();
//        OOBEallow.run();
        Utils.enableNetwork();
        OpenSpeedChecker.openSpeedChecker();
        soft.assertTrue(element(ObjectRepo.Id_Landing_Title).getText().contains("Speed checker"),"Speed Checker Title is Wrong");
        soft.assertTrue(element(ObjectRepo.Id_Landing_Description_text).getText().contains("Check your network or Wi-Fi speed now"),
                "Speed Checker Description is Wrong");
        soft.assertTrue(element(ObjectRepo.Id_Landing_Primary_button).getText().contains("Start test"),"Start Test Button is Wrong");
        soft.assertTrue(element(ObjectRepo.name_previous_results_network_tab).isDisplayed(),"Network Tab Result is not Displayed");
        soft.assertTrue(element(ObjectRepo.name_previous_results_network_tab).getAttribute("label").contains("Network"),"Network Tab Text is Wrong");
        soft.assertTrue(element(ObjectRepo.name_previus_results_wifi_tab).isDisplayed(),"Wi-Fi Tab Result is not Displayed");
        soft.assertTrue(element(ObjectRepo.name_previus_results_wifi_tab).getText().contains("Wi-Fi"),"Wi-Fi Tab is Wrong");
        soft.assertTrue(element(ObjectRepo.id_previous_results_no_tests_text).getText().contains("No speed tests"),
                "No previous speed test results is Wrong");
        soft.assertAll();
    }
}