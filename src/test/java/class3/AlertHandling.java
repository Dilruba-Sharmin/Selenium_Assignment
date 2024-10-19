package class3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AlertHandling {
    public static void main(String[] args)throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        // Click on a button that triggers a simple alert
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(2000);

        // Accept the alert (click OK)
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        // Prompt Alert (JavaScript Prompt):
        // Cancel  the alert (click cancel)
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();

        // Accept the alert (click OK)
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

         // Enter text into the prompt
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(2000);
        Alert alert =driver.switchTo().alert();
        alert.sendKeys("hello");
        Thread.sleep(2000);
        System.out.println( alert.getText());
        alert.accept();


        driver.quit();




    }
}
