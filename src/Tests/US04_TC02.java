package Tests;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US04_TC02 extends BaseDriver {
    @Test

    public void test1() {


        driver.get("https://www.akakce.com/");
        MyFunc.wait(2);

        WebElement girisYap = driver.findElement(By.xpath("//div[@id= 'H_rl_v8']/a[2]"));
        girisYap.click();
        MyFunc.wait(3);

        WebElement emailBilgisi = driver.findElement(By.xpath("(//form[@action='/akakcem/nojs/']//input)[6]"));
        emailBilgisi.sendKeys("alikilinc.gl@gmail.com");
        MyFunc.wait(3);

        WebElement sifreBilgisi = driver.findElement(By.xpath("(//form[@action='/akakcem/nojs/']//input)[7]"));
        sifreBilgisi.sendKeys("YanlisSifre");
        MyFunc.wait(3);


        WebElement girisYapButonu = driver.findElement(By.xpath("(//form[@action='/akakcem/nojs/']//input)[9]"));
        girisYapButonu.click();
        MyFunc.wait(3);

        driver.quit();
    }


    }
