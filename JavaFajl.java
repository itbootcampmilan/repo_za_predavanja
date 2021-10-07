package apache_poi_05_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getUsername() {
		return driver.findElement(By.id("txtUsername"));
	}
	public WebElement getPassword() {
		return driver.findElement(By.id("txtPassword"));
	}
	public WebElement getLgnBtn() {
		return driver.findElement(By.id("btnLogin"));
	}
	public String errorMsg() {
		return driver.findElement(By.id("spanMessage")).getText();
	}
	
	public void login(String username, String password) {
		getUsername().clear();
		getUsername().sendKeys(username);
		getPassword().clear();
		getPassword().sendKeys(password);
		getLgnBtn().click();
	}
}
