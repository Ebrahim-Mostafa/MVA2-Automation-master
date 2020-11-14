package screens;

import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import common.BaseTest;

public class OpenSpeedChecker extends BaseTest {

    @Test
    public static void openSpeedChecker() throws InterruptedException {

        wait(5);
        Utils.waitFor(ObjectRepo.Button_Menuicon, 5);
        element(ObjectRepo.Button_Menuicon).click();
        Utils.waitFor(ObjectRepo.Name_Sidemenu_Network, 5);
        element(ObjectRepo.Name_Sidemenu_Network).click();
        Utils.waitFor(ObjectRepo.Name_Sidemenu_Speedchecker, 5);
        element(ObjectRepo.Name_Sidemenu_Speedchecker).click();

    }
}