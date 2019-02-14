package com.Korogod.services.impl;

import com.Korogod.dao.impl.ProductDao;
import com.Korogod.dao.impl.Productimpl;
import com.Korogod.domain.Product;

import java.math.BigDecimal;

public class ProductServiceimpl implements ProductService {
    private ProductDao productDao = new Productimpl() {
        @Override
        public boolean BuyProduct(Product product) {
            return false;
        }

        @Override
        public boolean ReturnProduct(Product product) {
            return false;
        }
    };
    @Override
    public void BuyProduct(int id, String name, BigDecimal price) {
        Product product = new Product();
        boolean result = productDao.BuyProduct(product);
        if (result) {
            System.out.println("Приятных покупок ");

        }
    }
    @Override
    public void ReturnProduct(int id, String name, BigDecimal price) {
            Product product=new Product();
            boolean result = productDao.ReturnProduct(product);
            if (result) {
                System.out.println("Катись ты ебундей ");
        }

    }
}
