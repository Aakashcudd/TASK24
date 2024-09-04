package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {

	 @FindBy(id = "sign-username")
	    WebElement usernameField;

	    @FindBy(id = "sign-password")
	    WebElement passwordField;

	    @FindBy(css = "button[onclick='register()']")
	    WebElement signupButton;
	    
	public SignUpPage(WebDriver driver2) {
		super(driver2);
	
	}
	 public void enterUsername(String username) {
	        usernameField.sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        passwordField.sendKeys(password);
	    }

	    public void clickSignUpButton() {
	        signupButton.click();
	    }

}
