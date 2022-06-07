package com.bestbuy.bestbuyinfo;

import com.bestbuy.bestbuyapiinfo.utilitiesSteps;
import com.bestbuy.testbase.TestBaseUtilities;
import com.bestbuy.utils.TestUtils;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;

//@RunWith(SerenityRunner.class)
public class UtilitiesCURDTest extends TestBaseUtilities {
    static String version = "1.1.0" + TestUtils.getRandomValue();
    static String healthcheck = "2323.629341" + TestUtils.getRandomValue();


    @Steps
    utilitiesSteps utilitiesSteps;

    @Title("This will create a new category")
    @Test
    public void test001() {
        ValidatableResponse response = utilitiesSteps.createHealthcheck(healthcheck);
        response.log().all().statusCode(201);

    }

    @Title("This will create a new category")
    @Test
    public void test002() {
        ValidatableResponse response = utilitiesSteps.createVersion(version);
        response.log().all().statusCode(201);
    }
}