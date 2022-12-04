package edu.visiontestlabs.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import edu.visiontestlabs.base.PageBase;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	
	// Web Element
	@FindBy(className ="home")
	private WebElement homeLink;
	
	
	// Method, Actions
	public void veryHomepageText() {
		super.assertText(homeLink,"HOME");
		
	}
	
	




}
