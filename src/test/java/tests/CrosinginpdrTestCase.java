package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CrosinginpdrTestCase {

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
        WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='ПДР']")));
        element4.click();

    }
}
