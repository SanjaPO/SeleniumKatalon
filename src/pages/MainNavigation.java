package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class MainNavigation {
	WebDriver driver;
	WebElement myAccountTab;
	WebElement cartTab;
	public MainNavigation(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getMyAccountTab() {
		return driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[3]/a"));
	}
	public WebElement getCartTab() {
		return driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[1]/a"));
	}
	public void myAccountTabClick() {
		this.getMyAccountTab().click();
	}
	public void cartTabClick() {
		this.getCartTab().click();
	}
}