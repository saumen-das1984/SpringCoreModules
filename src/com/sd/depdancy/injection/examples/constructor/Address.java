package com.sd.depdancy.injection.examples.constructor;

public class Address {
	public String city;
	public String country;
	public String zipcode;
	
	public Address() {
		city = "Contai";
		country = "India";
		zipcode = "721427";
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", zipcode=" + zipcode + "]";
	}
}
