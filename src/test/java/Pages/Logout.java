package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class Logout {
    WebDriver driver;
    private By burgerMenue = By.id("react-burger-menu-btn");
    private By logoutButton = By.id("logout_sidebar_link");

    public Logout(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnBurgerMenue(){
        driver.findElement(burgerMenue).click();
    }

    public void clickOnLogoutButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(logoutButton).click();
    }
}
