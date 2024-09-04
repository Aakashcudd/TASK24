package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpTest {

	 WebDriver driver;
	    HomePage homePage;
	    SignUpPage signUpPage;

	    @BeforeClass
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.navigate().to("https://www.demoblaze.com/");
	        homePage = new HomePage(driver);
	        signUpPage = new SignUpPage(driver);
	    }

	    @Test
	    public void testSignUp() {
	        homePage.clickOnSignUpLink();
	        signUpPage.enterUsername("newuser123");
	        signUpPage.enterPassword("password123");
	        signUpPage.clickSignUpButton();
	        // Add assertions here based on expected behavior
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }
}
