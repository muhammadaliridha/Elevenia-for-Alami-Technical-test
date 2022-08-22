package alami.elevenia;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import alami.elevenia.pages.CartPage;
import alami.elevenia.pages.MainPage;
import alami.elevenia.pages.ProductDetailPage;
import alami.elevenia.pages.SearchResultPage;

public class EleveniaTest extends BaseWebTest {

	MainPage mainPage = new MainPage(driver, explicitWait);
	SearchResultPage searchResultPage = new SearchResultPage(driver, explicitWait);
	ProductDetailPage productDetailPage = new ProductDetailPage(driver, explicitWait);
	CartPage cartPage = new CartPage(driver, explicitWait);

	@Test
	public void Test() {
		String product = "komputer";
		String quantity = "3";
		String expectedNoItemText = "Tidak ada produk di Shopping Cart.";
		
		mainPage.SearchProduct(product);
		searchResultPage.SearchResult();
		productDetailPage.ProductDetail(quantity);
		cartPage.Cart();
		String actualNoItemText = cartPage.getNoItemText();
		assertEquals(actualNoItemText, expectedNoItemText);
	}
}
