package alami.elevenia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage extends BasePage {

	By bestSellingProduct = By.xpath("//a[contains(text(),'Produk terlaris')]");
	By selectProduct = By.xpath("//a[contains(text(),'JOYSEUS Wireless Mouse 1800DPI USB Computer 2.4GHz')]");

	public SearchResultPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver.get(), this);
	}

	public void SearchResult() {
		clickAndWaitByXpath(bestSellingProduct);
		clickAndWaitByXpath(selectProduct);
	}

}
