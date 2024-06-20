package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumName {

    public static void main(String[] args)throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(2000);

        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(2000);

        driver.quit();



    }


    }

