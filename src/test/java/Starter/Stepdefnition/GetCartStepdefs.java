package Starter.Stepdefnition;

import Starter.Project.GetCart;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GetCartStepdefs {
    @Steps
    GetCart getCart;
    @Given("I set url get all cart")
    public void iSetUrlGetAllCart() {
        getCart.setUrlGetAllCart();
    }

    @Given("I set url get a cart")
    public void iSetUrlGetACart() {
        getCart.setUrlGetACart();
    }

    @When("I request with valid url get all")
    public void iRequestWithValidUrlGetAll() {
        getCart.requestWithValidUrlGetAll();
    }

    @When("I request with valid url get a product")
    public void iRequestWithValidUrlGetAProduct() {
        getCart.requestWithValidUrlGetAProduct();
    }
}
