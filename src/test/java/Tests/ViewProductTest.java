package Tests;
import Pages.ViewProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewProductTest extends BaseTest{

    @Test(priority = 0)
    public void goToViewProductPageTest(){
        ViewProductPage viewProductPage = new ViewProductPage(driver);
        viewProductPage.clickOnProduct();
        String expectedURL = "https://www.saucedemo.com/inventory-item.html?id=4";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL,actualURL);
    }

    @Test(priority = 1)
    public void addProductToCartTest(){
        ViewProductPage viewProductPage = new ViewProductPage(driver);
        viewProductPage.addToCart();
        String expectedCartValue = "1";
        String actualCartValue = viewProductPage.getCartValue();
        Assert.assertEquals(expectedCartValue,actualCartValue);
    }

    @Test(priority = 2)
    public void removeProductFromCartTest(){
        ViewProductPage viewProductPage = new ViewProductPage(driver);
        viewProductPage.removeProductFromCart();
        boolean expectedValue = true;
        boolean actualValue = viewProductPage.isCartBadgePresent();
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test(priority = 3)
    public void backToProductsPageTest(){
        ViewProductPage viewProductPage = new ViewProductPage(driver);
        viewProductPage.clickOnBackToProducts();
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL,actualURL);
    }
}
