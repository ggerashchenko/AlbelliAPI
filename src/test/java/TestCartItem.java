import client.APIClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import models.CartItemResponseDto;
import models.CartItemsPayloadDto;
import models.CartItemsResponseDto;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestCartItem {
    private static APIClient client = new APIClient();

    @Test
    @DisplayName("Verify that it's possible to get cart item")
    public void testGetCartItem() throws IOException {
        String channel = "albelli.nl";
        CartItemsPayloadDto.CartItemsDtoPayloadDetails payload = CartItemsPayloadDto.CartItemsDtoPayloadDetails.builder()
                .amount(1)
                .storedProductID(0)
                .prefabGuid("00000000-0000-0000-0000-000000000000")
                .uploadID("00000000-0000-0000-0000-000000000000")
                .template(new CartItemsPayloadDto.Template("a13db0ae-8225-4e8e-ac35-7326aad2d7f6"))
                .configuration(new CartItemsPayloadDto.Configuration(
                        new CartItemsPayloadDto.Article("PAP_050"),
                        new CartItemsPayloadDto.ChosenExtras(new CartItemsPayloadDto.ChosenVoucherDiscount(new CartItemsPayloadDto.Option("Fixed1")))))
                .locale("nl-NL")
                .channelName(channel)
                .timestampCreated("2018-10-29T11:56:48.755Z")
                .build();
        Response postCartItemsWithResponse = client.postCartItemsWithResponse(payload);

        System.out.println("This is imy response" + postCartItemsWithResponse.getBody().print());

        Assert.assertEquals(201, postCartItemsWithResponse.getStatusCode());

        ObjectMapper objectMapper = new ObjectMapper();

        CartItemsResponseDto.CartItemsResponseDtoDetails postResponse = objectMapper.readValue(
                postCartItemsWithResponse.getBody().print(), CartItemsResponseDto.CartItemsResponseDtoDetails.class
        );

        String cid = postResponse.getCartID();
        Response getCardByIdResponse = client.getCartById(cid);
        Assert.assertEquals(200, getCardByIdResponse.getStatusCode());

        CartItemResponseDto.CartItemResponseDtoDetails getResponse = objectMapper.readValue(
                getCardByIdResponse.getBody().print(), CartItemResponseDto.CartItemResponseDtoDetails.class
        );

        Assert.assertEquals(channel, getResponse.getChannel());
        Assert.assertEquals(cid, getResponse.getID());
    }

}