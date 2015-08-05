package test.java;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.TestCase;

public class CucumberSteps extends TestCase{
	
	String exp;
	@Given("^the inputs \"([^\"]*)\"$")
	public void the_inputs(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		exp=arg1;
	}

	@Then("^the Result field should be \"([^\"]*)\"$")
	public void the_Result_field_should_be(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		RPNCalculate obj = new RPNCalculate();
		assertEquals(arg1,obj.calculate(exp));
	}




}
