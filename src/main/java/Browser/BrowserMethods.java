package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserMethods extends BaseClass{

    public static void findelementbyxpathandsendkeys(String xpath,String keys){
        driver.findElement(By.xpath(xpath)).clear();
        driver.findElement(By.xpath(xpath)).sendKeys(keys);
    }
    public static void findelementByXpathandClick(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    public static void checkElementIsDisplayedByXPath( String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, (Duration.ofSeconds(10))); // Wait for up to 10 seconds
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        boolean isDisplayed = element.isDisplayed();
        if (isDisplayed) {
            System.out.println("Element is displayed.");
        } else {
            System.out.println("Element is not displayed.");
        }
    }
}
