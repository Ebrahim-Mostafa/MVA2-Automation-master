package screens;

import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import common.BaseTest;

public class OpenNetworkUsage extends BaseTest {

    @Test
    public static void run() {

        Utils.waitFor(ObjectRepo.Button_Menuicon, 5);
        element(ObjectRepo.Button_Menuicon).click();
        Utils.waitFor(ObjectRepo.Name_Sidemenu_Network, 5);
        element(ObjectRepo.Name_Sidemenu_Network).click();
        Utils.waitFor(ObjectRepo.Name_Sidemenu_NetworkUsage, 5);
        element(ObjectRepo.Name_Sidemenu_NetworkUsage).click();
        Utils.waitFor(ObjectRepo.Id_Landing_Primary_button,5);

    }
}