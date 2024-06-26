package jp.co.internous.ecsite.model.domain;

import java.sql.Timestamp;

public class MstGoods {

	private int id;
	
	private String goodsName;
	
	private int price;
	
	private Timestamp createdAt;
	
	private Timestamp updatedAt;
	
	//id
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	//goodsName
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsName() {
		return goodsName;
	}
	
	//price
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	//createdAt
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	
	//updatedAt
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
}
