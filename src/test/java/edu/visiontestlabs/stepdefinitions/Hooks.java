package edu.visiontestlabs.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import edu.visiontestlabs.base.DriverFactory;
import edu.visiontestlabs.base.ResourceFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	protected WebDriver driver;

	@Before
	public void beforeScenario(Scenario scenario) {
		driver = DriverFactory.getInstance(ResourceFactory.getInstance().getProperty("DRIVER").toString()).getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to(ResourceFactory.getInstance().getProperty("APP_URL").toString()); 
		
	}  
	
	@After
	public void afterScenario() {
		DriverFactory.getInstance().quit();
		
	}

}
