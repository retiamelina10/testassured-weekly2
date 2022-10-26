package Starter.Project;

import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class AddProduct {
    private String url;
    private JSONObject body = new JSONObject();

    public void iGetStatusCode201() {
        then().statusCode(201);
    }

    public void setUrlAddNewProduct() {
        url ="https://fakestoreapi.com/products";
    }

    public void requestAddProductWithBody() {
        given().header("content-type", "application/json")
                .body(body.toJSONString())
                .when().post(url);
    }

    public void setBodyProductRequest() {
        body.put("title", "test product");
        body.put("price", 13.5);
        body.put("description", "lorem ipsum set");
        body.put( "image", "https://i.pravatar.cc");
        body.put("category", "electronic");
    }
}

