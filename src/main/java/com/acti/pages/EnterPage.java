package com.acti.pages;

import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

/*
 * Name: EnterPage
 * Description: manages the locators  and methods of enter page
 * Developed By: Abrehet
 * Reviewed By: Shantosh
 * Date reviewed : 05-01-2023
 */

public class EnterPage extends DriverScript{
	
//***************************page Locators***************************//

//***************************page Initialization********************//
	
	public EnterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
//***************************page Methods**************************//
}
