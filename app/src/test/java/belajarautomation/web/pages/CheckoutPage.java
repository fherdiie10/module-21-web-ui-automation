package belajarautomation.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    private WebDriver driver;


    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");

    private By continueButton = By.id("continue");

    private By finishButton = By.id("finish");

    private By completeMessage = By.className("complete-header");


    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }


    public void fillCheckoutInformation() {

        driver.findElement(firstNameField)
              .sendKeys("Ferdi");

        driver.findElement(lastNameField)
              .sendKeys("Ansyah");

        driver.findElement(postalCodeField)
              .sendKeys("12345");

    }


    public void clickContinue() {

        driver.findElement(continueButton).click();

    }


    public void clickFinish() {

        driver.findElement(finishButton).click();

    }


    public boolean isOrderComplete() {

        return driver.findElement(completeMessage)
                     .getText()
                     .equals("Thank you for your order!");

    }

}