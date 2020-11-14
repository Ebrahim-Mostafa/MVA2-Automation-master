package screens;

import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import common.BaseTest;

public class GrantDataUsageAccess extends BaseTest {

    @Test
    public static void run() throws InterruptedException {

//        Utils.waitFor( ObjectRepo.Usage_Access_prim_button,13);
        element(ObjectRepo.Usage_Access_prim_button).click();
        wait(1);
        Utils.scrollDownTo(ObjectRepo.Usage_Data_Access_appname,5);
        wait(1);
        element(ObjectRepo.Usage_Data_Access_appname).click();
        wait(1);
        element(ObjectRepo.Button_Usage_Access_Toggle).click();
        wait(1);
    }
}