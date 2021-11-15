package demoPexcels.testcase.demo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import commons.abstractTest;
import page.objects.HomePageObject;
import page.objects.LoginPageObject;
import page.objects.PageFactoryManager;

import org.testng.annotations.BeforeMethod;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class NewTest extends abstractTest {

	WebDriver driver;
	private LoginPageObject loginPage;
	private HomePageObject homePageObject;

	@BeforeMethod
	public void beforeMethod() {

		driver = openBrowser();
		loginPage = PageFactoryManager.openLoginPage(driver);
		loginPage.inputEmail("bichtran991@gmail.com");
		loginPage.inputPassword("123456");
		loginPage.clickToLoginButton();
		homePageObject = PageFactoryManager.openHomePage(driver);

	}

	@Test
	public void FollowAPhotographerSuccessfully() {
		//homePageObject.clickFirstPhotoOnHomepage();
		homePageObject.hoverOnIconUserAtTheTopLeftCorner();
		homePageObject.clickTheFollowButton();	
		homePageObject.verifyFollowingButtonBackgroundColor();
	}

	@AfterMethod
	public void afterMethod() {
		//driver.close();
	}

}
