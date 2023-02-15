package com.fc.Pagelayer.com.fullCreative;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class BoardPage extends TestBase
{
	//----------------------------------------
	public BoardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//----------------------------------------
	
	@FindBy(xpath="//span[@class='placeholder']")
	private WebElement AddingList ;
	
	@FindBy(xpath="//input[@class='list-name-input']")
	private WebElement NamingListA ;
	
	@FindBy(xpath="//input[@class='nch-button nch-button--primary mod-list-add-button js-save-edit']")
	private WebElement AddListA;
	
	@FindBy(xpath="//textarea[@class='list-card-composer-textarea js-card-title']")
	private WebElement NamingCard;
	
	@FindBy(xpath="//input[@class='nch-button nch-button--primary confirm mod-compact js-add-card']")
	private WebElement AddCardButton;
	
	@FindBy(xpath="//input[@class='list-name-input']")
	private WebElement Add_NamingListB;
	
	@FindBy(xpath="//input[@class='nch-button nch-button--primary mod-list-add-button js-save-edit']")
	private WebElement AddListB;
	
	@FindBy(xpath="//span[@class='list-card-title js-card-name']")
	private WebElement Draggable;
	
	@FindBy(xpath="(//a[@class='open-card-composer js-open-card-composer'])[5]")
	private WebElement Droppable;
	
	@FindBy(xpath="//span[@class='list-card-title js-card-name']")
	private WebElement LocationOfElement;
	
	@FindBy(xpath="(//div[@class='OUdAuicP657Tka'])[1]")
	private WebElement RB;
	
	@FindBy(xpath="(//span[@class='_OHV1cSBxHNA1V'])[9]")
	private WebElement Logout;
	
	//----------------------------------------
	public void AddFreshListA()
	{
		AddingList.click();
	}
	
	public void NamingListA(String ListA)
	{
		NamingListA.sendKeys(ListA);
	}
	
	public void ClickingOnAddListButton()
	{
		AddListA.click();
	}
	
	public void Add_NamingCard(String Card)
	{
		NamingCard.sendKeys(Card);
	}
	
	public void AddCardButton()
	{
		AddCardButton.click();
	}
	
	public void Add_NamingListB(String ListB)
	{
		Add_NamingListB.sendKeys(ListB);
	}
	
	public void AddListBButton()
	{
		AddListB.click();
	}
	
	public void DragAndDrop()
	{
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(Draggable, Droppable);
	}
	
	public void LocationOfElement()
	{
		Point point = driver.findElement(By.xpath("//span[@class='list-card-title js-card-name']")).getLocation();
		System.out.println("X co-ordinate for 'Drag and Drop Element' =>  "+point.x);
		System.out.println("Y co-ordinate for 'Drag and Drop Element' =>  "+point.y);
	}
	
	public void ClickOnRB_Button()
	{
		RB.click();
	}
	
	public void ClickOnLogoutTab()
	{
		Logout.click();
	}
	
}
