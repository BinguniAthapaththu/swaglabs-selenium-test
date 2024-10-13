package Tests;
import Pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPageTest extends BaseTest{

    @Test(priority = 0)
    public void addProductToCartTest(){
        ProductPage productPage = new ProductPage(driver);
        productPage.addProductToCart();

        String expectedCartValue = "1";
        String actualCartValue = productPage.getCartValue();
        Assert.assertEquals(expectedCartValue,actualCartValue);
    }

    @Test(priority = 1)
    public void removeProductFromCartTest(){
        ProductPage productPage = new ProductPage(driver);
        productPage.removeProductFromCart();

        boolean expectedValue = true;
        boolean actualValue = productPage.isCartBadgePresent();
        Assert.assertEquals(expectedValue,actualValue);
    }
}
