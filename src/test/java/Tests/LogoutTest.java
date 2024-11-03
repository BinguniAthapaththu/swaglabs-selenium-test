package Tests;
import Pages.Logout;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest{
    @Test(priority = 0)
    public void logoutTest(){
        Logout logout = new Logout(driver);
        logout.clickOnBurgerMenue();
        logout.clickOnLogoutButton();
        String expectedURL = "https://www.saucedemo.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL,actualURL);
    }
}
