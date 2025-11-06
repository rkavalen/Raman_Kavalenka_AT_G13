package classwork.day16;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Screen {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");

        File asfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

//        FileUtils.copyFile(asfile, new File("pic.png"));

        /**
         * <!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
         * <dependency>
         *     <groupId>commons-io</groupId>
         *     <artifactId>commons-io</artifactId>
         *     <version>2.20.0</version>
         * </dependency>
         */

        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://www.onliner.by/");

        byte[] asBytes = ((TakesScreenshot) driver2).getScreenshotAs(OutputType.BYTES);

        Files.write(Paths.get("pico.png"), asBytes);
    }
}