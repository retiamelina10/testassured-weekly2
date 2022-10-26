package Starter.Stepdefnition;

import Starter.Project.GetProducts;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GetProductsStepdefs {
    @Steps
    GetProducts getProducts;

    @Given("I set url get all product")
    public void iSetUrlGetAllProduct() {
        getProducts.setUrlAllProduct();
    }

    @When("I request get all product")
    public void iRequestGetAllProduct() {
        getProducts.requestGetAllProduct();
    }

    @Given("I set url get a product")
    public void iSetUrlGetAProduct() {
        getProducts.setUrlGetAProduct();
    }

    @When("I request get product")
    public void iRequestGetProduct() {
        getProducts.requestGetProduct();
    }

    @Then("I get status code 400")
    public void iGetStatusCode400() {
        getProducts.getStatusCode400();
    }

    @Given("I set invalid url get a product")
    public void iSetInvalidUrlGetAProduct() {
        getProducts.setInvalidUrlGetProduct();
    }

    @When("I request get product invalid url")
    public void iRequestGetProductInvalidUrl() {
        getProducts.requestGetProductInvalidUrl();
    }
}
