package HomeWorkTwenty;
import OOP.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class EatstreetOne extends TestInit {

    @Test
    public void openUrlEatstreet() {
        openUrl("https://eatstreet.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn']")));
        pressGoItBtn();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://eatstreet.com/"));
    }

    public void pressGoItBtn() {
        driver.findElement(By.xpath("//button[@class='btn']")).click();
    }
}





