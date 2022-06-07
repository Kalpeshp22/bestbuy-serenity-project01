package com.bestbuy.bestbuyinfo;

import com.bestbuy.bestbuyapiinfo.ProductsSteps;
import com.bestbuy.testbase.TestBaseProducts;
import com.bestbuy.utils.TestUtils;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.Matchers.hasValue;

//@RunWith(SerenityRunner.class)
public class ProductsCRUDTest extends TestBaseProducts {
    static String name = "Prime" + TestUtils.getRandomValue();
    static String type = "Testing";
    static double price = 20;
    static int shipping = 0;
    static String upc = "039800011513" + TestUtils.getRandomValue();
    static String description = "Automation";
    static String manufacturer = "Prime Testing";
    static String model = "Selenium" + TestUtils.getRandomValue();
    static String url = "http://www.bestbuy.com/site/duracell-d-batteries-4-pack/185267.p?id=1051384046551&skuId=185267&cmp=RMXCC";
    static String image = "http://img.bbystatic.com/BestBuy_US/images/products/1852/185267_sa.jpg";
    static int productID;

    @Steps
    ProductsSteps productsSteps;

    @Title("This will create a new product")
    @Test
    public void test001() {
        List<String> productList = new ArrayList<>();
////        productList.add("Scala");
//        productList.add("Java");
        ValidatableResponse response = productsSteps.createProduct(name, type, price, shipping, upc, description, manufacturer, model, url, image);
        response.log().all().statusCode(201);
    }

    @Title("Verify if the product was added")
    @Test
    public void test002() {

        HashMap<String, Object> value = productsSteps.getProductInfoByName(name);
        Assert.assertThat(value, hasValue(name));
        productID = (int) value.get("id");
    }

    @Title("Update the product information and verify the updated information")
    @Test
    public void test003() {
        name = name + "_updated";
        List<String> productList = new ArrayList<>();
       productList.add("Scala");
        productList.add("Java");
        productsSteps.updateProduct(productID,name,type,price,shipping,upc,description,manufacturer,model,url,image).log().all().statusCode(200);
        HashMap<String, Object> value = productsSteps.getProductInfoByName(name);
        Assert.assertThat(value, hasValue(name));
    }

    @Title("Delete the product and verify if the product is deleted!")
    @Test
    public void test004() {
        productsSteps.deleteProduct(productID).statusCode(200);
        productsSteps.getProductById(productID) .statusCode(404);
    }

}

