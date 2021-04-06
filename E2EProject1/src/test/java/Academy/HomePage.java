package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class HomePage extends base {
	public WebDriver driver;

	// public static Logger log =LogManager.getLogger(base.class.getName());

	@Test
	public void basePageNavigation() throws IOException {

		driver = initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();

	}



}
