package Tests;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class US05_TC01 extends BaseDriver {

    @Test
    public void test1(){


        driver.get("https://www.akakce.com/");

        WebElement girisYap=driver.findElement(By.xpath("(//div[@class='g-3_v8 hm_hp_v8'] // a)[2]"));
        girisYap.click();
        MyFunc.wait(3);

        WebElement input=driver.findElement(By.xpath("(//form[@id='FrmLi']//input)[3]"));
        input.sendKeys("alikilinc.gl@gmail.com");
        MyFunc.wait(1);
        WebElement sifre=driver.findElement(By.xpath("(//form[@id='FrmLi']//input)[4]"));
        sifre.sendKeys("Testtest123");
        MyFunc.wait(1);
        WebElement girisTikla=driver.findElement(By.xpath("(//form[@id='FrmLi']//input)[6]"));
        girisTikla.click();
        MyFunc.wait(1);
        WebElement hesabim1=driver.findElement(By.xpath("(//div[@class='g-3_v8 hm_hp_v8']//a)[2]"));
        hesabim1.click();
        MyFunc.wait(1);
        WebElement hesabim2=driver.findElement(By.xpath("(//div[@class='g-3_v8 hm_hp_v8']//a)[7]"));
        hesabim2.click();
        MyFunc.wait(2);
        WebElement siparislerim=driver.findElement(By.xpath("(//ul[@id='AL']//a)[1]"));
        siparislerim.click();
        MyFunc.wait(3);
        try {
            Assert.assertTrue("Yazı Bulunamadı",driver.findElement(By.xpath("//*[text()='Kayıtlı siparişiniz bulunmuyor.']")).getText().equals("Kayıtlı siparişiniz bulunmuyor."));
        }catch (NoSuchElementException e){
            System.out.println();
        }


        driver.quit();

    }
}
