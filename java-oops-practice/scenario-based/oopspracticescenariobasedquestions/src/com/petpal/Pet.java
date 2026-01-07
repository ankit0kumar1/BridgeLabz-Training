package com.petpal;

public abstract class Pet {
	private String name;
	private String type;
	private int age;
	
	private int hungerLevel;
	private int energyLevel;
	private int moodLevel;
	
	//Constructor
	public Pet(String name , String type, int age) {
		this.name = name;
		this.type = type;
		this.age= age;
		
		this.hungerLevel = 50;
	    this.energyLevel = 50;
	    this.moodLevel = 50;
		
	}
	
	// Abstract method
	public abstract void makeSound();
	
	// Get Levels
	public int getHungerLevel() {
		return hungerLevel;
	}
	public int getEnergyLevel() {
		return energyLevel;
	}
	public int getMoodLevel() {
		return moodLevel;
	}
	
	private void increaseEnergy(int value) {
	    energyLevel += value;

	    if (energyLevel > 100) {
	        energyLevel = 100;
	    }
	}
	private void increaseHunger(int value) {
	    hungerLevel += value;

	    if (hungerLevel > 100) {
	        hungerLevel = 100;
	    }
	}
	
	private void decreaseEnergy(int value) {
	    energyLevel -= value;

	    if (energyLevel < 0) {
	        energyLevel = 0;
	    }
	}
	
	private void decreaseHunger(int value) {
	    hungerLevel -= value;

	    if (hungerLevel < 0) {
	        hungerLevel = 0;
	    }
	}
	private void updateMood() {
	    if (hungerLevel > 70 || energyLevel < 30) {
	        moodLevel = 20;   // unhappy
	    } else if (hungerLevel > 40 || energyLevel < 60) {
	        moodLevel = 50;   // neutral
	    } else {
	        moodLevel = 80;   // happy
	    }
	}
	
	public void feed() {
	    decreaseHunger(20);
	    updateMood();
	}

	public void play() {
	    decreaseEnergy(15);
	    increaseHunger(10);
	    updateMood();
	}

	public void sleep() {
	    increaseEnergy(30);
	    updateMood();
	}


	
}
