package ru.netology;

import static io.restassured.RestAssured.given;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTests {
    @Test
    void shouldReturnDemoAccounts() {
        given()
        .baseUri("https://postman-echo.com")
                .body("вася")
               .contentType("text/plain; charset=UTF-8")
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data",equalTo("вася"))
        ;

    }


}
