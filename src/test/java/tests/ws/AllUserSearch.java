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

public class AllUserSearch {
    WSJsonParser wsJsonParser = new WSJsonParser();
    RequestSpecification requestSpec = new RequestSpecBuilder().setBaseUri("http://178.124.206.46:8001/app/ws/")
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.JSON)
            .log(LogDetail.ALL)
            .build();

    @Test
    public void allUserSearch() throws IOException {
        MyResponse allUsers = RestAssured
                .given()
                .spec(requestSpec)
                .body(new Search("", false))
                .when()
                .post()
                .then()
                .extract().body().as(MyResponse.class);
        System.out.println(allUsers);
        Assert.assertEquals("all users are not returned", wsJsonParser.allUsers().toString(), allUsers.toString());
    }
}
