package alami.elevenia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();

	public BasePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		this.driver = driver;
		this.explicitWait = explicitWait;
	}

	protected final void clickAndWaitByXpath(By locator) {
		explicitWait.get().until(ExpectedConditions.elementToBeClickable(locator));
		driver.get().findElement(locator).click();
	}

	protected final void setText(By locator, String text) {
		explicitWait.get().until(ExpectedConditions.visibilityOfElementLocated(locator));
		driver.get().findElement(locator).sendKeys(text);
	}

	protected final void clearText(By locator) {
		explicitWait.get().until(ExpectedConditions.visibilityOfElementLocated(locator));
		driver.get().findElement(locator).clear();
	}

	protected final String getText(By locator) {
		explicitWait.get().until(ExpectedConditions.visibilityOfElementLocated(locator));
		String actualText = driver.get().findElement(locator).getText();
		return actualText;
	}
	
	protected final void switchFrame(String locator) {
		driver.get().switchTo().frame(locator);
	}
	
	protected final void switchDefaultContent() {
		driver.get().switchTo().defaultContent();
	}
}
