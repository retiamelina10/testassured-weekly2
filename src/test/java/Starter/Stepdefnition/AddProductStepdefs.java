package Starter.Stepdefnition;

import Starter.Project.AddProduct;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddProductStepdefs {
    @Steps
    AddProduct addProduct;

    @Then("I get status code 201")
    public void iGetStatusCode201() {
        addProduct.iGetStatusCode201();

    }

    @Given("I set url add new product")
    public void iSetUrlAddNewProduct() {
        addProduct.setUrlAddNewProduct();
    }

    @When("I request add product with body")
    public void iRequestAddProductWithBody() {
        addProduct.requestAddProductWithBody();
    }

    @And("I set body request")
    public void iSetBodyRequest() {
        addProduct.setBodyProductRequest();
    }
}
