package belajarautomation.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    private WebDriver driver;

    private By pageTitle = By.className("title");

    private By addBackpackButton = By.id("add-to-cart-sauce-labs-backpack");

    private By cartButton = By.className("shopping_cart_link");


    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }


    public boolean isProductsPageDisplayed() {

        return driver.findElement(pageTitle)
                     .getText()
                     .equals("Products");

    }


    public void addProductToCart() {

        driver.findElement(addBackpackButton)
              .click();

    }


    public void openCart() {

        driver.findElement(cartButton)
              .click();

    }

}