package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;

    static {
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));//20sn mühlet: sayfayı yükleme mühleti
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//20sn mühlet: elementi bulma mühleti
        driver.manage().window().maximize();
    }

    public static void tearDown() {
        MyFunc.wait(3);
        driver.quit();
    }

}