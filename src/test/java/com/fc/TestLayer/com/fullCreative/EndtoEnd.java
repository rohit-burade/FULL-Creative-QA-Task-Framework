package com.fc.TestLayer.com.fullCreative;

import org.testng.annotations.Test;

import TestBase.TestBase;

public class EndtoEnd extends TestBase 
{
	@Test
	public void CreatingBoardWithLogin() throws InterruptedException
	{
	 Login.ClickOnLoginButton();
	 Thread.sleep(4000);
	 Login.UserNameTxtBox("rohit.burade101091@gmail.com");
	 Thread.sleep(4000);
	 Login.ClickOnContinueButton();
	 Thread.sleep(4000);
	 Login.EnterPasswordTxtBox("Tihor@1234");
	 Thread.sleep(000);
	 Login.ClickOnLoginButton();
	 Thread.sleep(4000);
	 Home.ClickOnBoard();
	 Thread.sleep(4000);
	 Home.CreateYourFirstBoardButton();
	 Thread.sleep(4000);
	 Home.BoardTitleName("FULL Creative - QA Task");
	 Thread.sleep(4000);
	 Home.Create();
	 Thread.sleep(4000);
	 Board.AddFreshListA();
	 Thread.sleep(4000);
	 Board.NamingListA("List A");
	 Thread.sleep(4000);
	 Board.ClickingOnAddListButton();
	 Thread.sleep(4000);
	 Board.Add_NamingCard("Drag and Drop Element");
	 Thread.sleep(4000);
	 Board.AddCardButton();
	 Thread.sleep(4000);
	 Board.Add_NamingListB("List B");
	 Thread.sleep(4000);
	 Board.AddListBButton();
	 Thread.sleep(4000);
	 Board.DragAndDrop();
	 Thread.sleep(4000);
	 Board.LocationOfElement();
	 Thread.sleep(4000);
	 Board.ClickOnRB_Button();
	 Thread.sleep(4000);
	 Board.ClickOnLogoutTab();
	}
}
