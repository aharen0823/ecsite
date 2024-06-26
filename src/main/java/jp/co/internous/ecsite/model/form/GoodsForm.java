package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class GoodsForm implements Serializable {

	private int id;
	private String goodsName;
	private int price;
	
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
}
