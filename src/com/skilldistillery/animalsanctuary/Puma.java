package com.skilldistillery.animalsanctuary;

public class Puma extends Carnivore{

	public Puma() {
		
	}
	
	public Puma(String _name) {
		super(_name);
	}
	
	@Override
	public void eat(int amount) {
		System.out.println(super.getName() + " ate " + amount + " meats");
	}

	@Override
	public void makeNoise() {
		System.out.println("You smudged my Pumas >=( Gimme 2 more meats!");		
	}
	
}
