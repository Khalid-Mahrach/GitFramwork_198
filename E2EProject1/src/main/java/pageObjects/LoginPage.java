package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//rahulonlinetutor@gmail.com
public class LoginPage {

	public WebDriver driver;

	By login = By.cssSelector("[value='Log In']");

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	public WebElement getLogin() {
		return driver.findElement(login);
	}

}
