package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
    public static void main(String[] args)throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        //WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.quit();
    }
}
