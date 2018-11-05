package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CartItemsPayloadDto {

    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CartItemsDtoPayloadDetails {
        public int amount;
        public int storedProductID;
        public String prefabGuid;
        public String uploadID;
        public Template template;
        public Configuration configuration;
        public String locale;
        public String channelName;
        public String timestampCreated;

    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Data
    public static class Template {
        public String PredesignedProductID;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Data
    public static class Configuration {
        public Article Article;
        public ChosenExtras ChosenExtras;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Data
    public static class Article {
        public String ID;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Data
    public static class ChosenExtras {
        public ChosenVoucherDiscount ChosenVoucherDiscount;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Data
    public static class ChosenVoucherDiscount {
        public Option Option;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Data
    public static class Option {
        public String ID;
    }
}
