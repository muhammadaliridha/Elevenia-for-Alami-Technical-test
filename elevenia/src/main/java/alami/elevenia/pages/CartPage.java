package alami.elevenia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BasePage {

	By changeCourier = By.xpath("//a[contains(text(),'Ubah Kurir')]");
	By cancelPopUp = By.linkText("Batal");
	By deleteProduct = By.xpath("//a[@class='btnStyle btnS btnWGray'][normalize-space()='Hapus']");
	By okPopUpDelete = By.xpath("//a[@id='chkDelPopY']");
	String iFrame = "ifrLayer";
	By noItemText = By.xpath("//strong[normalize-space()='Tidak ada produk di Shopping Cart.']");

	public CartPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver.get(), this);
	}

	public void Cart() {
		clickAndWaitByXpath(changeCourier);
		switchFrame(iFrame);
		clickAndWaitByXpath(cancelPopUp);
		switchDefaultContent();
		clickAndWaitByXpath(deleteProduct);
		clickAndWaitByXpath(okPopUpDelete);
	}
	
	public String getNoItemText() {
		return getText(noItemText);
	}
}
