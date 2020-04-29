package com.sd.bean.inheritance.examples;

public class Car {
	private int noOfWheels;
	private String steering;
	private String music;

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public void setSteering(String steering) {
		this.steering = steering;
	}

	public void setMusic(String music) {
		this.music = music;
	}

	@Override
	public String toString() {
		return "Car [noOfWheels=" + noOfWheels + ", steering=" + steering + ", music=" + music + "]";
	}
	
}
