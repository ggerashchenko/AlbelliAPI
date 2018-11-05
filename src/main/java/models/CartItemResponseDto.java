package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CartItemResponseDto {

    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CartItemResponseDtoDetails {
        public String Channel;
        public String ID;
    }
}
/*
{
  "Channel": "albelli.nl",
  "Locale": null,
  "CartItems": [
    {
      "Version": "2",
      "Amount": 1,
      "ComputerName": "",
      "Discountable": true,
      "DiscountCode": null,
      "StoredProductID": 0,
      "EditorID": "",
      "EditorTypeID": "",
      "ProductFileLocation": "",
      "ProductTitle": "",
      "UploadID": "00000000-0000-0000-0000-000000000000",
      "Template": {
        "PredesignedProductID": "a13db0ae-8225-4e8e-ac35-7326aad2d7f6"
      },
      "Configuration": {
        "Article": {
          "ID": "PAP_050"
        },
        "ChosenExtras": {
          "DecidedOnSmallerCopy": false,
          "ChosenExtraPages": null,
          "ChosenCover": null,
          "ChosenWoodFinishing": null,
          "ChosenPlanksOrientation": null,
          "ChosenVoucherDiscount": {
            "Option": {
              "Title": null,
              "ID": "Fixed1"
            }
          },
          "ChosenGlossy": null,
          "ChosenLayFlat": null,
          "ChosenPremiumLayFlat": null,
          "ChosenWrapper": null,
          "ChosenCoverText": null,
          "ChosenLinnen": null,
          "ChosenFloatingFrame": null,
          "ChosenSmallerCopy": null,
          "ChosenBorder": null,
          "ChosenEnhancement": null,
          "ChosenPaperType": null,
          "ChosenPrintSizes": null
        }
      },
      "Locale": null,
      "CartID": "32570e68-b566-42ae-951c-c1e3ef3aeced",
      "ProductID": "21bc6ea5-e1b7-448a-a891-021ffeaff3a8",
      "ChannelName": "albelli.nl",
      "PreviewImageID": null,
      "TimestampCreated": "2018-11-04T12:26:48.187",
      "Links": [
        {
          "Rel": "self",
          "Href": "http://t-dtap.api.albumprinter.com/OnlineshopApi/CartItems/21bc6ea5-e1b7-448a-a891-021ffeaff3a8",
          "Type": "application/xml"
        },
        {
          "Rel": "cart",
          "Href": "http://t-dtap.api.albumprinter.com/OnlineshopApi/Carts/32570e68-b566-42ae-951c-c1e3ef3aeced",
          "Type": "application/xml"
        },
        {
          "Rel": "shopProduct",
          "Href": "http://t-dtap.api.albumprinter.com/OnlineshopApi/ShopProductUrls/21bc6ea5-e1b7-448a-a891-021ffeaff3a8",
          "Type": "application/xml"
        }
      ],
      "ID": "21bc6ea5-e1b7-448a-a891-021ffeaff3a8"
    }
  ],
  "Links": [
    {
      "Rel": "self",
      "Href": "http://t-dtap.api.albumprinter.com/OnlineshopApi/Carts/32570e68-b566-42ae-951c-c1e3ef3aeced",
      "Type": "application/xml"
    },
    {
      "Rel": "cartItems",
      "Href": "http://t-dtap.api.albumprinter.com/OnlineshopApi/Carts/32570e68-b566-42ae-951c-c1e3ef3aeced/Items",
      "Type": "application/xml"
    },
    {
      "Rel": "shop",
      "Href": "http://t-dtap.api.albumprinter.com/OnlineshopApi/ShopURLs/32570e68-b566-42ae-951c-c1e3ef3aeced",
      "Type": "application/xml"
    },
    {
      "Rel": "price",
      "Href": "http://t-dtap.api.albumprinter.com/OnlineshopApi/Carts/32570e68-b566-42ae-951c-c1e3ef3aeced/Price",
      "Type": "application/xml"
    }
  ],
  "ID": "32570e68-b566-42ae-951c-c1e3ef3aeced"
}

 */