package Tests;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US01_TC02 extends BaseDriver {

    @Test
    public void TC0102 (){

        driver.get("https://www.akakce.com/");
        MyFunc.wait(2);

        WebElement createAcc = driver.findElement(By.xpath("//*[@id=\"H_rl_v8\"]/a[1]"));
        createAcc.click();
        MyFunc.wait(2);

        WebElement email = driver.findElement(By.xpath("//*[@id=\"rnufe1\"]"));
        email.sendKeys("alikilinc.gl@gmail.com");
        MyFunc.wait(1);

        WebElement remail = driver.findElement(By.xpath("//*[@id=\"rnufe2\"]"));
        remail.sendKeys("alikilinc.gl@gmail.com");
        MyFunc.wait(1);

        WebElement pass = driver.findElement(By.xpath("//*[@id=\"rnufp1\"]"));
        pass.sendKeys("Testtest123");
        MyFunc.wait(1);

        WebElement rePass = driver.findElement(By.xpath("//*[@id=\"rnufp2\"]"));
        rePass.sendKeys("Testtest123");
        MyFunc.wait(1);

        WebElement city = driver.findElement(By.xpath("//*[@id=\"locpr\"]"));
        city.click();
        MyFunc.wait(2);
        WebElement city1 = driver.findElement(By.xpath("//*[@id=\"locpr\"]/option[2]"));
        city1.click();
        MyFunc.wait(2);

        WebElement county = driver.findElement(By.xpath("//*[@id=\"locds\"]"));
        county.click();
        MyFunc.wait(2);
        WebElement county1 = driver.findElement(By.xpath("//*[@id=\"locds\"]/option[2]"));
        county1.click();
        MyFunc.wait(2);

        WebElement userAgree = driver.findElement(By.xpath("//*[@id=\"rnufpca\"]"));
        userAgree.click();
        MyFunc.wait(12);

        WebElement openAcc = driver.findElement(By.xpath("//*[@id=\"rfb\"]"));
        openAcc.click();
        MyFunc.wait(3);

        WebElement alertMes = driver.findElement(By.xpath("//*[@id=\"m-w\"]/div/div[2]/div"));
        System.out.println("Uyari Mesaji = " + alertMes.getText());
        MyFunc.wait(3);


        driver.quit();

    }


}
