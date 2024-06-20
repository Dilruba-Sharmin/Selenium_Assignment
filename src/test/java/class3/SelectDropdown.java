package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
    public static void main(String[] args)throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        //WebDriver driver=new ChromeDriver();

        driver.get("https://demo.guru99.com/test/newtours/register.php?authuser=0");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        Select select=new Select(driver.findElement(By.name("country")));

        select.selectByIndex(2);
        Thread.sleep(2000);

        select.selectByValue("ANGOLA");
        Thread.sleep(2000);

        select.selectByVisibleText("ALBANIA");

        for (WebElement element : select.getOptions()) {
            System.out.println(element.getText());
        }




        driver.quit();
    }
}
