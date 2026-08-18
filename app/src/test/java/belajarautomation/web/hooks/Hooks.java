package belajarautomation.web.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Hooks {

    private static WebDriver driver;


    @Before
    public void setUp() {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);

        driver.manage()
              .window()
              .setSize(
                    new Dimension(1920,1080)
              );

    }


    @After
    public void tearDown() {

        if(driver != null){

            driver.quit();

        }

    }


    public static WebDriver getDriver(){

        return driver;

    }

}