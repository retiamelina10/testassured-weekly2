package Starter.Stepdefnition;

import Starter.Project.DeleteUser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DeleteUserStepdefs {
    @Steps
    DeleteUser deleteUser;
    @Given("I set url delete user")
    public void iSetUrlDeleteUser() {
        deleteUser.setUrlDeleteUser();
    }

    @When("I request delete user")
    public void iRequestDeleteUser() {
        deleteUser.requestDeleteUser();
    }
}
