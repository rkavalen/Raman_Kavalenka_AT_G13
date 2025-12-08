package tests.ws;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import objects.ws.MyResponse;
import objects.ws.WSJsonParser;
import org.junit.Assert;
import org.junit.Test;
import utils.ws.Search;

import java.io.IOException;

public class PartialUsernameSearch {
    WSJsonParser wsJsonParser = new WSJsonParser();
    RequestSpecification requestSpec = new RequestSpecBuilder().setBaseUri("http://178.124.206.46:8001/app/ws/")
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.JSON)
            .log(LogDetail.ALL)
            .build();

    @Test
    public void findByFullUsernameMin() throws IOException {
        MyResponse minUsername = RestAssured
                .given()
                .spec(requestSpec)
                .body(new Search("dj", false))
                .when()
                .post()
                .then()
                .extract().body().as(MyResponse.class);
        Assert.assertEquals("user rangaradjangoo is not returned", wsJsonParser.rangaradjangoo().toString(), minUsername.toString());
    }

    @Test
    public void findByFullUsernameMax() throws IOException {
        MyResponse maxUsername = RestAssured
                .given()
                .spec(requestSpec)
                .body(new Search("rangaradj", false))
                .when()
                .post()
                .then()
                .extract().body().as(MyResponse.class);
        Assert.assertEquals("user rangaradjangoo is not returned", wsJsonParser.rangaradjangoo().toString(), maxUsername.toString());
    }
}
