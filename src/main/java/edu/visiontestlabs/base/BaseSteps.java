package edu.visiontestlabs.base;

import org.openqa.selenium.WebDriver;

public class BaseSteps {
	
	protected WebDriver driver = DriverFactory.getInstance().getDriver(); 
    protected ResourceFactory resources = ResourceFactory.getInstance();
    protected ApplicationController heatclinic = new ApplicationController(driver);  
	
	
}
