package com.maestrohealth.Onboarding.tests_sprint_1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.maestrohealth.Onboarding.pages.onb_38_Employer_login.Forgot_password;
import com.maestrohealth.Onboarding.pages.onb_38_Employer_login.Forgot_username;
import com.maestrohealth.Onboarding.pages.onb_38_Employer_login.Login;
import com.maestrohealth.Onboarding.pages.onb_38_Employer_login.Login_failed;
import com.maestrohealth.Onboarding.pages.onb_38_Employer_login.Login_successful;
import com.maestrohealth.Onboarding.pages.onb_38_Employer_login.Logout;
import junit.framework.Assert;


public class ONB_38_Firefox_Execution {
	WebDriver driver;
	@BeforeMethod
	public void Before(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void After(){
		driver.manage().deleteAllCookies();
		driver.quit(); 
	}
	
	@Test( priority = 4 )//TC_ONB-38-004
	public void TC_ONB_38_004() throws InterruptedException{
		 Reporter.log("TC_ONB-38-004 - Username and Password  are not valid"); 
		 Login MiLogin = PageFactory.initElements(driver, Login.class);
		 Reporter.log("Llamada al driver");
		 MiLogin.Go(driver); 
		 Reporter.log("Ingreso del user y password");
		 Thread.sleep(5000);
		 MiLogin.Sign_in("Pepe", "loco");
		 Thread.sleep(5000);
		
		 Login_failed resultado_log = MiLogin.submitButton_Login_bad();
		 resultado_log = PageFactory.initElements(driver, Login_failed.class);
		 Thread.sleep(5000);
		 String valor = resultado_log.get_message_response();
		 Reporter.log("validate actual message vs expected:We were not able to recognize your username/password.");
		 Assert.assertEquals(valor.substring(0, 53),"We were not able to recognize your username/passwor");
	}
	
}
