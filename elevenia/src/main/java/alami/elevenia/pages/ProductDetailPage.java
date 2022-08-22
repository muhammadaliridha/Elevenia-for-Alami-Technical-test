package alami.elevenia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailPage extends BasePage {

	By quantityOfProduct = By.xpath("//input[@id='optionStock0']");
	By addToCart = By.xpath("//a[contains(text(),'Tambahkan ke Cart')]");
	By yesPopUp = By.xpath("//body/section[1]/section[1]/form[1]/div[1]/div[3]/div[6]/div[2]/div[2]/a[1]");

	public ProductDetailPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver.get(), this);
	}

	public void ProductDetail(String quantity) {
		clearText(quantityOfProduct);
		setText(quantityOfProduct, quantity);
		clickAndWaitByXpath(addToCart);
		clickAndWaitByXpath(yesPopUp);
	}

}
