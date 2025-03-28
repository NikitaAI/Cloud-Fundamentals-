package pom_TestNG;

import org.testng.annotations.Test;

public class TestTime extends Conditions {

    @Test
    public void test() throws InterruptedException {
    	System.out.println(driver);
        Login login = new Login(driver); // Pass driver
        login.enterUsername()
             .enterPassword()
             .clickLogin();   
        
        System.out.println("Now navigating through Salesforce...");
        
       
        HomePage H = new HomePage(driver);
        H.appLauncher()
        .app()
        .text()
        .items();
    }
}
