package com.skg.adm.bootup.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CartDTO {

	private Item item;
	private int qty;
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	
}
