package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExitingFromTheTestTestCase {
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
        WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Тести']")));
        element4.click();


        WebElement element1_2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Header_btnWrap__LR71x']//span[text()='obib']")));
        element1_2.isDisplayed();
        WebElement element1_3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Header_btnWrap__LR71x']//a")));
        element1_3.click();

        WebElement element_kategory = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/static/img/profile/Category-select.svg']")));
        element_kategory.click();
        WebElement element_kategoryB = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='B1']")));
        element_kategoryB.click();
        WebElement element_obratu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary']")));
        element_obratu.click();

        WebElement element_testu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Тести']")));
        element_testu.click();
        WebElement element_testu2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/tests/service-center']")));
        element_testu2.click();
        try {
            Thread.sleep(3000); // затримка на 3 секунди
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement elementpdr = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='ПДР']")));
        elementpdr.click();
        WebElement element_exit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined']")));
        element_exit.click();

    }
}
