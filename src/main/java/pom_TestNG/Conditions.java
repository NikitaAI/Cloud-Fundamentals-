package pom_TestNG;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Conditions {

    protected ChromeDriver driver; 

    @BeforeMethod
    public void login() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--remote-allow-origins=*");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation", "disable-infobars"});

        driver = new ChromeDriver(options); 
        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com/?locale=eu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterMethod
    public void close() {
        if (driver != null) {
            driver.quit(); 
        }
    }
}
