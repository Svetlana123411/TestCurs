package HomeWorkTwenty;

import OOP.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class EatstreetFour extends TestInit {
    @Test
    public void careers() {

        openUrl("https://eatstreet.com/");
        getClickGoItBtn();
        clickCareers();
//        visibilityOfElementLocated("//input[@type='text']");
        inputSerchField().sendKeys("Director\n");;
//
//        Assert.assertTrue();
    }
    public WebElement visibilityOfElementLocated(String locator){
        return new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.(By.xpath(locator)));
    }

    public WebElement inputSerchField() {
        return visibilityOfElementLocated("//input[@type='text']");
    }

    public void clickCareers() {
        driver.findElement(By.xpath("//a[@ui-sref='careers']")).click();
    }

    public void getClickGoItBtn() {
        driver.findElement(By.xpath("//button[@class='btn']")).click();

    }

    private class findElement {
        public findElement(By xpath) {
        }
    }
}
