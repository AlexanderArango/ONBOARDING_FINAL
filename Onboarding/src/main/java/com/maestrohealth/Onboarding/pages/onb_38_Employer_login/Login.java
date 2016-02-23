package com.maestrohealth.Onboarding.pages.onb_38_Employer_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(xpath=".//*[@id='main-login-container']/div[1]/div/span[4]")
	private WebElement message_header;
	
	
	@FindBy(xpath=".//*[@id='main-login-container']/div[1]/div/form/section/fieldset[1]/input")
	private WebElement username;
	
	@FindBy(xpath=".//*[@id='main-login-container']/div[1]/div/form/section/fieldset[2]/input")
	private WebElement password;
	
	@FindBy(xpath=".//*[@id='main-login-container']/div[1]/div/form/section/fieldset[1]/div/a")
	private WebElement forgot_username;
	
	
	@FindBy(xpath=".//*[@id='main-login-container']/div[1]/div/form/section/fieldset[2]/div/a")
	private WebElement forgot_password;
	
	
	@FindBy(xpath=".//*[@id='main-login-container']/div[1]/div/form/div/button")
	private WebElement submitButton;
	
	public void Go(WebDriver driver){
		driver.get("https://mbark-qa-employer-web.s3.amazonaws.com/index.html#/");
	}
	
	
	public String get_message_header() {
		return message_header.getText();
	}
	
	
	public void Sign_in(String user, String Passw){
		username.sendKeys(user);
		password.sendKeys(Passw);
		
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
}
