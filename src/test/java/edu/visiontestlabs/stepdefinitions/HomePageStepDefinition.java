package edu.visiontestlabs.stepdefinitions;


import edu.visiontestlabs.base.BaseSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefinition extends BaseSteps{
	
	@Given("user is on Home page")
	public void user_is_on_home_page() {
		heatclinic.homePage().veryHomepageText();
	}

	@When("user click on Hot Sauce Tab")
	public void user_click_on_hot_sauce_tab() {
	   
	}

	@Then("Hot Sauce page should be appeared")
	public void hot_sauce_page_should_be_appeared() {
	    
	}

	@When("user click on Marchandise Tab")
	public void user_click_on_marchandise_tab() {
	   
	}

	@Then("Marchandise page should be appeared")
	public void marchandise_page_should_be_appeared() {
	    
	}

}
