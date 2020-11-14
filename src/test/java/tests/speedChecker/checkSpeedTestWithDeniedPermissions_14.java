package tests.speedChecker;

import common.BaseTest;
import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.OOBEallow;
import screens.OOBEdeny;
import screens.OpenSpeedChecker;

import java.io.IOException;

public class checkSpeedTestWithDeniedPermissions_14 extends BaseTest {
    /**
     "*Launch the component.
     1- Connect using wi-fi.
     Network Optimization is off
     Device location is disabled
     App native permission are denied for both
     Data usage access is allowed"
     */
    @Test
    public static void checkTextsWithNoPreviousTestResut() throws InterruptedException, IOException {
        SoftAssert soft = new SoftAssert();
//        Utils.setGPSOFF();
//        Utils.setWifiOn();
        OOBEdeny.run();
        OpenSpeedChecker.openSpeedChecker();
        soft.assertTrue(element(ObjectRepo.id_overlay_positive_btn).isDisplayed());
        soft.assertTrue(element(ObjectRepo.id_overlay_negative_btn).isDisplayed());
        element(ObjectRepo.id_overlay_negative_btn).click();
        element(ObjectRepo.Button_Deny).click();
        element(ObjectRepo.Button_Deny).click();
        element(ObjectRepo.Button_Deny).click();
        soft.assertTrue(element(ObjectRepo.id_overlay_negative_btn).isDisplayed());
        element(ObjectRepo.Id_Landing_Primary_button).click();
        element(ObjectRepo.Checkbox_Network_Optimisation_toggle).click();
        driver.navigate().back();
        element(ObjectRepo.id_overlay_negative_btn).click();
        element(ObjectRepo.Button_Deny).click();
        element(ObjectRepo.Button_Deny).click();
        element(ObjectRepo.Button_Deny).click();
        element(ObjectRepo.Id_Landing_Primary_button).click();









        soft.assertAll();
    }
}