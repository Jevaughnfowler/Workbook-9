package com.pluralsight.NorthwindTradersSpringBoot.data;

import com.pluralsight.NorthwindTradersSpringBoot.models.Product;

import java.util.List;

public class MySqlProductDAO implements ProductDAO{
    @Override
    public void add(Product product) {

    }

    @Override
    public List<Product> getAll() {
        return List.of();
    }
}
