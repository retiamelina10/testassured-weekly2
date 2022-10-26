package Starter.Project;
import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class GetProducts {
    private String url, url2, url3;
    public void setUrlAllProduct() {
        url = "https://fakestoreapi.com/products";
    }

    public void requestGetAllProduct() {
        given().when().get(url);
    }

    public void setUrlGetAProduct() {
        url2 = "https://fakestoreapi.com/products/1";
    }

    public void requestGetProduct() {
        given().when().get(url2);

    }
    public void getStatusCode400() {
        then().statusCode(400);
    }

    public void setInvalidUrlGetProduct() {
        url3= "https://fakestoreapi.com/products/!@";
    }

    public void requestGetProductInvalidUrl() {
        given().when().get(url3);
    }
}
