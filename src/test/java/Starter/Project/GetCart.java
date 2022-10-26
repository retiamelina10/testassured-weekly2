package Starter.Project;

import static net.serenitybdd.rest.SerenityRest.given;

public class GetCart {
    private String url, url2;
    public void setUrlGetAllCart() {
        url = "https://fakestoreapi.com/carts";
    }

    public void requestWithValidUrlGetAll() {
        given().when().get(url);
    }

    public void setUrlGetACart() {
        url2 = "https://fakestoreapi.com/carts/5";
    }

    public void requestWithValidUrlGetAProduct() {
        given().when().get(url2);
    }
}
