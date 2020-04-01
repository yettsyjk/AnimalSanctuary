package com.skilldistillery.animalsanctuary;

public class Giraffe extends Herbivore{

	public Giraffe() {

	}

	public Giraffe(String _name) {
		super(_name);
	}

	@Override
	public void eat(int amount) {
		System.out.println(super.getName() + " ate " + amount + " organic plants");
	}

	@Override
	public void makeNoise() {
		System.out.println("DO YOU KNOW WHO MY HUSBAND IS?!");
	}
}
