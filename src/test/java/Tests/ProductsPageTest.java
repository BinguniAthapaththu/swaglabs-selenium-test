package Tests;
import Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsPageTest extends BaseTest{

    @Test(priority = 0) 
    public void addProductToCartTest(){
        ProductsPage productPage = new ProductsPage(driver);
        productPage.addProductToCart();
        String expectedCartValue = "1";
        String actualCartValue = productPage.getCartValue();
        Assert.assertEquals(expectedCartValue,actualCartValue);
    }

    @Test(priority = 1)
    public void removeProductFromCartTest(){
        ProductsPage productPage = new ProductsPage(driver);
        productPage.removeProductFromCart();
        boolean expectedValue = true;
        boolean actualValue = productPage.isCartBadgePresent();
        Assert.assertEquals(expectedValue,actualValue);
    }
}
