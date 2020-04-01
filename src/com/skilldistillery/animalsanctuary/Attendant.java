package com.skilldistillery.animalsanctuary;

public class Attendant {
	
	private String name;
	
	public Attendant(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void feedAnimal(Animal animal, int foods) {
		System.out.println("Fed " + animal + " " + foods + "lbs of food");
		
	}
	
	public void doRounds(Animal[] animals) {
		for (Animal animal : animals) {
			feedAnimal(animal, 10);
		}
	}
	
}
