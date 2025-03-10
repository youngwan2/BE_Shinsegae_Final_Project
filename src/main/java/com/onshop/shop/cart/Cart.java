package com.onshop.shop.cart;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;

    private Integer userId;//int형이 성능 절약된다고 함! 
    private Long productId;
    private int quantity;
}
