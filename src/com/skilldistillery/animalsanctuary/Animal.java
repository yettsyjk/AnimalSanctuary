package com.skilldistillery.animalsanctuary;

public abstract class Animal {
	private String name;

	public Animal() {
	}

	public Animal(String _name) {
		name = _name;
	}

	public String getName() {
		return name;
	}

	public void setName(String _name) {
		name = _name;
	}

	abstract public void eat(int amount);

	abstract public void makeNoise();
}