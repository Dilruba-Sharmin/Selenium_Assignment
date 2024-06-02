package class2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class SeleniumTagName {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/droppable");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElements(By.tagName("a"));

        List<WebElement> webElements = driver.findElements(By.tagName("a"));
        System.out.println("Count : " + webElements.size());
        for (WebElement element : webElements) {
            System.out.println(element.getText() + " " + element.getAttribute("href"));
          }
            driver.quit();


        }
    }



