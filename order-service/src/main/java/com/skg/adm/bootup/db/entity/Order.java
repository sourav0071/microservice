package com.skg.adm.bootup.db.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Order")
public class Order {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id  ;
    private String order_date ;
    private double order_amount ;
    private String order_user ;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	
	public double getOrder_amount() {
		return order_amount;
	}
	public void setOrder_amount(double order_amount) {
		this.order_amount = order_amount;
	}
	public String getOrder_user() {
		return order_user;
	}
	public void setOrder_user(String order_user) {
		this.order_user = order_user;
	}
	
    
    
}
