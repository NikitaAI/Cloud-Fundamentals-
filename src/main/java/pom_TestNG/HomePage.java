package pom_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    private ChromeDriver driver;

    
    public HomePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public HomePage appLauncher() {
        driver.findElement(By.xpath("//div[@class = 'slds-icon-waffle']")).click();
        return this;
    }

    public HomePage app() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='slds-button']/parent::lightning-button")).click();
        return this;
    }

    public HomePage text() throws InterruptedException {
        driver.findElement(By.xpath("//h2[text()='App Launcher']/following::input")).sendKeys("Campaign");
        return this;
    }

    public HomePage items() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='All Items']/following::mark")).click();
        return this;
    }
}
