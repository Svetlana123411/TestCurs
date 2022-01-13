package OOP;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {

    public WebDriver driver;
    public void openUrl(String url){
        driver.get(url);

    }

    @BeforeMethod
    public void beforeMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

//    @AfterMethod
//    public void afterMethod() {
//        driver.quit();
//    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
