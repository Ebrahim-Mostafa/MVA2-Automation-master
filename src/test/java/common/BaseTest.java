package common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;


abstract public class BaseTest {

    public static AppiumDriver<?> driver;
    public static String platform;
    public static String deviceName;
    public static String build;
    public static int platformVersion;


    public static void init(String platform, String deviceName, String build, int platformVersion) {
        BaseTest.platform = platform;
        BaseTest.deviceName = deviceName;
        BaseTest.platformVersion = platformVersion;
        BaseTest.build = build;
        ObjectRepo.objectRepo(platform, build);
    }

    @BeforeSuite
    @Parameters({"platform", "DEVICE_NAME", "build", "platformVersion"})
    public static void setUpBeforeClass(String platform, String deviceName, String build, int platformVersion) throws Exception {
        init(platform, deviceName, build, platformVersion);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    public static WebElement element(By element) {
        return driver.findElement(element);

    }

    public RemoteWebElement remoteElement(By element) {
        return (RemoteWebElement) driver.findElement(element);
    }

    //Local
    @BeforeClass
    @Parameters({"APPIUM_VERSION", "PLATFORM_VERSION", "PLATFORM_NAME", "AUTOMATION_NAME", "DEVICE_NAME", "udid", "appActivity", "appPackage", "bundleId", "host"})
    public static void setUp(String APPIUM_VERSION,
               String PLATFORM_VERSION,
               String PLATFORM_NAME,
               String AUTOMATION_NAME,
               String DEVICE_NAME,
               String udid,
               String appActivity,
               String appPackage,
               String bundleId,
               String host) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, APPIUM_VERSION);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AUTOMATION_NAME);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
        capabilities.setCapability("udid", udid);
        capabilities.setCapability("appActivity", appActivity);
        capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("bundleId", bundleId);
        capabilities.setCapability("unicodeKeyboard", true);
        capabilities.setCapability("resetkeyboard", false);
        capabilities.setCapability("noReset", false);
        capabilities.setCapability("newCommandTimeout", 9000);
        capabilities.setCapability("adbExecTimeout", 15000);
        driver = new AppiumDriver<>(new URL(host), capabilities);
    }

    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }


    public static void wait(int sec) throws InterruptedException {
        Thread.sleep(sec * 1000);
    }

}