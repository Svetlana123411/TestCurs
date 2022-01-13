package OOP;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium {
    @Test
    public void selenium(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        driver.findElement(By.xpath("//button[@class=\"button button_color_green button_size_medium search-form__submit ng-star-inserted\"]")).click();
        String url =driver.getCurrentUrl();
        driver.quit();
        Assert.assertEquals(url, "https://rozetka.com.ua/" );

    }
}
