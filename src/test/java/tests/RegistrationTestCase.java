package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationTestCase  {
    @Test
    public void registrationTestCase() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pdr.infotech.gov.ua/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.findElement(By.xpath("//div[@class='Header_btnWrap__LR71x']//button//span[text()='Реєстрація']")).click();


        WebElement element_obob = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='AuthModal_slidesWrap___piaZ']//form//input[@name='first_name']")));
        element_obob.sendKeys("Obebo");
        WebElement element_cgdg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='AuthModal_slidesWrap___piaZ']//form//input[@name='last_name']")));
        element_cgdg.sendKeys("cgdg");

        WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='AuthModal_slidesWrap___piaZ']//form//input[@name='email']")));
        element3.sendKeys("dsdsfsdfdf@gmail.com");
        WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='AuthModal_slidesWrap___piaZ']//form//input[@name='password']")));
        element4.sendKeys("dsfsdfsdfsdf123");
        driver.findElement(By.xpath("//div[@class='AuthModal_label__FX_oh']//button")).click();
        WebElement element5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='AuthModal_btnWrap__TuT_L']//button[@type='submit']")));
        element5.click();
        WebElement element7 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Header_btnWrap__LR71x']//span[text()='obib']")));
        element7.isDisplayed();
    }
}
