package Starter.Project;

import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class UserLogin {
    private String url;
    private JSONObject body = new JSONObject();
    public void setUrlUserLogin() {
        url = "https://fakestoreapi.com/auth/login";
    }

    public void setValidUsernameAndPassword() {
        body.put("username", "mor_2314");
        body.put("password", "83r5^_");
    }

    public void requestLogin() {
        given().header("content-type", "application/json")
                .body(body.toJSONString())
                .when().post(url);
    }

    public void getStatusCode200() {
        then().statusCode(200);
    }

    public void setInvalidUsernameAndPassword() {
        body.put("username", "retiamelina");
        body.put("password", "Retiaah10");
    }

    public void getStatusCode401() {
        then().statusCode(401);
    }
}
