package com.maestrohealth.Onboarding.pages.onb_38_Employer_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Forgot_password {
	
	@FindBy(xpath="//body//div[1]/div/span[1]")
	private WebElement message_header;
	
	
	@FindBy(id="input_5")
	private WebElement username;
	
	@FindBy(xpath=".//*[@id='forgot_form']/div/md-input-container/div/div")
	private WebElement message_username_required;
	
	
	@FindBy(xpath=".//*[@id='forgot_form']/section/button[1]")
	private WebElement send_button;
	
	public void type_username(String Username){
		username.sendKeys(Username);
		
		
	}
	
	public String get_message_header(){
		return message_header.getText();
	}
	
	public String get_message_username_required(){
		return message_username_required.getText();
	}
	
	public Forgot_password_successful send_email() {
		send_button.click();
		Forgot_password_successful page_results = new Forgot_password_successful();
		return page_results;
	}

}
