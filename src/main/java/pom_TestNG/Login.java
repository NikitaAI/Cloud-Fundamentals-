package pom_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Login {

    private ChromeDriver driver;

    
    public Login(ChromeDriver driver) {
        this.driver = driver;
    }

    public Login enterUsername() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
        return this;
    }

    public Login enterPassword() {
        driver.findElement(By.id("password")).sendKeys("Test@2025");
        return this;
    }

    public HomePage clickLogin() {
        driver.findElement(By.id("Login")).click();
        return new HomePage(driver); 
    }
}
