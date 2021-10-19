package com.Vtiger.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * POM class for Login Page
 * @author Rakesh PM
 *
 */
public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(name="user_name")
	private WebElement usernameTxtBox;
	
	@FindBy(name="user_password")
	private WebElement pwdTxtbox;
	
	@FindBy(id="submitButton")
	private WebElement lgnbtn;
	
	public WebElement getUsernameTxtBox() {
		return usernameTxtBox;
	}

	public WebElement getPwdTxtbox() {
		return pwdTxtbox;
	}

	public WebElement getLgnbtn() {
		return lgnbtn;
	}
	/**
	 * Method to Login to the application
	 * @param username
	 * @param password
	 */
	public void loginToapp(String username, String password) {
		usernameTxtBox.sendKeys(username);
		pwdTxtbox.sendKeys(password);
		lgnbtn.click();
	}

}
