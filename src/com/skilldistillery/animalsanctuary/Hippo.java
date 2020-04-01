package com.skilldistillery.animalsanctuary;

public class Hippo extends Carnivore{

	public Hippo() {

	}

	public Hippo(String _name) {
		super(_name);
	}

	@Override
	public void eat(int amount) {
		System.out.println(super.getName() + " ate " + amount + " BAH+TRICARE");
	}

	@Override
	public void makeNoise() {
		System.out.println("SALUTE ME! MY HUSBAND'S AN OFFICER!");
	}
}
