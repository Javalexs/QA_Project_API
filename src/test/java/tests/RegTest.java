package tests;

import model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static spec.Specs.request;
import static spec.Specs.responseSpec200;

public class RegTest extends  TestBase{
    @Test
    @DisplayName("Создание нового пользователя")
    void createUser() {
        User user = new User();
        user.setName("morpheus");
        user.setJob("leader");

        User response = given()
                .spec(request)
                .body(user)
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .log().body()
                .extract().as(User.class);
        assertEquals(response.getName(), user.getName());
        assertEquals(response.getJob(), user.getJob());
    }

    @Test
    @DisplayName("Успешная регистрация")
    void successfulRegister() {

        User user = new User();
        user.setEmail("eve.holt@reqres.in");
        user.setPassword("pistol");

        User response = given()
                .spec(request)
                .body(user)
                .when()
                .post("/register")
                .then()
                .spec(responseSpec200)
                .log().body()
                .extract().as(User.class);

        assertEquals("4", response.getId());
        assertEquals("QpwL5tke4Pnpja7X4", response.getToken());
    }
}
