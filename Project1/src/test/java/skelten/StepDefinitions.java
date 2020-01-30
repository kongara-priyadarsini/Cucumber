package skelten;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinitions
{
	Person sean = new Person();
	@Given("Sean is {int} meters away from Lucia")
	public void sean_is_meters_away_from_Lucia(Integer int1)
	{
	   sean.setDistance(int1);
	}

	@When("Sean Shouts {string}")
	public void sean_Shouts(String string)
	{
	    sean.setMessage(string);
	}

	@Then("Lucia hears the message {string}")
	public void lucia_hears_the_message(String string)
	{
	    String message = sean.getMesaage();
	    Assert.assertEquals("Free Coffee", message);
	}
	@Then("Lucia hears no message")
	public void lucia_hears_no_message()
	{
		String message = sean.getMesaage();
	    Assert.assertEquals(null, message);
	}
}
