package com.sd.depdancy.injection.examples.spring;

public class Address {
	String city;
	String country;
	int zipCode;
	
	public Address(String city, String country, int zipCode) {
		this.city = city;
		this.country = country;
		this.zipCode = zipCode;
	}

	//Methods
	public Address()
	{
		
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public int getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", zipCode=" + zipCode + "]";
	}
	
}
