package com.maestrohealth.Onboarding.pages.onb_37_Employer_welcome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Get_Token_Employer {
	
	@FindBy (id= "id_username")
	private WebElement username;
	
	@FindBy (id ="id_password")
	private WebElement password;
	
	public void Go(WebDriver driver)
	{
		driver.get("http://onboarding-develop.herokuapp.com/admin/login/?next=/admin/");
	}
	public void Sing_in(String user, String pass)
	{
		username.sendKeys(user);
		password.sendKeys(pass);
		
	}

}
