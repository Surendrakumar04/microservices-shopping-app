package com.microservices.productservice.model;

import com.microservices.productservice.dto.ProductResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "product")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;

    public ProductResponse mapToProductResponse() {
        return ProductResponse.builder().description(this.getDescription()).id(this.getId()).name(this.getName()).price(this.getPrice()).build();
    }
}
