package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    private By cartBadge = By.className("shopping_cart_badge");
    private By removeButton = By.id("remove-sauce-labs-backpack");

    public ProductPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void addProductToCart(){
        driver.findElement(addToCartButton).click();
    }

    public String getCartValue(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartBadge));
        return driver.findElement(cartBadge).getText();
    }

    public void removeProductFromCart(){
        driver.findElement(removeButton).click();
    }

    public boolean isCartBadgePresent(){
        return driver.findElements(cartBadge).isEmpty();
    }
}
