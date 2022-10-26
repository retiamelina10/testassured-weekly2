package Starter.Stepdefnition;

import Starter.Project.GetUser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class GetUserStepdefs {
    @Steps
    GetUser getUser;
    @Given("I set url get all user")
    public void iSetUrlGetAllUser() {
        getUser.setUrlGetAllUser();
    }

    @When("I request get all user")
    public void iRequestGetAllUser() {
        getUser.requestGetAllUser();
    }
}
