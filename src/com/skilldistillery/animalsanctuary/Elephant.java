package com.skilldistillery.animalsanctuary;

public class Elephant extends Herbivore{

	public Elephant() {

	}

	public Elephant(String _name) {
		super(_name);
	}

	@Override
	public void eat(int amount) {
		System.out.println(super.getName() + " ate " + amount + " plants");
	}

	@Override
	public void makeNoise() {
		System.out.println("I'll never forget these delicious plants <3");
	}
}
