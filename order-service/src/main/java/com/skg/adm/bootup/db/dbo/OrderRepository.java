package com.skg.adm.bootup.db.dbo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skg.adm.bootup.db.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
