package hello;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Sample Cucumber Test
 * Created by scott on 5/31/2017.
 */
public class HelloWorldStepdefs  {
    SampleController controller;
    Object result;
    @Given("^The API endpoint is accessible$")
    public void theAPIEndpointIsAccessible() throws Throwable {
        controller = new SampleController();
    }

    @When("^I hit the root endpoint$")
    public void iHitTheRootEndpoint() throws Throwable {
        result = controller.home();
    }

    @Then("^I get back Hello Docker World$")
    public void iGetBackHelloDockerWorld() throws Throwable {
        Assert.assertTrue(result instanceof String);
    }


}
