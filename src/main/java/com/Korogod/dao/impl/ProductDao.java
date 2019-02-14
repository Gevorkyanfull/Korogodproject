package com.Korogod.dao.impl;

import com.Korogod.domain.Product;

public interface ProductDao {
    boolean BuyProduct(Product product);
    boolean ReturnProduct(Product product);

}
