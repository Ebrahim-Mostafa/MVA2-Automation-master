package common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import screens.OOBEallow;
import screens.OpenPrivacy;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static common.BaseTest.*;

public class Utils {

    public static String utils = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "java" + File.separator + "common" + File.separator;

    static boolean isWindows = System.getProperty("os.name")
            .toLowerCase().startsWith("windows");

    public static void scrollDownTo(By element, int timeout) {
        long TimeMillis = System.currentTimeMillis();
        long startTime = TimeUnit.MILLISECONDS.toSeconds(TimeMillis);
        long currentTime = startTime;
        boolean isDisplayed = false;
        int pressX = 0;
        int topY = 0;
        int bottomY = 0;
        while (currentTime < startTime + timeout) {
            try {
                pressX = BaseTest.driver.manage().window().getSize().width / 2;
                bottomY = BaseTest.driver.manage().window().getSize().height;
                topY = BaseTest.driver.manage().window().getSize().height;
                isDisplayed = BaseTest.driver.findElement(element).isDisplayed();
                if (!isDisplayed) {
                    throw new NoSuchElementException("Element Not Displayed");
                }
                currentTime = TimeUnit.MILLISECONDS.toSeconds(TimeMillis);
                if (isDisplayed) {
                    break;
                }
            } catch (NoSuchElementException e) {
                TouchAction touchAction = new TouchAction(BaseTest.driver);
                switch (platform) {
                    case "native-android": {
                        touchAction.press(PointOption.point(pressX, bottomY * 4 / 5)).waitAction()
                                .moveTo(PointOption.point(pressX, topY * 40 / 100)).release().perform();
                    }
                    break;
                    case "native-ios": {
                        touchAction.longPress(PointOption.point(pressX, bottomY * 4 / 5)).waitAction()
                                .moveTo(PointOption.point(pressX, (int) (topY * 45.7 / 100))).release().perform();
                    }
                    break;
                }
                currentTime = TimeUnit.MILLISECONDS.toSeconds(TimeMillis);
                if (currentTime > startTime + timeout) {
                    throw e;
                }
            }
        }
    }

    public static void scrollUpTo(By element, int timeout) {
        long TimeMillis = System.currentTimeMillis();
        long startTime = TimeUnit.MILLISECONDS.toSeconds(TimeMillis);
        long currentTime = startTime;
        boolean isDisplayed = false;
        int pressX = 0;
        int topY = 0;
        int bottomY = 0;
        while (currentTime < startTime + timeout) {
            try {
                pressX = BaseTest.driver.manage().window().getSize().width / 2;
                bottomY = BaseTest.driver.manage().window().getSize().height;
                topY = BaseTest.driver.manage().window().getSize().height;
                isDisplayed = BaseTest.driver.findElement(element).isDisplayed();
                if (!isDisplayed) {
                    throw new NoSuchElementException("Element Not Displayed");
                }
                currentTime = TimeUnit.MILLISECONDS.toSeconds(TimeMillis);
                if (isDisplayed) {
                    break;
                }
            } catch (NoSuchElementException e) {
                TouchAction touchAction = new TouchAction(BaseTest.driver);
                switch (platform) {
                    case "native-android": {
                        touchAction.press(PointOption.point(pressX, bottomY * 40 / 100)).waitAction()
                                .moveTo(PointOption.point(pressX, topY * 4 / 5)).release().perform();
                    }
                    break;
                    case "native-ios": {
                        touchAction.longPress(PointOption.point(pressX, bottomY * 46 / 100)).waitAction()
                                .moveTo(PointOption.point(pressX, (int) (topY * 4 / 5))).release().perform();
                    }
                    break;
                }
                currentTime = TimeUnit.MILLISECONDS.toSeconds(TimeMillis);
                if (currentTime > startTime + timeout) {
                    throw e;
                }
            }
        }
    }

    public static void executeCMD(String command, String location) throws IOException, InterruptedException {
        ProcessBuilder builder = new ProcessBuilder();
        if (isWindows) {
            builder.command("cmd.exe", "/c", command);
        } else {
            builder.command("sh", "-c", command);
        }
        try {
            builder.directory(new File(utils + location));
            Process process = builder.start();
            StreamGobbler streamGobbler = new StreamGobbler(process.getInputStream(), System.out::println);
            Executors.newSingleThreadExecutor().submit(streamGobbler);
            int exitCode = process.waitFor();
            assert exitCode == 0;
        } catch (AssertionError error) {
            error.printStackTrace();

        }

    }

    public static void setEnv(String key, String value) {
        ProcessBuilder pb = new ProcessBuilder();
        Map<String, String> envMap = pb.environment();
        envMap.put(key, value);

    }

