package package2;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class calculator2 {
	@Given("I enter 20 in the calculator")
	public void i_enter_50() 
	{
		System.out.println("20 is entered");
	}
	
	@And("I press add")
	public void press_add() 
	{
		System.out.println("20 is added");
	}
	
	@And("I have entered 20 in the calculator")
	public void entered_50() 
	{
		System.out.println("entered 20");
	}
	
	@When("I press equal symbol")
	public void press_equal() 
	{
		System.out.println("equal is pressed");
	}
	
	@Then("The result should be 40 on the screen")
	public void result_is_100() 
	{
		System.out.println("result is 40");
	}

}



