package com.example.ecommercebackend.model.payload.product;

import com.example.ecommercebackend.model.entity.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.Date;

import static javax.persistence.CascadeType.*;
import static javax.persistence.CascadeType.PERSIST;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductPayloadResponse {
    private Long id;
    private String size;
    private String name;
    private String description;
    private int quantity;
    private BigDecimal price;
    private String brandName;
    private Date createdAt;
    private Date lastUpdated;
    private String imagePath;
    private String productCategoryName;
}