package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(id = "signin2")
	WebElement signupLink;

	@FindBy(id = "login2")
	WebElement loginLink;
	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	 public void clickOnSignUpLink() {
	        signupLink.click();
	    }

	    public void clickOnLoginLink() {
	        loginLink.click();
	    }
}


