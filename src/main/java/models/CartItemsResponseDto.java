package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CartItemsResponseDto {

    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CartItemsResponseDtoDetails {
        public int Amount;
        public String ComputerName;
        public boolean Discountable;
        public int StoredProductID;
        public String CartID;
        public String ProductID;
        public String ID;

    }
}

/*
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
	"CartID": "65e721ad-e6bc-47c3-a382-dd3404607b36",
	"ProductID": "e3500c03-c25a-4bc3-aa77-e222454c73b5",
	"ChannelName": "albelli.nl",
	"PreviewImageID": null,
	"TimestampCreated": "0001-01-01T00:00:00",
	"Links": [{
		"Rel": "self",
		"Href": "http://t-dtap.api.albumprinter.com/OnlineshopApi/CartItems/e3500c03-c25a-4bc3-aa77-e222454c73b5",
		"Type": "application/xml"
	}, {
		"Rel": "cart",
		"Href": "http://t-dtap.api.albumprinter.com/OnlineshopApi/Carts/65e721ad-e6bc-47c3-a382-dd3404607b36",
		"Type": "application/xml"
	}, {
		"Rel": "shopProduct",
		"Href": "http://t-dtap.api.albumprinter.com/OnlineshopApi/ShopProductUrls/e3500c03-c25a-4bc3-aa77-e222454c73b5",
		"Type": "application/xml"
	}],
	"ID": "e3500c03-c25a-4bc3-aa77-e222454c73b5"
}
 */