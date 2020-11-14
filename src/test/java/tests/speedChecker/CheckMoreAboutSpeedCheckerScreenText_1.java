package tests.speedChecker;

import common.BaseTest;
import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.OpenSpeedChecker;

import java.io.IOException;

public class CheckMoreAboutSpeedCheckerScreenText_1 extends BaseTest {

    @Test
    public static void CheckMoreAboutSpeedButton() throws InterruptedException, IOException {
        SoftAssert soft = new SoftAssert();

//        OOBEallow.run();
//        GrantDataUsageAccess.run();
        OpenSpeedChecker.openSpeedChecker();
        Utils.waitFor(ObjectRepo.Id_Landing_Primary_button,5);
        element(ObjectRepo.Id_Landing_Primary_button).click();
        wait(30);
        Utils.waitFor(ObjectRepo.Id_test_result_speed_desc,10);
        Utils.waitFor(ObjectRepo.Id_test_result_speed_usage,10);
        Utils.waitFor(ObjectRepo.Id_Test_Result_Time,10);
        Utils.scrollDownTo(ObjectRepo.Id_More_about_btn,5);
        element(ObjectRepo.Id_More_about_btn).click();
        Utils.waitFor(ObjectRepo.Name_More_about_title,5);
        soft.assertEquals(element(ObjectRepo.Name_More_about_title).isEnabled(), true, "More About Speed Checker Page Not Opened");
        soft.assertAll();
    }
}