package Tests;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Test;

public class US01_TC01 extends BaseDriver {

    @Test
    public void TC0101 (){

        driver.get("https://www.akakce.com/");
        MyFunc.wait(2);

        WebElement createAcc = driver.findElement(By.xpath("//*[@id=\"H_rl_v8\"]/a[1]"));
        createAcc.click();
        MyFunc.wait(2);

        WebElement name = driver.findElement(By.xpath("//*[@id=\"rnufn\"]"));
        name.sendKeys("Testisim");
        MyFunc.wait(1);

        WebElement surName = driver.findElement(By.xpath("//*[@id=\"rnufs\"]"));
        surName.sendKeys("Testsoyad");
        MyFunc.wait(1);

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


        WebElement gender = driver.findElement(By.xpath("//*[@id=\"rngm\"]"));
        gender.click();
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

        WebElement day = driver.findElement(By.xpath("//*[@id=\"bd\"]"));
        day.click();
        MyFunc.wait(2);
        WebElement day1 = driver.findElement(By.xpath("//*[@id=\"bd\"]/option[2]"));
        day1.click();
        MyFunc.wait(2);

        WebElement month = driver.findElement(By.xpath("//*[@id=\"bm\"]"));
        month.click();
        MyFunc.wait(2);
        WebElement month1 = driver.findElement(By.xpath("//*[@id=\"bm\"]/option[2]"));
        month1.click();
        MyFunc.wait(2);

        WebElement year = driver.findElement(By.xpath("//*[@id=\"by\"]"));
        year.click();
        MyFunc.wait(2);
        WebElement year1 = driver.findElement(By.xpath("//*[@id=\"by\"]/option[13]"));
        year1.click();
        MyFunc.wait(2);


        WebElement userAgree = driver.findElement(By.xpath("//*[@id=\"rnufpca\"]"));
        userAgree.click();
        MyFunc.wait(1);


        WebElement openAcc = driver.findElement(By.xpath("//*[@id=\"rfb\"]"));
        openAcc.click();
        MyFunc.wait(3);


        driver.quit();



    }


}
