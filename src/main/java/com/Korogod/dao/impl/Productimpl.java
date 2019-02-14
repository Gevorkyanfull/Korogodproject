package com.Korogod.dao.impl;

import com.Korogod.domain.Product;

public class Productimpl implements ProductDao {

    @Override
    public boolean BuyProduct(Product product) {
        System.out.println("Товар добавлен в корзину, выберите следующий товар");
        return false;
    }

    @Override
    public boolean ReturnProduct(Product product) {
        System.out.println("Возврат товара");
        return false;
    }
}
