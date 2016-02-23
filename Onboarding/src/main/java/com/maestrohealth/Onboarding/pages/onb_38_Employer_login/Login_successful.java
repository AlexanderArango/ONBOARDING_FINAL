package com.maestrohealth.Onboarding.pages.onb_38_Employer_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Login_successful {
	@FindBy(xpath="html/body/div[1]/div/md-content/header/md-toolbar/section/span")
	private WebElement username_role;
	
	@FindBy(xpath="//body//md-toolbar/section/a/span")
	private WebElement Logout_button;
	
	public String get_username_role(){
		return username_role.getText();
	}
	
	public Logout Logout(){
		Logout_button.click();
		Logout page_results = new Logout();
		return page_results;
	}
	
	public Logout Logout_after_time_out() throws Exception {
		Thread.sleep(5000);
		Logout page_results = new Logout();
		return page_results;
	}
	
	public boolean username_role_displayed(){
		return username_role.isDisplayed();
	}
	
}
