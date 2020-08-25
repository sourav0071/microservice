package com.skg.adm.bootup.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skg.adm.bootup.db.dao.ReviewRepo;
import com.skg.adm.bootup.db.entity.Product;
import com.skg.adm.bootup.db.entity.Review;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    ReviewRepo reviewDao;

    public Review addReview(Review review){
        return reviewDao.save(review);
    }

    public List<Review> getProductReview(Product product){
        return reviewDao.findAllByProduct(product);
    }
}