    public static void waitFor(By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(BaseTest.driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public static void checkInVisibleElement(By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(BaseTest.driver, timeout);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
    }

    public static void executeCMD(String command) throws IOException, InterruptedException {
        ProcessBuilder builder = new ProcessBuilder();
        if (isWindows) {
            builder.command("cmd.exe", "/c", command);
        } else {
            builder.command("sh", "-c", command);
        }
        try {
            Process process = builder.start();
            StreamGobbler streamGobbler = new StreamGobbler(process.getInputStream(), System.out::println);
            Executors.newSingleThreadExecutor().submit(streamGobbler);
            int exitCode = process.waitFor();
            assert exitCode == 0;
        } catch (AssertionError error) {
            error.printStackTrace();
        }
    }

    public static void setGPSOn() throws IOException, InterruptedException {

//        driver.startActivity("com.android.settings", ".Settings");
//        System.out.println(driver.currentActivity());
//        driver.scrollTo(“Location”);
//        driver.findElement(By.name(“Location”)).click();
//        driver.findElement(By.className(“android.widget.Switch”)).click();

        Utils.executeCMD("adb shell settings put secure location_providers_allowed +gps");
    }

    public static void setGPSOFF() throws IOException, InterruptedException {
        Utils.executeCMD("adb shell settings put secure location_providers_allowed -gps");
    }

    //enable/disable Wifi &data on Android
    public static void setDataOn() throws IOException, InterruptedException {
        Utils.executeCMD("adb shell svc data enable");
    }

    public static void setDataOff() throws IOException, InterruptedException {
        Utils.executeCMD("adb shell svc data disable");
    }

    public static void setWifiOn() throws IOException, InterruptedException {
        //  Utils.executeCMD("adb shell am broadcast -a io.appium.settings.wifi --es setstatus enable");
        Utils.executeCMD("adb shell svc wifi enable");
    }

    public static void setWifiOff() throws IOException, InterruptedException {
//        Utils.executeCMD("adb shell svc wifi disable");
        Utils.executeCMD("adb shell am start -a android.intent.action.MAIN -n com.android.settings/.wifi.WifiSettings");
        element(ObjectRepo.Wifi_toggle).click();
    }

    // To Kill The App with No Reset ->>active on android only
    public static void KillApp() throws InterruptedException, IOException {
        switch (platform) {
            case "native-android":
            case "native-ios": {
                BaseTest.driver.closeApp();
            }
            break;
            default:
                break;
        }
    }

    // To Re Open The App with No Reset : please note that the iOS app can't be Reset
    public static void ReOpenApp() throws InterruptedException, IOException {
        switch (platform) {
            case "native-android": {
                BaseTest.driver.activateApp("com.vfg.referenceapp." + BaseTest.build);
                Thread.sleep(2000);
            }
            break;
            case "native-ios": {
                BaseTest.driver.launchApp();
                Thread.sleep(1000);
            }
            break;
            default:
                break;
        }
    }

    //IOS settings Wifi & Data
    public static void setWifiOffIos() throws IOException, InterruptedException {
        BaseTest.driver.activateApp("com.apple.Preferences");
        Utils.waitFor(ObjectRepo.tapWifiIos, 10);
        element(ObjectRepo.tapWifiIos).click();
        Utils.waitFor(ObjectRepo.tapWifiIosToggle, 10);

        System.out.println("WIFI Toggle Value Is = " + element(ObjectRepo.tapWifiIosToggle).getAttribute("value"));
        String wifiToggleValue = element(ObjectRepo.tapWifiIosToggle).getAttribute("value");
        if (wifiToggleValue.equals("1")) {
            element(ObjectRepo.tapWifiIosToggle).click();
            element(ObjectRepo.tapBackIosBtn).click();
            System.out.println("wifi is now Disabled");
        } else {
            System.out.println("Wifi Toggle is already disabled");
        }
    }

    public static void setDataOnIos() throws IOException, InterruptedException {
        BaseTest.driver.activateApp("com.apple.Preferences");
        Utils.waitFor(ObjectRepo.tapDataIos, 10);
        element(ObjectRepo.tapDataIos).click();
        Utils.waitFor(ObjectRepo.tapDataIosToggle, 10);

        System.out.println("Data Toggle Value Is = " + element(ObjectRepo.tapDataIosToggle).getAttribute("value"));
        String dataToggleValue = element(ObjectRepo.tapDataIosToggle).getAttribute("value");
        if (dataToggleValue.equals("0")) {
            element(ObjectRepo.tapDataIosToggle).click();
            element(ObjectRepo.tapBackIosBtn).click();
            System.out.println("Data is now enabled");
        } else {
            System.out.println("Data Toggle is already enaled");
        }
    }

    public static boolean trustApp() throws IOException, InterruptedException {
        BaseTest.driver.activateApp("com.apple.Preferences");
        Thread.sleep(3000);
        Utils.scrollDownTo(ObjectRepo.GeneralSetting, 15000);
        element(ObjectRepo.GeneralSetting).click();
        Utils.scrollDownTo(ObjectRepo.deviceManagment, 15000);
        element(ObjectRepo.deviceManagment).click();
        Utils.waitFor(ObjectRepo.developerAccount, 10);
        element(ObjectRepo.developerAccount).click();
        try {
            Utils.waitFor(ObjectRepo.trust, 10);
            String trust = element(ObjectRepo.trust).getText();
            if (trust == "Trust “Vodafone International Services LLC”") {
                element(ObjectRepo.trust).click();
                Utils.waitFor(ObjectRepo.trustBtn, 10);
                element(ObjectRepo.trustBtn).click();
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void clear(By element) throws IOException {
        switch (platform) {
            case "native-android":
            case "react-android": {
                element(element).clear();
            }
            break;
            case "native-ios":
            case "react-ios": {
                int Length = element(element).getAttribute("value").length();
                System.out.println(Length);
                for (int i = 0; i < Length; i++) {
                    element(ObjectRepo.deleteBtn).click();
                }
            }
            break;
            default:
                System.out.println("Can't Clear");
                break;
        }
    }

    public static void screenSwipe() {
        TouchAction touchAction = new TouchAction(BaseTest.driver);
        int pressX = BaseTest.driver.manage().window().getSize().width / 2;
        int bottomY = BaseTest.driver.manage().window().getSize().height;
        int topY = BaseTest.driver.manage().window().getSize().height;
        switch (platform) {
            case "native-android": {
                touchAction.press(PointOption.point(pressX, bottomY * 3 / 4)).waitAction()
                        .moveTo(PointOption.point(pressX, topY * 1 / 4)).release().perform();
            }
            break;
            case "native-ios": {
                touchAction.longPress(PointOption.point(pressX, bottomY * 3 / 4)).waitAction()
                        .moveTo(PointOption.point(pressX, (int) (topY * 1 / 4))).release().perform();
            }
            break;
        }
    }

    public static void swipeHorizontal(By element, String direction) {

        int StartX = 0;
        int StartY = 0;
        int EndX = 0;
        int EndY = 0;
        TouchAction touchAction = new TouchAction(driver);
        switch (direction) {
            case "right":
                StartX = element(element).getLocation().getX();
                StartY = element(element).getLocation().getY();
                EndY = element(element).getLocation().getY();
                EndX = element(element).getLocation().getX() + 300;
                touchAction.longPress(PointOption.point(StartX, StartY))
                        .moveTo(PointOption.point(EndX, EndY)).release().perform();
                break;
            case "left":
                StartX = element(element).getLocation().getX();
                StartY = element(element).getLocation().getY();
                EndY = element(element).getLocation().getY();
                EndX = element(element).getLocation().getX() - 300;
                touchAction.longPress(PointOption.point(StartX, StartY))
                        .moveTo(PointOption.point(EndX, EndY)).release().perform();
                break;
        }
    }

    public static void enableNetwork() throws InterruptedException {
        OpenPrivacy.openPrivacy();
        String NetworkOptimisationtoggle = element(ObjectRepo.Checkbox_Network_Optimisation_toggle).getText();
        if (NetworkOptimisationtoggle.contains("OFF")) {
            element(ObjectRepo.Checkbox_Network_Optimisation_toggle).click();
            driver.navigate().back();
        }
    }

    //if the speed test facing issues and not completed
    public static void handleSpeedTestError() {
        if (element(ObjectRepo.Id_test_Not_Complete_Overlay_positive_Button).isDisplayed()) {
            do {
                element(ObjectRepo.Id_test_Not_Complete_Overlay_positive_Button).click();
            } while (element(ObjectRepo.Id_test_Not_Complete_Overlay_positive_Button).isDisplayed());
        }
    }

    public static void appCenter() throws IOException, InterruptedException {
        switch (platform) {
            case "native-android":
                try {
                    Thread.sleep(15000);
                    Utils.waitFor(ObjectRepo.TC_text, 10);
                } catch (Exception e) {
                    executeCMD("adb shell input keyevent KEYCODE_BACK");
                }
                try {
                    Utils.waitFor(ObjectRepo.TC_text, 10);
                } catch (Exception e) {
                    executeCMD("adb shell input keyevent KEYCODE_BACK");
                }
                break;
            case "native-ios":
                try {
                    Thread.sleep(5000);
                    Utils.waitFor(ObjectRepo.TC_text, 10);
                } catch (Exception e) {
                    element(By.id("Continue")).click();
                    Thread.sleep(5000);

                }
            default:
                break;
        }
    }

}


