package client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import models.CartItemsPayloadDto;
import utils.TestPropertiesLoader;

public class APIClient {

    static {
        RestAssured.baseURI = TestPropertiesLoader.getBaseUrl();
    }

    public void postCartItems(CartItemsPayloadDto.CartItemsDtoPayloadDetails payload) throws JsonProcessingException {
        ObjectMapper jacksonObjectMapper = new ObjectMapper();
        String bodyString = jacksonObjectMapper.writeValueAsString(payload);
        RestAssured.given()
                .contentType("application/json")
                .accept("application/json")
                .body(bodyString)
                .expect()
                .statusCode(201)
                .when()
                .post("/CartItems");

    }

    public Response postCartItemsWithResponse(CartItemsPayloadDto.CartItemsDtoPayloadDetails payload) throws JsonProcessingException {
        ObjectMapper jacksonObjectMapper = new ObjectMapper();
        String bodyString = jacksonObjectMapper.writeValueAsString(payload);
        return RestAssured.given()
                .contentType("application/json")
                .accept("application/json")
                .body(bodyString)
                .when()
                .post("/CartItems?validationMode=Cart");
    }

    public Response getCartById(String cartId){
        Response response = RestAssured.given()
                .contentType("application/json")
                .accept("application/json")
                .get("/Carts/"+cartId);

        return response;
    }
}
