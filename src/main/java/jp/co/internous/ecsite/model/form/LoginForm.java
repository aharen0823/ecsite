package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class LoginForm implements Serializable {

	private String userName;
	private String password;
	
	//userName
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	
	
	//password
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
}
