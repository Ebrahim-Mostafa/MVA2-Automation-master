package tests.privacySettings.Android;

import common.ObjectRepo;
import common.Utils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.OOBEallow;
import screens.GrantDataUsageAccess;
import screens.OpenPrivacy;
import common.BaseTest;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class AfterDisableNetworkAndTailored_1 extends BaseTest {

    @Test
    public static void After_Disable_Network_And_Tailored() throws InterruptedException, IOException {
        SoftAssert soft = new SoftAssert();

        OOBEallow.run();
        GrantDataUsageAccess.run();

        OpenPrivacy.openPrivacy();
        Utils.waitFor(ObjectRepo.Checkbox_Tailored_Services_Toggle, 2);
        String TailoredToggleText = element(ObjectRepo.Checkbox_Tailored_Services_Toggle).getText();
        if (TailoredToggleText.contains("ON")) {
            element(ObjectRepo.Checkbox_Tailored_Services_Toggle).click();
            Utils.waitFor(ObjectRepo.id_overlay_positive_btn, 2);
            soft.assertEquals(element(ObjectRepo.id_overlay_header).isEnabled(), true, "Header Title isn't Displayed");
            soft.assertEquals(element(ObjectRepo.id_overlay_main_description).isEnabled(), true, "Text Description isn't Displayed");
            soft.assertEquals(element(ObjectRepo.id_overlay_closeButton).isEnabled(), true, "Close Button isn't Displayed");
            soft.assertEquals(element(ObjectRepo.id_overlay_negative_btn).isEnabled(), true, "Negative CTA isn't Displayed");
            soft.assertEquals(element(ObjectRepo.id_overlay_positive_btn).isEnabled(), true, "Positive CTA isn't Displayed");
            element(ObjectRepo.id_overlay_positive_btn).click();
            Utils.waitFor(ObjectRepo.Tailored_warning_bubble, 2);
            soft.assertTrue(element(ObjectRepo.Tailored_warning_bubble).isDisplayed());
        }

        //network should be ON
        //delete the Scroll When Running On Samsung-S8
        Utils.scrollDownTo(ObjectRepo.Textarea_privacy_Network_optimisation_Desc, 2);
        String NetworkToggleText = element(ObjectRepo.Checkbox_Network_Optimisation_toggle).getText();
        if (NetworkToggleText.contains("ON")) {
            Utils.waitFor(ObjectRepo.Checkbox_Network_Optimisation_toggle, 2);
            element(ObjectRepo.Checkbox_Network_Optimisation_toggle).click();
            Utils.waitFor(ObjectRepo.id_overlay_positive_btn, 2);
            soft.assertEquals(element(ObjectRepo.id_overlay_header).isEnabled(), true, "Header Title isn't Displayed");
            soft.assertEquals(element(ObjectRepo.id_overlay_main_description).isEnabled(), true, "Text Description isn't Displayed");
            soft.assertEquals(element(ObjectRepo.id_overlay_closeButton).isEnabled(), true, "Close Button isn't Displayed");
            soft.assertEquals(element(ObjectRepo.id_overlay_negative_btn).isEnabled(), true, "Negative CTA isn't Displayed");
            soft.assertEquals(element(ObjectRepo.id_overlay_positive_btn).isEnabled(), true, "Positive CTA isn't Displayed");
            element(ObjectRepo.id_overlay_positive_btn).click();
            soft.assertTrue(element(ObjectRepo.Network_warning_bubble).isDisplayed());
            wait(1);
        }
    }
}