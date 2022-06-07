package com.bestbuy.bestbuyapiinfo;

import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class utilitiesSteps {  @Step("Creating version  : {0},version: ")
public ValidatableResponse createVersion (String version){
    String v1 = "data.findAll{it.version='}.get(0)";
    return SerenityRest.given().log().all()
            .when()
            .get()
            .then()
            .statusCode(200)
            .extract()
            .path("v1");
}
    @Step("Creating version  : {0},version: ")
    public ValidatableResponse createHealthcheck (String healthcheck){
        String v2 = "data.findAll{it.healthcheck='}.get(0)";
        return SerenityRest.given().log().all()
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract()
                .path("v2");
    }
}


