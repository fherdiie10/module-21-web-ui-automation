package belajarautomation.web.stepdefinitions;

import belajarautomation.web.hooks.Hooks;
import belajarautomation.web.pages.LoginPage;
import belajarautomation.web.pages.ProductsPage;
import belajarautomation.web.pages.CartPage;
import belajarautomation.web.pages.CheckoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoginSteps {

    private LoginPage loginPage;
    private ProductsPage productsPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;


    private void pause(int milliseconds) {

        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }


    @Given("pengguna membuka halaman login SauceDemo")
    public void penggunaMembukaHalamanLoginSauceDemo() {

        loginPage = new LoginPage(Hooks.getDriver());
        productsPage = new ProductsPage(Hooks.getDriver());
        cartPage = new CartPage(Hooks.getDriver());
        checkoutPage = new CheckoutPage(Hooks.getDriver());

        loginPage.openLoginPage();

        pause(1000);
    }


    @When("pengguna memasukkan username {string}")
    public void penggunaMemasukkanUsername(String username) {

        loginPage.enterUsername(username);

        pause(500);
    }


    @When("pengguna memasukkan password {string}")
    public void penggunaMemasukkanPassword(String password) {

        loginPage.enterPassword(password);

        pause(500);
    }


    @When("pengguna menekan tombol login")
    public void penggunaMenekanTombolLogin() {

        pause(500);

        loginPage.clickLoginButton();

    }


    @Then("pengguna berhasil masuk ke halaman produk")
    public void penggunaBerhasilMasukKeHalamanProduk() {

        assertTrue(
            productsPage.isProductsPageDisplayed(),
            "Pengguna tidak berhasil masuk ke halaman produk"
        );

        pause(1000);

    }


    @Then("pengguna melihat pesan error login")
    public void penggunaMelihatPesanErrorLogin() {

        String errorMessage = loginPage.getErrorMessage();

        assertTrue(
            errorMessage.contains(
                "Username and password do not match any user in this service"
            ),
            "Pesan error tidak sesuai. Pesan aktual: " + errorMessage
        );

        pause(1500);

    }


    @Then("pengguna tetap berada di halaman login dan melihat pesan error")
    public void penggunaTetapBeradaDiHalamanLoginDanMelihatPesanError() {

        assertTrue(
            loginPage.isLoginPageDisplayed(),
            "Pengguna tidak berada di halaman login"
        );

        String errorMessage = loginPage.getErrorMessage();

        assertTrue(
            !errorMessage.isEmpty(),
            "Pesan error tidak muncul"
        );

        pause(1500);

    }


    // ============================
    // END TO END CHECKOUT TEST
    // ============================


    @When("pengguna menambahkan produk ke cart")
    public void penggunaMenambahkanProdukKeCart() {

        productsPage.addProductToCart();

        pause(1000);

    }


    @When("pengguna membuka halaman cart")
    public void penggunaMembukaHalamanCart() {

        productsPage.openCart();

        pause(1000);

    }


    @When("pengguna melakukan checkout")
    public void penggunaMelakukanCheckout() {

        cartPage.clickCheckout();

        pause(1000);

        checkoutPage.fillCheckoutInformation();

        pause(500);

        checkoutPage.clickContinue();

        pause(1000);

        checkoutPage.clickFinish();

        pause(1000);

    }


    @Then("pengguna berhasil menyelesaikan checkout")
    public void penggunaBerhasilMenyelesaikanCheckout() {

        assertTrue(
            checkoutPage.isOrderComplete(),
            "Checkout tidak berhasil"
        );

        pause(1000);

    }

}