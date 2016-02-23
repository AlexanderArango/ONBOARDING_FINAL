package com.maestrohealth.Onboarding.pages.onb_37_Employer_welcome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.maestrohealth.Onboarding.pages.onb_38_Employer_login.Login_failed;
import com.maestrohealth.Onboarding.pages.onb_38_Employer_login.Login_successful;	

public class Welcome_Page {
	@FindBy (xpath="//body//div[1]/span[1]")
	private WebElement header_message;
	
	@FindBy (xpath="//body//div[1]/span[2]")
	private WebElement header_message2;
	
	
	
	@FindBy (id="input_0")
	private WebElement username_field;
	
	@FindBy (id="input_1")
	private WebElement password_field;
	
	
	@FindBy (id="input_password_confirm")
	private WebElement password_confirm_field;
	
	@FindBy (id="input_2")
	private WebElement mobile_phone_field;
	
	               
	@FindBy (xpath="//body//form/div[5]/button[1]")
	private WebElement next_button;
	
	@FindBy (xpath="//body//form//div[5]/button[2]")
	private WebElement cancel_button;
	
	@FindBy (xpath="//body//form//div[1]/md-input-container/div/div")
	private WebElement username_validation_message;
	
	@FindBy (xpath="//body//form//div[1]/md-input-container/div/div")
	private WebElement username_validation_unique_message;
	
	@FindBy (xpath="//body//form//div[1]/md-input-container/div/div")
	private WebElement username_not_same_email_validation;
	
	               
	@FindBy (xpath="//body//form//div[2]/md-input-container/div/div[1]")
	private WebElement password_required_message;
	
	@FindBy (xpath="//body//form//div[2]/md-input-container/div/div[2]")
	private WebElement at_least_8_characters;  
	
	/*@FindBy (xpath="//body//form//div[2]/md-input-container/div/div[3]")
	private WebElement onlyletters_required_message;*/  
	
	
	@FindBy (xpath="//body//form//div[2]/md-input-container/div/div[3]")
	private WebElement at_least_one_uppercase;  
	
	/*@FindBy (xpath="//body//form//div[2]/md-input-container/div/div[6]")
	private WebElement at_least_one_lowercase;*/ 
	
	@FindBy (xpath="//body//form//div[2]/md-input-container/div/div[4]")
	private WebElement at_least_one_number;
	
	@FindBy (xpath="//body//form//div[2]/md-input-container/div/div[5]")
	private WebElement at_least_one_special; 
	                  
	@FindBy (xpath="//body//form/div[3]/md-input-container/div/div")
	private WebElement Confirmation_Password_message; 
	
	@FindBy (xpath="//body//form//div[4]/md-input-container/div/div")
	private WebElement Mobile_Phone_message; 
	
	
	public String get_message_header() {
		return header_message.getText();
	}
	
	public String get_message_header2() {
		return header_message2.getText();
	}
	
	public String get_message_username_req() {
		return username_validation_message.getText();
	}
	
	public String get_message_username_unique() {
		return username_validation_unique_message.getText();
	}
	
	public String get_message_username_not_same_email() {
		return username_not_same_email_validation.getText();
	}
	
	
	
	public String get_message_password_req() {
		return password_required_message.getText();
	}
	
	/*public String get_message_onlyletters_required() {
		return onlyletters_required_message.getText();
	}*/
	
	public String get_message_at_least_8_characters() {
		return at_least_8_characters.getText();
	}
	
	public String get_message_at_least_one_uppercase() {
		return at_least_one_uppercase.getText();
	}
	
	/*public String get_message_at_least_one_lowercase() {
		return at_least_one_lowercase.getText();
	}*/
	
	public String get_message_at_least_one_number() {
		return at_least_one_number.getText();
	}
	
	public String get_message_at_least_one_special() {
		return at_least_one_special.getText();
	}
	
	public String get_message_Confirmation_Password() {
		return Confirmation_Password_message.getText();
	}
	
	public String get_message_Mobile_Phone() {
		return Mobile_Phone_message.getText();
	}
	
	
	public boolean get_text_placeholder_username() {
		return username_field.isDisplayed();
	}
	
	public boolean get_text_placeholder_password() {
		return password_field.isDisplayed();
	}
	
	public boolean get_text_placeholder_re_create_password() {
		return password_confirm_field.isDisplayed();
	}
	
	public boolean get_next_button() {
		return next_button.isDisplayed();
	}
	
	public String get_username_value() {
		return username_field.getAttribute("value");
	}
	
	public String get_password_value() {
		return password_field.getAttribute("value");
	}
	
	public String get_reentered_password_value() {
		return password_confirm_field.getAttribute("value");
	}
	
	public String get_mobile_phone_value() {
		return mobile_phone_field.getAttribute("value");
	}
	
	public void Go(WebDriver driver, String Token){
		String base_url = "https://mbark-qa-employer-web.s3.amazonaws.com/index.html#/auth/create_account/?invite_key=";
		base_url=base_url.concat(Token);
		driver.get(base_url);
	}
		
	
	public void create_account(String user, String Passw,String password_confirm, String mobile){
		username_field.sendKeys(user);
		password_field.sendKeys(Passw);
		password_confirm_field.sendKeys(password_confirm);
		mobile_phone_field.sendKeys(mobile);
		
	}
	
	public void create_account(String user,String Passw ) throws Throwable{
		username_field.sendKeys(user);
		Thread.sleep(5000);
		password_field.sendKeys(Passw);
		
	}
	public void create_account(String user,String Passw, String mobile) throws Throwable{
		username_field.sendKeys(user);
		Thread.sleep(5000);
		password_field.sendKeys(Passw);
		mobile_phone_field.sendKeys(mobile);
		
	}
	
	public void clic_on_username() {
		username_field.click();
		
	}
	public void clic_on_password() {
		password_field.click();
		
	}
	public void clic_on_next_button() {
		next_button.click();
		
	}
	public void clic_on_cancel_button() {
		cancel_button.click();
		
	}
	
	public Terms_and_Conditions clic_on_next_button_success() {
		next_button.click();
		Terms_and_Conditions page_results = new Terms_and_Conditions();
		return page_results;
		
	}
	

}
