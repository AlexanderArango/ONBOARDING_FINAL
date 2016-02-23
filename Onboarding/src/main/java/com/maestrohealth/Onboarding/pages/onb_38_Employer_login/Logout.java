package com.maestrohealth.Onboarding.pages.onb_38_Employer_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout {
	@FindBy(id="input_4")
	private WebElement username;
	
	@FindBy(id="input_5")
	private WebElement password;
	
	
	@FindBy(xpath="//body//form/div[3]/button")
	private WebElement submitButton;
	
	@FindBy(xpath="//body//div[1]/div/span[1]")
	private WebElement logout_message_header;//Message is shown when the logout process is done.
	
	@FindBy(xpath="//body//div[1]/div/span[2]")
	private WebElement logout_message_header2;//Message is shown when the logout process is done.
	
	
	@FindBy(xpath="//body//div[1]/md-input-container/div/a")
	private WebElement forgot_username;
	
	@FindBy(xpath="//body//div[2]/md-input-container/div/a")
	private WebElement forgot_password;
	
	
	public void Go(WebDriver driver){
		driver.get("https://mbark-qa-employer-web.s3.amazonaws.com/index.html#/auth/login");
		            
	}
	
	public void Hack_URL(WebDriver driver){
		driver.get("https://mbark-qa-employer-web.s3.amazonaws.com/index.html#/index");
		            
	}
	public void Sign_in(String user, String Passw){
		username.sendKeys(user);
		password.sendKeys(Passw);
		
	}
	public Login_successful submitButton_Login_ok() {
		submitButton.click();
		Login_successful page_results = new Login_successful();
		return page_results;
	}
	public Login_failed submitButton_Login_bad() {
		submitButton.click();
		Login_failed page_results = new Login_failed();
		return page_results;
	}
		
	public Forgot_username forgot_username() {
		forgot_username.click();
		Forgot_username page_results = new Forgot_username();
		return page_results;
	}
	
	public Forgot_password forgot_password() {
		forgot_password.click();
		Forgot_password page_results = new Forgot_password();
		return page_results;
	}
	public String get_logout_message_header(){
		return logout_message_header.getText();
	}
	public String get_logout_message_header2(){
		return logout_message_header2.getText();
	}
}
