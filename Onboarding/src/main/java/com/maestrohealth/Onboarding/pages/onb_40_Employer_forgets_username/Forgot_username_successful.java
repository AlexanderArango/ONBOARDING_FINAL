package com.maestrohealth.Onboarding.pages.onb_40_Employer_forgets_username;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.maestrohealth.Onboarding.pages.onb_38_Employer_login.Forgot_username;
import com.maestrohealth.Onboarding.pages.onb_38_Employer_login.Login;

public class Forgot_username_successful {
	
	@FindBy(xpath="//body//div[1]/div/span[1]")
	private WebElement message_username;
	
	@FindBy(xpath="//body//div[1]/div/span[2]/section/button")
	private WebElement continue_to_login_button;
	
	
	public String get_message_username(){
		return message_username.getText();
	}
	
	public Login continue_to_login(){
		continue_to_login_button.click();
		Login page_results = new Login();
		return page_results;
	}
	
	
}
