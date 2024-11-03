package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private WebDriver driver;
    private By cartIcon = By.className("shopping_cart_link");
    private By continueShoppingButton = By.id("continue-shopping");
    private By checkoutButton = By.id("checkout");
    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continueButton = By.id("continue");
    private By finishButton = By.id("finish");
    private By backToHomeButton = By.id("back-to-products");
    private By successMessage = By.xpath("//h2[contains(text(),'Thank you for your order!')]");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnCartIcon(){
        driver.findElement(cartIcon).click();
    }

    public void clickOnContinueShoppingButton(){
        driver.findElement(continueShoppingButton).click();
    }

    public void clickOnCheckoutButton(){
        driver.findElement(checkoutButton).click();
    }

    public void enterFirstName(String firstName){
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void enterPostalCode(String postalCode){
        driver.findElement(postalCodeField).sendKeys(postalCode);
    }

    public void clickOnContinue(){
        driver.findElement(continueButton).click();
    }

    public void clickOnFinish(){
        driver.findElement(finishButton).click();
    }

    public String getSuccessMessage(){
        return driver.findElement(successMessage).getText();
    }

    public void clickOnbackToHome(){
        driver.findElement(backToHomeButton).click();
    }
}
