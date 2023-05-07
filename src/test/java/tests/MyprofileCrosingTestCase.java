package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class MyprofileCrosingTestCase {
    @Test
    public void checkSubmit() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pdr.infotech.gov.ua/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.findElement(By.xpath("//button[1]")).click();
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='AuthModal_formGroup__N6_j_']//input[@name='email']")));
        element.sendKeys("makssmaks8@gmail.com");
        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input [@id='password']")));
        element2.sendKeys("Grzn5WRB24RCkP");
        WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//div//div//div//div[@class='AuthModal_btnWrap__TuT_L']//button[1]")));
        element3.click();
        WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Header_btnWrap__LR71x']//span[text()='obib']")));
        element4.isDisplayed();
        WebElement element5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Header_btnWrap__LR71x']//a")));
        element5.click();

        WebElement element6 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Header_btnWrap__LR71x']//span[text()='obib']")));
        element6.isDisplayed();


//        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='getsitecontrol-iframe']"));       // знаходимо iframe
//
//        driver.switchTo().frame(iframe);        // переключаємося в iframe
//
//        WebElement closeBtn = driver.findElement(By.xpath("//button[@class='close']"));     // тепер можемо шукати елементи всередині iframe
//        closeBtn.click();
//
//        driver.switchTo().defaultContent();     // переключаємося назад до головного контексту


//        WebElement DIALOG_ELEMENT = driver.findElement(By.xpath("//div[@id='__next']"));
//        SearchContext DIALOG_SHADOW_ROOT = DIALOG_ELEMENT.getShadowRoot();
//        WebElement DIALOG_CLOSE_BTN = DIALOG_SHADOW_ROOT.findElement(By.cssSelector("button.close"));
//
//        System.out.println(DIALOG_CLOSE_BTN.getText());
//        DIALOG_CLOSE_BTN.click();
//
//        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='page-title']//h1[text()='Мій профіль']")).isDisplayed());
    }

//    static WebElement getShadowDOM(WebElement element, WebDriver driver) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        WebElement shadowDom = (WebElement) js.executeScript("return arguments[0].shadowRoot", element);
//        return shadowDom;
//    }
}
