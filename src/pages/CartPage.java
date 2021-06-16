package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CartPage {
	WebDriver driver;
	WebElement item1ProductName;
	WebElement removeItem1;
	WebElement emptyCartLabel;
	WebElement totalPriceForItem;
	public CartPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getItem1ProductName() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[3]/a"));
	}
	public WebElement getRemoveItem1() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[1]/a"));
	}
	public WebElement getEmptyCartLabel() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/div/p"));
	}
	public WebElement getTotalPriceForItem() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[6]/span"));
	}
	public String textFromitem1ProductName() {
		return this.getItem1ProductName().getText();
	}
	public void removeItem1ButtonClick() {
		this.getRemoveItem1().click();
	}
	public String textFromEmptyCartLabel() {
		return this.getEmptyCartLabel().getText();
	}
	public String textFromTotalPriceForItem() {
		return this.getTotalPriceForItem().getText();
	}
	public List<WebElement> getCartItemsList() {
		return driver.findElements(By.className("cart_item"));
	}
}
