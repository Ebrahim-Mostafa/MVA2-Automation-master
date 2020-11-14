package screens;

import common.ObjectRepo;
import common.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;
import common.BaseTest;

public class OpenPrivacy extends BaseTest {

    @Test
    public static void openPrivacy() throws InterruptedException {

        wait(7);
        element(ObjectRepo.Button_Menuicon).click();
        wait(2);
        Utils.waitFor(ObjectRepo.Name_Sidemenu_Settings, 5);
        element(ObjectRepo.Name_Sidemenu_Settings).click();
        wait(2);
        Utils.waitFor(ObjectRepo.Button_Privacy, 5);
        element(ObjectRepo.Button_Privacy).click();
    }
}