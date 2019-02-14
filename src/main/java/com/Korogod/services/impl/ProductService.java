package com.Korogod.services.impl;

import java.math.BigDecimal;

public interface ProductService {
    void BuyProduct(int id,String name,BigDecimal price);
    void ReturnProduct(int id,String name,BigDecimal price);
}
