package com.teachaway.utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementsUtils {
	private WebDriver driver = BasePage.getDriver();
	private Duration defaultDuration;
	WebDriverWait wait;

	public WebElementsUtils(Duration defaultDuration) {
		this.defaultDuration = defaultDuration;
		wait = new WebDriverWait(driver, defaultDuration);
	}

	public static void waitFor(long mills) {
		try {
			Thread.sleep(mills);
		} catch (InterruptedException e1) {
			System.out.println("Error in waitForMethod");
		}
	}

	public WebElement waitForElementVisiblilty(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public WebElement waitForElementVisiblilty(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	public boolean waitForElementAbsent(WebElement element) {
		return wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public WebElement waitForElementToBeClickable(WebElement webElement) {
//		WebDriverWait wait = new WebDriverWait(driver, defaultDuration);
		
		return wait.until(ExpectedConditions.elementToBeClickable(webElement));
	}

	public void javaScriptClick(WebElement element,long mills) {
		waitFor(mills);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);
	}
	
	public void sendKeysToElementWithWait(WebElement element, String value, long millsWait) {
		element.sendKeys(value);
		waitFor(millsWait);
	}

	public void moveMouseToElement(WebElement element) {
		new Actions(driver).moveToElement(element).perform();
		waitFor(5000);

	}

	public void scrollToElement(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public void scrollOffset(int x, int y) {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(arguments[0],arguments[1])", x,y);
	}
	
	public void scrollToBottomOfPage() {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight);");
	}
	
	
	public List<WebElement> waitForAllElementsVisible(List<WebElement> elements) {
		return wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}
	
	public void refreshPage() {
		BasePage.getDriver().navigate().refresh();
	}
	
	public void clickFromList(List<WebElement> options, String text) {
		for (WebElement option : options) {
			if (option.getText().equals(text)) {
				waitForElementToBeClickable(option).click();
				break;
			}
		}
	}
}
