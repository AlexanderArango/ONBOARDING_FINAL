package com.maestrohealth.Onboarding.pages.onb_37_Employer_welcome;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_page {
    
	@FindBy (css="span.yellow-helper-text")
	private WebElement header_message;
	
	public String get_message_header() {
		return header_message.getText();
	}
}
