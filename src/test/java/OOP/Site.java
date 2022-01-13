package OOP;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Site {
        public void sleep(int seconds){
            try {
                Thread.sleep(seconds*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        @Test
        public void site(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://rozetka.com.ua");
            driver.findElement(By.xpath("//input")).sendKeys("телефон");
            sleep(4);
            driver.findElement(By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']")).click();
            sleep(3);
            driver.findElements(By.xpath("//a[@class='goods-tile__picture ng-star-inserted']")).get(2).click();
            sleep(4);
            driver.findElement(By.xpath("//span[text()=' Купить ']")).click();
            sleep(2);
            // driver.findElement(By.xpath("//button[@class='header__button ng-star-inserted header__button--active']")).click();
            Assert.assertTrue(driver.findElement(By.xpath("//span[@class='counter counter--green ng-star-inserted']")).isDisplayed());
            driver.quit();
        }
    }


