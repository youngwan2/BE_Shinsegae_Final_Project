package com.onshop.shop.cart;

import com.onshop.shop.cart.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartEntity, Long> {
    CartEntity findByUserId(Long userId);
}
