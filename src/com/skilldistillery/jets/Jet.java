package com.skilldistillery.jets;

public abstract class Jet  {
	private String model;
	private double speed;
	private int range;
	private long price;
	
	
	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	
	
	public void fly() {
		
		double timeTillEmptyInHours = ((range/speed)*60); //Time until empty in minutes
		System.out.println(this.getModel() + " Is flying... Time until you run out of fuel: ");
		System.out.println(timeTillEmptyInHours);
		
		//make a for loop with a localized variable to loop through the populateJets array
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}



	
}
