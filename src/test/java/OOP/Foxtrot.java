package OOP;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Foxtrot {
    public void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void foxtrot(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.foxtrot.com.ua/");
        driver.findElement(By.xpath("//input")).sendKeys("ХОЛОДИЛЬНИК");
        driver.findElement(By.xpath("//input[@type='button']")).click();
        sleep(4);
        driver.findElement(By.xpath("//a[text()='Холодильник SAMSUNG RB38T676FEL/UA' and @class='card__title']")).click();
        sleep(4);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[contains(@class,'product-menu-wrap')]//div[contains(@class,'buy-button')]")).click();
        sleep(4);
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='cartTooltip']")).isDisplayed());
        driver.quit();
    }
}
