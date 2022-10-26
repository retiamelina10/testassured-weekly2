package Starter.Stepdefnition;

import Starter.Project.UserLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UserLoginStepdefs {
    @Steps
    UserLogin userLogin;
    @Given("I set url user login")
    public void iSetUrlUserLogin() {
        userLogin.setUrlUserLogin();

    }

    @And("I set valid username and password")
    public void iSetValidUsernameAndPassword() {
        userLogin.setValidUsernameAndPassword();
    }

    @When("I request login")
    public void iRequestLogin() {
        userLogin.requestLogin();
    }

    @Then("I get status code 200")
    public void iGetStatusCode200() {
        userLogin.getStatusCode200();
    }

    @And("I input invalid username and password")
    public void iSetInvalidUsernameAndPassword() {
        userLogin.setInvalidUsernameAndPassword();
    }

    @Then("I get status code 401")
    public void iGetStatusCode401() {
        userLogin.getStatusCode401();
    }
}
