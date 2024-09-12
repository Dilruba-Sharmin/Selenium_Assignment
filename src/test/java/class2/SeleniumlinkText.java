package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumlinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm;");
        driver.manage().window().maximize();

        driver.findElement(By.partialLinkText("Reg")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Forgot login info?")).click();
        Thread.sleep(2000);

        driver.quit();
    }

}
