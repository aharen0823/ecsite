package jp.co.internous.ecsite.model.form;

import java.io.Serializable;
import java.util.List;

public class CartForm implements Serializable {

	private int userId;
	
	private List<Cart> cartlist;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<Cart> getCartList() {
		return cartlist;
	}

	public void setCartList(List<Cart> cartlist) {
		this.cartlist = cartlist;
	}
	
	
}
