package Tests;

import Utility.BaseDriver;
import Utility.MyFunc;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class US03_TC01 extends BaseDriver {

    @Test
    public void TC_0301() {

        driver.get("https://www.akakce.com/");
        MyFunc.wait(2);

        WebElement girisyapBtn = driver.findElement(By.xpath("//a[@href='/akakcem/giris/']"));
        girisyapBtn.click();
        MyFunc.wait(2);

        WebElement ePostaBtn = driver.findElement(By.xpath("//input[@type='email' and @class='t' and @name='life']"));
        ePostaBtn.sendKeys("alikilinc.gl@gmail.com");
        MyFunc.wait(2);

        WebElement sifreInput = driver.findElement(By.xpath("//input[@type='password' and @id='lifp']"));
        sifreInput.sendKeys("Testtest123");
        MyFunc.wait(2);

        WebElement hesabagirisBtn = driver.findElement(By.xpath("//input[@type='submit' and @class='s' and @value='Giriş yap']"));
        hesabagirisBtn.click();
        MyFunc.wait(2);

        WebElement hesabimDD = driver.findElement(By.xpath("//a[@title='Hesabım' and @id='H_a_v8' and @rel='nofollow']"));
        hesabimDD.click();
        MyFunc.wait(2);

        WebElement cikisBtn = driver.findElement(By.xpath("//a[@href='#Çık' and contains(@onclick, \"window.localStorage.removeItem('lix')\")]"));
        cikisBtn.click();

        MyFunc.wait(2);

        driver.quit();

    }
}






