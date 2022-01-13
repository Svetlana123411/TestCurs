package HomeWorkTwenty;

import OOP.TestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class EatstreetTwo extends TestInit {

   public void getSignIn(){
       driver.findElement(By.xpath("//a[@id='menu-signin']")).click();
   }

    @Test
    public void liveChatOpen() {
        openUrl("https://eatstreet.com/");
        pressGoItBtn();
        getSignIn();
        EnterEmail();
        EnterPassword();
        pressSignInBtn();
        getLiveChat();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'What is your email address?')]")));
        Assert.assertTrue(checkLiveChat());
    }
    public boolean checkLiveChat(){
       return driver.findElement(By.xpath("//span[contains(text(),'What is your email address?')]")).isDisplayed();
    }


    public void getLiveChat() {
       driver.findElement(By.xpath("//div[@class='livechat hidden-tablet']")).click();
    }

    public void pressSignInBtn() {
       driver.findElement(By.xpath("//button[@id='signin']")).click();
    }

    public void pressGoItBtn() {
       driver.findElement(By.xpath("//button[@class='btn']")).click();
    }

    public void EnterPassword() {
       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("centik-1234");
    }

    public void EnterEmail() {
       driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prutasveta@gmail.com");
    }
}
