package screens;

import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import common.BaseTest;

public class OOBEdeny extends BaseTest {

    @Test
    public static void run() throws InterruptedException {
            Utils.waitFor(ObjectRepo.Button_Confirm_TC,4);
//        wait(5);
        Utils.scrollDownTo(ObjectRepo.Button_Confirm_TC, 5);
        element(ObjectRepo.Button_Confirm_TC).click();
        Utils.waitFor(ObjectRepo.Button_Deny, 5);
        element(ObjectRepo.Button_Deny).click();
        wait(1);
        element(ObjectRepo.Button_Deny).click();
        wait(1);
        if (platformVersion >= 8) {
            element(ObjectRepo.Button_Deny).click();

        }
    }
}