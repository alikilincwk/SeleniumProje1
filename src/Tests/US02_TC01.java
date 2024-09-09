package Tests;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class US02_TC01 extends BaseDriver {
    @Test
    public void TC0201() {
        String dataName = "Testisim";
        driver.get("https://www.akakce.com/");
        driver.findElement(By.xpath("//div[@id='H_rl_v8']//a[text()='Giriş Yap']")).click();
        MyFunc.wait(1);
        driver.findElement(By.xpath("//input[@id='life']")).sendKeys("alikilinc.gl@gmail.com");
        MyFunc.wait(1);
        driver.findElement(By.xpath("//input[@id='lifp']")).sendKeys("Testtest123");
        MyFunc.wait(1);
        driver.findElement(By.xpath("//input[@id='lfb']")).click();
        MyFunc.wait(1);
        try {
            Assert.assertTrue(driver.findElement(By.xpath("(//div[@id='HM_v8']//a[@href='/akakcem/'])[1]")).getText().equals(dataName));
        } catch (NoSuchElementException e) {
            System.out.println("İsim bilgisi eşleşmiyor.");
        }
        tearDown();
    }
}
