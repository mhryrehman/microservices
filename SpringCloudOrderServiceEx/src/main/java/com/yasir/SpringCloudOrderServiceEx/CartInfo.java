package com.yasir.SpringCloudOrderServiceEx;

public class CartInfo {

	private String code;
	private String amt;
	
	
	public CartInfo() {
		
	}
	
	public CartInfo(String code, String amt) {
		super();
		this.code = code;
		this.amt = amt;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAmt() {
		return amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}

	@Override
	public String toString() {
		return "CartInfo [code=" + code + ", amt=" + amt + "]";
	}
	
	
}
