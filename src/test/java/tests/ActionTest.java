package tests;

import model.LombokUserData;
import model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static spec.Specs.request;
import static spec.Specs.responseSpec200;

public class ActionTest extends TestBase {

    @Test
    @DisplayName("Проверка email, при помощи Groovy")
    void checkEmailWithGroovy() {
        given()
                .spec(request)
                .when()
                .get("/users")
                .then()
                .spec(responseSpec200)
                .log().body()
                .body("data.findAll{it.email =~/.*?@reqres.in/}.email.flatten()",
                        hasItems("eve.holt@reqres.in"));
    }



    @Test
    @DisplayName("Обновление данных пользователя")
    void updateUser() {
        User user = new User();
        user.setName("morpheus");
        user.setJob("zion resident");

        User response = given()
                .spec(request)
                .body(user)
                .when()
                .put("/users/2")
                .then()
                .spec(responseSpec200)
                .log().body()
                .extract().as(User.class);
        assertEquals(response.getName(), user.getName());
        assertEquals(response.getJob(), user.getJob());
    }


    @Test
    @DisplayName("Поиск пользователя")
    void singleUser() {

        LombokUserData response = given()
                .spec(request)
                .when()
                .get("/users/2")
                .then()
                .spec(responseSpec200)
                .log().body()
                .extract().as(LombokUserData.class);

        assertEquals("2", response.getUser().getId());
        assertEquals("janet.weaver@reqres.in", response.getUser().getEmail());
    }
}