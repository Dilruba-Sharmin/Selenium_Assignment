package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumId {
    public static void main(String[] args)throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://demo.applitools.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.findElement(By.id("username")).sendKeys("test");
        Thread.sleep(2000);

        driver.findElement(By.id("password")).sendKeys("test123");
        Thread.sleep(2000);

        driver.findElement(By.id("log-in")).click();
        Thread.sleep(2000);

        driver.quit();





    }
}
