package jp.co.internous.ecsite.model.domain;

import java.sql.Timestamp;

public class TblPurchase {

	private int id;
	
	private int userId;
	
	private  int goodsId;
	
	private String goodsName;
	
	private int itemCount;
	
	private int total;
	
	private Timestamp createdAt;
	
	//id
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	//userId
	public void setUserId(int userid) {
		this.userId = userid;
	}
	public int getUserId() {
		return userId;
	}
	
	//goodsId
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public int getGoodsId() {
		return goodsId;
	}
	
	//goodsName
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsName() {
		return goodsName;
	}
	
	//itemCount
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	public int getItemCount() {
		return itemCount;
	}
	
	//total
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal() {
		return total;
	}
	
	//createdAt
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
}
