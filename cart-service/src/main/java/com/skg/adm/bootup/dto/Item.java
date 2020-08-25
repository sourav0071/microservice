package com.skg.adm.bootup.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Item {

	private int id;
	private String name;
	private double price;
	private double itamtotal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getItamtotal() {
		return itamtotal;
	}
	public void setItamtotal(double itamtotal) {
		this.itamtotal = itamtotal;
	}
	
	
}
