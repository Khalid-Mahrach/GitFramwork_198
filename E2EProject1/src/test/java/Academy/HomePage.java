package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.base;

public class HomePage extends base {
	public WebDriver driver;

	// public static Logger log =LogManager.getLogger(base.class.getName());

	@Test
	public void initialize() throws IOException {

		driver = initializeDriver();
		driver.get("https://sso.teachable.com/secure/9521/users/sign_in");

	}



}
