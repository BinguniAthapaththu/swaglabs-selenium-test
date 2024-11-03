package Tests;

import Pages.CartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTest extends BaseTest{

    @Test(priority = 0)
    public void goToCartTest(){
        CartPage cartPage = new CartPage(driver);
        cartPage.clickOnCartIcon();

        String expectedURL = "https://www.saucedemo.com/cart.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL,actualURL);
    }

    @Test(priority = 1)
    public void goToCheckoutPageTest(){
        CartPage cartPage = new CartPage(driver);
        cartPage.clickOnCheckoutButton();

        String expectedURL = "https://www.saucedemo.com/checkout-step-one.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL,actualURL);
    }

    @Test(priority = 2)
    public void validCheckoutTest(){
        CartPage cartPage = new CartPage(driver);
        cartPage.enterFirstName("Binguni");
        cartPage.enterLastName("Athapaththu");
        cartPage.enterPostalCode("60856");
        cartPage.clickOnContinue();
        cartPage.clickOnFinish();

        String expectedMessage = "Thank you for your order!";
        String actualMessage = cartPage.getSuccessMessage();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @Test(priority = 3)
    public void backToHomeTest(){
        CartPage cartPage = new CartPage(driver);
        cartPage.clickOnbackToHome();

        String expectedURL = "https://www.saucedemo.com/inventory.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL,actualURL);
    }

//    @Test(priority = 1)
//    public void continueShoppingTest(){
//        CartPage cartPage = new CartPage(driver);
//        cartPage.clickOnContinueShoppingButton();
//
//        String expectedURL = "https://www.saucedemo.com/inventory.html";
//        String actualURL = driver.getCurrentUrl();
//        Assert.assertEquals(expectedURL,actualURL);
//    }
}
