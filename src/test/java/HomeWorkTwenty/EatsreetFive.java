package HomeWorkTwenty;

import OOP.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class EatsreetFive extends TestInit {
    @Test
    public void getAddressInput() {
        openUrl("https://eatstreet.com/");
        pressGoItBtn();
        inputSearchField();
        pressGetFed();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='enter-address-btn']"))).click();
        pressGetFed();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'New Brunswick')]")));
        Assert.assertTrue(getMedisonIsDisplayed());
    }
    private boolean getMedisonIsDisplayed() {
        return driver.findElement(By.xpath("//h1[contains(text(),'New Brunswick')]")).isDisplayed();

    }

    private void pressGetFed() {
        driver.findElement(By.xpath("//a[contains(@class,'btn-action')]")).click();
    }

    public void inputSearchField() {
        driver.findElement(By.xpath("//input[contains(@class,'enter')]")).sendKeys("Medison");
    }

    public void pressGoItBtn() {
        driver.findElement(By.xpath("//button[@class='btn']")).click();
    }

}

