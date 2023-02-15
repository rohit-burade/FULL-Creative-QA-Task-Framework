package com.fc.Pagelayer.com.fullCreative;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import TestBase.TestBase;

public class LoginPage  extends TestBase
{
	//--------------------------------------------
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------------------------------------------
	
	@FindBy(xpath="//a[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']")
	private WebElement LoginButton ;
	
	@FindBy(xpath="//input[@id='user']")
	private WebElement UserName ;
	
	@FindBy(xpath = "//input[@id='login']")
	private WebElement ContinueButton ;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement EnterPassword ;
	
	@FindBy(xpath="(//span[@class='css-178ag6o'])[1]")
	private WebElement LogInButton ;
	
	
	//--------------------------------------------
	public void ClickOnLoginButton()
	{
		LoginButton.click();
	}
	
	public void UserNameTxtBox(String username)
	{
		UserName.sendKeys(username);
	}
	
	public void ClickOnContinueButton()
	{
		ContinueButton.click();
	}
		
	public void EnterPasswordTxtBox(String password)
	{
		EnterPassword.sendKeys(password);
	}	

	public void ClickOnLogInButton(String password)
	{
		LogInButton.click();
	}
}
