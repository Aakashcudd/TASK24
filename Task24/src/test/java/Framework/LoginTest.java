package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	 WebDriver driver;
	    HomePage homePage;
	    LoginPage loginPage;

	    @BeforeClass
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://www.demoblaze.com/");
	        homePage = new HomePage(driver);
	        loginPage = new LoginPage(driver);
	    }

	    @Test
	    public void testLogin() {
	        homePage.clickOnLoginLink();
	        loginPage.enterUsername("newuser123");
	        loginPage.enterPassword("password123");
	        loginPage.clickLoginButton();
	        // Add assertions here based on expected behavior
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }
}
