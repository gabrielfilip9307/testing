package stagings.newDesign.tests.abc.display;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import stagings.newDesign.pages.*;
import utils.BasePage;
import utils.BaseTest;

import java.io.IOException;


public class TableViewTests extends BaseTest {

    private LoginPage loginPage;
    private BasePage basePage;

    @BeforeMethod
    public void setUp() throws IOException {
        WebDriver driver = initializeDriver();
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
    }

    @Test
    public void loginWithValidCredentials() {
        loginPage.loginFunctionality("https://newdesign.lcm-client.com/abc/home", "gabriel admin", "Parola1993!");
    }

    @Test
    public void loginWithValidCredentialsbvg() {
        loginPage.loginFunctionality("https://newdesign.lcm-client.com/login", "user bvg", "Parola1993!");
    }

    @Test
    public void loginWithValidCredentialsdb() {
        loginPage.loginFunctionality("https://newdesign.lcm-client.com/login", "team db", "Parola1993!");
    }

    @Test
    public void loginWithValidCredentialscardio() {
        loginPage.loginFunctionality("https://newdesign.lcm-client.com/login", "team cardio", "Parola1993!");
    }

}
