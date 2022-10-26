package Starter.Project;

import static net.serenitybdd.rest.SerenityRest.given;

public class DeleteUser {
    private String url;
    public void setUrlDeleteUser() {
        url = "https://fakestoreapi.com/users/6";
    }

    public void requestDeleteUser() {
        given().when().get(url);
    }
}
