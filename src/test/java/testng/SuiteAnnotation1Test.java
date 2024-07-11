package testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuiteAnnotation1Test extends BaseSuiteTest{

    @Test(priority = 0)
    public void checkTitle() {
        Assert.assertEquals(driver.getTitle(),"Swag Labs");
    }

    @Test(priority = 1)
    public void checkUrl(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/");

    }


}
