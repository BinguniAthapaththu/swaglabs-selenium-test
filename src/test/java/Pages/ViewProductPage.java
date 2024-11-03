package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ViewProductPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By inventoryItem = By.id("item_4_title_link");
    private By addToCartButton = By.id("add-to-cart");
    private By cartBadge = By.className("shopping_cart_badge");
    private By removeButton = By.id("remove");

    private By backToProductsbutton = By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[1]/button[1]/img[1]");

    public  ViewProductPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickOnProduct(){
        driver.findElement(inventoryItem).click();
    }

    public void addToCart(){
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

    public void clickOnBackToProducts(){
        driver.findElement(backToProductsbutton).click();
    }
}
