package com.skg.adm.bootup.db.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.skg.adm.bootup.db.entity.Product;

import java.util.List;

public interface ProductRepo  extends JpaRepository<Product,Integer> {

     Product findById(int productId);

     List<Product> findByNameContaining(String name);
}
