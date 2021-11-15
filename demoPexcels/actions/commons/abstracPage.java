package commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class abstracPage {

	public void waitElementVisible(WebDriver driver, String locator) {

		By element = By.xpath(locator);
		WebDriverWait driverWait = new WebDriverWait(driver, 20);
		driverWait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

	public void sendKeyToElement(WebDriver driver, String locator, String value) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
		element.sendKeys(value);

	}

	public void clickToElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.click();

	}
	
	 public boolean isControlDisplayed(WebDriver driver, String locator) {
		 WebElement element = driver.findElement(By.xpath(locator));
		 return element.isDisplayed();
	 }

	public String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public WebElement hoverMouse(WebDriver driver, String locator) {
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(locator));
		action.moveToElement(element).perform();
		return element;

	}

	public WebElement clickAndHoldMouse(WebDriver driver, String locator) {
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(locator));
		action.clickAndHold().perform();
		return element;

	}

	public String getElementBackGroundColor(WebDriver driver, String locator, String value) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getCssValue(value);

	}

	public String getAttributeValue(WebDriver driver, String locator, String attributeName) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getAttribute(attributeName);
	}

	public String getTextElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getText();
	}

}
