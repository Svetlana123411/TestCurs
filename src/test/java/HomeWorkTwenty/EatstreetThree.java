package HomeWorkTwenty;

import OOP.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class EatstreetThree extends TestInit {
    @Test
    public void blogOpen() {
        openUrl("https://eatstreet.com/");
        getClickGoItBtn();
        clickBlog();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        openUrl("https://blog.eatstreet.com/");
        Assert.assertTrue(driver.getCurrentUrl().contains("https://blog.eatstreet.com/"));

    }

    public void clickBlog() {
        driver.findElement(By.xpath("//a[contains(text(),'Blog')]")).click();
    }

    public void getClickGoItBtn() {
        driver.findElement(By.xpath("//button[@class='btn']")).click();
    }
}
