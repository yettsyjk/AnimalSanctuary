package com.skilldistillery.animalsanctuary;

public class Sanctuary {
	private Animal[] animals;
	private Attendant name;
	private int currentAnimalIndex = 0;

	public Sanctuary(Attendant _name) {
		name = _name;
	}
	
	public Sanctuary(Attendant _name, int _index) {
		name = _name;
		currentAnimalIndex = _index;
	}
	
	public Sanctuary(Animal[] _animals, Attendant _name) {
		name = _name;
		animals = _animals;
	}
	
	public Animal[] getAnimals() {
		return animals;
	}

	public void setAnimals(Animal[] _animals) {
		animals = _animals;
	}

	public Attendant getAttendant() {
		return name;
	}

	public void setAttendant(Attendant _name) {
		name = _name;
	}

	public int getCurrentAnimalIndex() {
		return currentAnimalIndex;
	}

	public void setCurrentAnimalIndex(int _currentAnimalIndex) {
		currentAnimalIndex = _currentAnimalIndex;
	}
	
	public void addAnimal(Animal _animal) {
		animals[currentAnimalIndex] = _animal;
		currentAnimalIndex++;
	}
	
	public void startAttendantRounds() {
		for (Animal animal : animals) {
			if (animal instanceof Herbivore) {
				System.out.println(name.getName() + " is feeding " + animal.getName() + " plants");
			} else if (animal instanceof Carnivore) {
				System.out.println(name.getName() + " is feeding " + animal.getName() + " meats");
			}
			animal.eat(20);
			animal.makeNoise();
			System.out.println("\n-_-_-_-_-_-_\n");
		}
	}

}
