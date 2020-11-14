package screens;

import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import common.BaseTest;

public class OOBEallow extends BaseTest {

    @Test
    public static void run() throws InterruptedException {

        wait(7);
        Utils.scrollDownTo(ObjectRepo.Button_Confirm_TC, 5);
        element(ObjectRepo.Button_Confirm_TC).click();
        Utils.waitFor(ObjectRepo.Button_Allow, 5);
        element(ObjectRepo.Button_Allow).click();
        Utils.waitFor(ObjectRepo.Button_Allow, 5);
        element(ObjectRepo.Button_Allow).click();
        wait(1);
//        if (platformVersion >= 9) {
////        if (platformVersion.contains("8") || platform.contains("9")) {
//            element(ObjectRepo.Button_Allow).click();
//        }
    }
}