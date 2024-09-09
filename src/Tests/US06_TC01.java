package Tests;

import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class US06_TC01 extends BaseDriver {
    @Test
    public void TC0601() {
        driver.get("https://www.akakce.com/");
        driver.findElement(By.xpath("//div[@id='H_rl_v8']//a[text()='Giriş Yap']")).click();
        MyFunc.wait(1);
        driver.findElement(By.xpath("//input[@id='life']")).sendKeys("alikilinc.gl@gmail.com");
        MyFunc.wait(1);
        driver.findElement(By.xpath("//input[@id='lifp']")).sendKeys("Testtest123");
        MyFunc.wait(1);
        driver.findElement(By.xpath("//input[@id='lfb']")).click();
        MyFunc.wait(1);
        driver.findElement(By.xpath("//a[@id='H_a_v8']")).click();
        MyFunc.wait(1);
        driver.findElement(By.xpath("//a[text()='Hesabım']")).click();
        MyFunc.wait(1);
        driver.findElement(By.xpath("//a[text()='Mesajlarım']")).click();
        MyFunc.wait(1);

        try {
            Assert.assertTrue("Mesaj bulunamadı yazısı doğrulanamadı.", driver.findElement(By.xpath("//div[@class='wbb_v8']//p")).getText().equals("Listelenecek mesaj bulunamadı."));
        }catch (NoSuchElementException e){
            MyFunc.wait(1);
        }
        MyFunc.wait(1);

        tearDown();

    }
}
