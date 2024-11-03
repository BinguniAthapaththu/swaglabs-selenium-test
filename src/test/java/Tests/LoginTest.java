package Tests;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test(priority = 0)
    public void loginWithInvalidUsernameTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user1");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
        String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    @Test(priority = 1)
    public void loginWithInvalidPasswordTest(){
        driver.navigate().refresh();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("locked_out_user");
        loginPage.enterPassword("4523454");
        loginPage.clickLogin();
        String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    @Test(priority = 2)
    public void loginWithEmptyUsernameTest(){
        driver.navigate().refresh();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
        String expectedErrorMessage = "Epic sadface: Username is required";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    @Test(priority = 3)
    public void loginWithEmptyPasswordTest(){
        driver.navigate().refresh();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("secret_sauce");
        loginPage.clickLogin();
        String expectedErrorMessage = "Epic sadface: Password is required";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    @Test(priority = 4)
    public void loginWithValidCredentialsTest(){
        driver.navigate().refresh();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
    }
}
