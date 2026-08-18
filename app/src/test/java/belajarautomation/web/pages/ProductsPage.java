package belajarautomation.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ProductsPage {

    private WebDriver driver;
    private WebDriverWait wait;


    private By pageTitle = By.className("title");

    private By addBackpackButton =
            By.id("add-to-cart-sauce-labs-backpack");

    private By cartButton =
            By.className("shopping_cart_link");


    public ProductsPage(WebDriver driver) {

        this.driver = driver;

        this.wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );

    }


    public boolean isProductsPageDisplayed() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageTitle)
        )
        .getText()
        .equals("Products");

    }


    public void addProductToCart() {


        System.out.println("==============================");
        System.out.println("CURRENT URL : " + driver.getCurrentUrl());
        System.out.println("PAGE TITLE  : " + driver.getTitle());

        try {

            System.out.println(
                "PAGE TEXT : "
                + driver.findElement(By.tagName("body")).getText()
            );

        } catch (Exception e) {

            System.out.println(
                "Tidak bisa membaca halaman"
            );

        }

        System.out.println("==============================");


        wait.until(
                ExpectedConditions.elementToBeClickable(
                        addBackpackButton
                )
        )
        .click();

    }


    public void openCart() {

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        cartButton
                )
        )
        .click();

    }

}