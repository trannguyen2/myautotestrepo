package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.support.Color;

import commons.abstracPage;
import page.ui.HomePageUI;

public class HomePageObject extends abstracPage {
	WebDriver driver;

	public HomePageObject(WebDriver mappingDriver) {
		driver = mappingDriver;

	}

	/*
	 * public void clickFirstPhotoOnHomepage() { waitElementVisible(driver,
	 * HomePageUI.FIRST_IMAGE); clickToElement(driver,HomePageUI.FIRST_IMAGE);
	 * 
	 * }
	 */
	public void hoverOnIconUserAtTheTopLeftCorner() {
		waitElementVisible(driver, HomePageUI.FIRST_IMAGE);
		hoverMouse(driver, HomePageUI.FIRST_IMAGE);

	}

	public void clickTheFollowButton() {
		waitElementVisible(driver, HomePageUI.FOLLOW_BUTTON);
		clickToElement(driver, HomePageUI.FOLLOW_BUTTON);
	}

	/*
	 * public void clickTheFollowButton() { WebElement btnFolloW =
	 * driver.findElement(By.xpath(HomePageUI.FOLLOW_BUTTON));
	 * 
	 * 
	 * if (btnFolloW.getAttribute("title") == "Follow") { clickToElement(driver,
	 * HomePageUI.FOLLOW_BUTTON);
	 * 
	 * } else { isControlDisplayed(driver, HomePageUI.FOLLOWING_BUTTON);
	 * 
	 * }
	 * 
	 * }
	 */

	public void verifyFollowingButtonBackgroundColor() {
		WebElement btnFollowingElement = driver.findElement(By.xpath(HomePageUI.FOLLOWING_BUTTON));
		waitElementVisible(driver, HomePageUI.FIRST_IMAGE);
		hoverMouse(driver, HomePageUI.FIRST_IMAGE);
		waitElementVisible(driver, HomePageUI.FOLLOWING_BUTTON);
		String btnColor = getElementBackGroundColor(driver, HomePageUI.FOLLOWING_BUTTON, "background-color");
		System.out.print(btnColor);
		Assert.assertEquals(btnColor, "rgba(238, 238, 238, 1)");
		Assert.assertEquals("Following", btnFollowingElement.getAttribute("title"));

	}
}
