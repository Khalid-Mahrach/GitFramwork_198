package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//rahulonlinetutor@gmail.com
public class LandingPage {

	public WebDriver driver;

	//By signin=By.cssSelector("a[href*='sign_in']");
	By signin = By.xpath("//span[contains(text(),'Login')]");

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	public WebElement getLogin() {
		return driver .findElement(signin);
//		driver.findElement(signin).click();
//		LoginPage lp = new LoginPage(driver);
//		return lp;

	}

}
