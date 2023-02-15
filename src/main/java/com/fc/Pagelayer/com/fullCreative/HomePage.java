package com.fc.Pagelayer.com.fullCreative;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import TestBase.TestBase;


public class HomePage extends TestBase 
{
	//----------------------------------------
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//----------------------------------------
	
	@FindBy(xpath="//span[@class='DD3DlImSMT6fgc XQSLFE3ZZrvms3']")
	private WebElement BoardTab;
	
	@FindBy(xpath="//button[contains(text(),'Create your first board')]")
	private WebElement CreateBoard;
	
	@FindBy(xpath="//input[@class='nch-textfield__input lsOhPsHuxEMYEb lsOhPsHuxEMYEb VkPAAkbpkKnPst']")
	private WebElement BoardTitle;
	
	@FindBy(xpath="//button[@class='ijFumaLuInvBrL bxgKMAm3lq5BpA SdamsUKjxSBwGb SEj5vUdI3VvxDc']")
	private WebElement CreateButton;
	
	//----------------------------------------
	
	public void ClickOnBoard()
	{
		BoardTab.click();
	}
	
	public void CreateYourFirstBoardButton()
	{
		CreateBoard.click();
	}
	
	public void BoardTitleName(String BoardName)
	{
		BoardTitle.sendKeys(BoardName);
	}
	
	public void Create()
	{
		CreateButton.click();
	}
	
}
