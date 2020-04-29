package com.sd.bean.inheritance.examples;

public class WagnoR extends Car{
	private String version;

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "WagnoR [version=" + version + ", "+ super.toString() + "]";
	}
	
}
