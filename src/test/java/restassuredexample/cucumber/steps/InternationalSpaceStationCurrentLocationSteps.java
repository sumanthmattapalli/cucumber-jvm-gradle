package restassuredexample.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import restassuredexample.cucumber.InternationalSpaceStationCurrentLocationDefinition;

public class InternationalSpaceStationCurrentLocationSteps {

    InternationalSpaceStationCurrentLocationDefinition service;

    @Given("^I access the ISS Current Location$")
    public void i_access_the_ISS_Current_Location() throws Throwable {
        service = new InternationalSpaceStationCurrentLocationDefinition();
    }

    @When("^I retrieve the ISS Current Location$")
    public void i_retrieve_the_ISS_Current_Location() throws Throwable {
        service.requestInternationalSpaceStationCurrentLocation();
    }

    @Then("^I see the ISS Current Location$")
    public void i_see_the_ISS_Current_Location() throws Throwable {
        service.validateInternationalSpaceStationCurrentLocationContents();
    }
    @Then("^The response time should be less than (\\d+) miliseconds$")
    public void the_response_time_should_be_less_than_seconds(Long responseTime) throws Throwable {
        service.validateInternationalSpaceStationResponseTime(responseTime);
    }

}
