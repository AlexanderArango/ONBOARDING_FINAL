package com.maestrohealth.Onboarding.pages.onb_38_Employer_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_failed {
	
	@FindBy(xpath=".//*[@id='main-login-container']/div[1]/div/form/section/fieldset[1]/input")
	private WebElement username;
	
	@FindBy(xpath=".//*[@id='main-login-container']/div[1]/div/form/section/fieldset[2]/input")
	private WebElement password;
	
	
	@FindBy(xpath=".//*[@id='main-login-container']/div[1]/div/span[4]")
	private WebElement message_response;//Message is shown when the Username and Password are not empty but they are not correct.
	
	//Message is shown when the Username is empty.
	@FindBy(xpath=".//*[@id='main-login-container']/div[1]/div/form/section/fieldset[1]/div[2]/div")
	private WebElement username_message_response;
	
	//Message is shown when the Password is empty.
	@FindBy(xpath=".//*[@id='main-login-container']/div[1]/div/form/section/fieldset[2]/div[2]/div")
	private WebElement password_message_response;
	
	
	public String get_message_response(){
		return message_response.getText();
	}
	
	public String get_username_message_response(){
		return username_message_response.getText();
	}
	
	public String get_password_message_response(){
		return password_message_response.getText();
	}
	
	public void Sign_in(String user, String Passw){
		username.sendKeys(user);
		password.sendKeys(Passw);
		
	}
	
}
