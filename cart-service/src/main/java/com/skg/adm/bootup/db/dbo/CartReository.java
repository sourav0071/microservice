package com.skg.adm.bootup.db.dbo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skg.adm.bootup.db.entity.Cart;

public interface CartReository extends JpaRepository<Cart, Integer>{

	
}
