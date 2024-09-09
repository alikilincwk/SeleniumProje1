package Tests;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US07_TC01 extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.akakce.com/");
        MyFunc.wait(2);

        WebElement login = driver.findElement(By.xpath("//div[@id='H_rl_v8']/a[2]"));
        login.click();
        MyFunc.wait(2);

        WebElement eposta=driver.findElement(By.xpath("(//form[@id='FrmLi']//input)[3]"));
        eposta.sendKeys("alikilinc.gl@gmail.com");
        MyFunc.wait(2);

        WebElement password=driver.findElement(By.xpath("(//form[@id='FrmLi']//input)[4]"));
        password.sendKeys("Testtest123");
        MyFunc.wait(2);

        WebElement girisyap=driver.findElement(By.xpath("//*[@id='lfb']"));
        girisyap.click();
        MyFunc.wait(2);

        WebElement hesabim1=driver.findElement(By.xpath("//*[@id='HM_v8']/a"));
        hesabim1.click();
        MyFunc.wait(2);

        WebElement hesabim2=driver.findElement(By.xpath("(//div[@id='HM_v8']//a)[7]"));
        hesabim2.click();
        MyFunc.wait(2);

        WebElement hesabimisil=driver.findElement(By.xpath("//a[text()='Hesabımı Sil']"));
        hesabimisil.click();
        MyFunc.wait(2);

        WebElement sifregir=driver.findElement(By.xpath("(//form[@id='FrmDu']//input)[2]"));
        sifregir.sendKeys("yanlıssifre");
        MyFunc.wait(2);

        WebElement hesapsilbutonu=driver.findElement(By.xpath("//span[@class='tool']/input"));
        hesapsilbutonu.click();
        MyFunc.wait(2);

        WebElement tamambutonu= driver.findElement(By.xpath("//div[@class='buttons']/button"));
        tamambutonu.click();
        MyFunc.wait(2);

        driver.quit();
    }

}
