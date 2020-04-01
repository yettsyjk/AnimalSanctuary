package com.skilldistillery.animalsanctuary;

public abstract class Carnivore extends Animal {
	
	public Carnivore() {
	}

	public Carnivore(String _name) {
		super(_name);
	}

	public Animal eat(Animal _animal) {
		return _animal;
	}
}