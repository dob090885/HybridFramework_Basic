package de.HFB.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver d){
		driver = d;
		PageFactory.initElements(d, this);
	}

	@FindBy(xpath="//*[@id=\'user\']")
	@CacheLookup
	WebElement username;
	
	@FindBy(xpath="//*[@id=\'pass\']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="//*[@id=\'login\']/form/table/tbody/tr[3]/td[2]/input")
	@CacheLookup
	WebElement submit;
	
	public void setUserName(String uname) {
		username.sendKeys(uname);
	}
	
	public void setpassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickSubmit() {
		submit.click();
	}
	
}
