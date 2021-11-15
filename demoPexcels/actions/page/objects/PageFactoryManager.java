package page.objects;

import org.openqa.selenium.WebDriver;

public class PageFactoryManager {
	public static LoginPageObject openLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}

	public static HomePageObject openHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}

}
