package com.maestrohealth.Onboarding.pages.onb_37_Employer_welcome;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Terms_and_Conditions {
   
	@FindBy (css="span.yellow-helper-text")
	private WebElement header_message;
	
	
	@FindBy (xpath="//body//div[2]/md-checkbox/div[1]")
	private WebElement checkbox_control;
	
	@FindBy (xpath="//body//div[2]/div/button")
	private WebElement print_button;
	
	
	@FindBy (xpath="//body//div[3]/button")
	private WebElement I_agree_button;
	
	
	
	
	
	public String get_message_header() {
		return header_message.getText();
	}
	
	public void clic_on_checkbox() {
		checkbox_control.click();
	}
	
	public void clic_on_I_agree_button() {
		I_agree_button.click();
	}
	
	public void clic_on_print_button() {
		print_button.click();
	}
	
	
	public Home_page clic_on_I_agree_button_success(){
		I_agree_button.click();
		Home_page resultado = new Home_page();
		return resultado;
	}
	
	
	
	public String get_checkbox_value() {
		return checkbox_control.getAttribute("value");
	}
	
	public boolean get_I_agree_button() {
		return I_agree_button.isSelected();
	}
	
	public boolean get_print_button() {
		return print_button.isDisplayed();
	}
	
	
	
	
}
