package alami.elevenia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {

	By closePopUp = By.xpath("//a[@class='btn-close closeBtnMainPromo']");
	By searchBox = By.id("AKCKwd");
	By searchButton = By.xpath("//div[@class='header-big']//button[@class='btn-search']"); 

	public MainPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver.get(), this);
	}

	public void SearchProduct(String product) {
		clickAndWaitByXpath(closePopUp);
		setText(searchBox, product);
		clickAndWaitByXpath(searchButton);
	}

}
