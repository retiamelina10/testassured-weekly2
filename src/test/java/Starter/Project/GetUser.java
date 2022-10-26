package Starter.Project;
import static net.serenitybdd.rest.SerenityRest.given;

public class GetUser {
    private String url;
    public void setUrlGetAllUser() {
        url = "https://fakestoreapi.com/users";
    }

    public void requestGetAllUser() {
        given().when().get(url);
    }
}
