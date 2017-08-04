package com.bilelovic.warsh.kiraate.domain;

public enum Riwaya {

	WARSH("ورش");
	
	private String name;

	private Riwaya(String name){
		this.name = name;
	}
	public String fullName() {
		return this.name;
	}
}
