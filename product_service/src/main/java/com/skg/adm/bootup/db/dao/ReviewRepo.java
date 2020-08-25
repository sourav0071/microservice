package com.skg.adm.bootup.db.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.skg.adm.bootup.db.entity.Product;
import com.skg.adm.bootup.db.entity.Review;

import java.util.List;

public interface ReviewRepo extends JpaRepository<Review, Integer> {

     List<Review> findAllByProduct(Product product);
}
