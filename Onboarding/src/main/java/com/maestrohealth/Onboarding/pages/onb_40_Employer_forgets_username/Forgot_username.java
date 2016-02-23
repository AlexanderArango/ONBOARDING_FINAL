package com.maestrohealth.Onboarding.pages.onb_40_Employer_forgets_username;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.maestrohealth.Onboarding.pages.onb_38_Employer_login.Login;

public class Forgot_username {
	@FindBy(xpath="//body//div[1]/div/span[1]")
	private WebElement message_header;
		
	@FindBy(id="input_0")
	private WebElement email_address;
	
	@FindBy(xpath=".//*[@id='forgot_form']/div/md-input-container/div/div")
	private WebElement message_email_validation;
	
	@FindBy(xpath=".//*[@id='forgot_form']/section/button[1]")
	private WebElement send_button;
	
	@FindBy(xpath=".//*[@id='forgot_form']/section/button[2]")
	private WebElement cancel_button;
	
	
	public void Go(WebDriver driver){
		driver.get("https://mbark-qa-employer-web.s3.amazonaws.com/index.html#/auth/forgot/username");
	}
	
	public void type_email_address(String email){
		email_address.sendKeys(email);
	}
	
	public String get_message_header(){
		return message_header.getText();
	}
	
	public String get_message_email_validation(){
		return message_email_validation.getText();
	}
	
	public void clic_send_button(){
		send_button.click(); 
	}
	
	
	public Forgot_username_successful send_email_success() {
		send_button.click();
		Forgot_username_successful page_results = new Forgot_username_successful();
		return page_results;
	}
	
	public Login cancel_button() {
		cancel_button.click();
		Login page_results = new Login();
		return page_results;
	}
	
	
	
}
