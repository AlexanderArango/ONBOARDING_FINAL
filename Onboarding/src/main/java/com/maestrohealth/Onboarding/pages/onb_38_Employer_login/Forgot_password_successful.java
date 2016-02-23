package com.maestrohealth.Onboarding.pages.onb_38_Employer_login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Forgot_password_successful {
	@FindBy(xpath="//body//div[1]/div/span[1]")
	private WebElement message_password_header;
	
	@FindBy(id="input_10")
	private WebElement input_reset_code;
	
	@FindBy(xpath="//body//form//md-input-container/div/div")
	private WebElement message_reset_code_required;
	
	@FindBy(xpath="//body//form//section/button[1]")
	private WebElement next_button;
	
	@FindBy(xpath="//body//form//section/button[2]")
	private WebElement cancel_button;
	
	
	
	public String get_message_username(){
		return message_password_header.getText();
	}
	
	public String get_message_reset_code_required(){
		return message_reset_code_required.getText();
	}
}
