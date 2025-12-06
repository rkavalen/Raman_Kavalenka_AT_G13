package classwork.day21;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

public class AndroidNativeAppTest {
    public static void main(String[] args) throws URISyntaxException, MalformedURLException, InterruptedException {
        String apkPath = new File("src/test/resources/mobile/hello_app.apk").getAbsolutePath();
        UiAutomator2Options options = new UiAutomator2Options()
                .setApp(apkPath)
                .setDeviceName("Emulator")
                .setAppPackage("school.etys.mobile.hello")
                .setAppActivity("school.etys.mobile.hello.MainActivity");

        AndroidDriver driver = new AndroidDriver(new URI("http://localhost:4723").toURL(), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(AppiumBy.accessibilityId("More options")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@resource-id, 'title')]")).click();

        Thread.sleep(5000);

        System.out.println(driver.getBatteryInfo().getLevel());

//        driver.quit();
    }
}