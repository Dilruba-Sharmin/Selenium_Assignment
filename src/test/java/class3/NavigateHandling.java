package class3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateHandling {
    public static void main(String[] args)throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        //WebDriver driver=new ChromeDriver();

        // Navigate to a website
        driver.navigate().to("https://www.google.com");

        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);


        driver.quit();
    }
}
