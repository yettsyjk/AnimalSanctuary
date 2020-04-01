package com.skilldistillery.animalsanctuary;

public class SanctuarySimulator {

	private Attendant atten = new Attendant("Thom");
	private Sanctuary sanc;
	private Animal[] animals;
	
	public static void main(String[] args) {

		SanctuarySimulator s = new SanctuarySimulator();
		s.run();
		
	}
	
	private void run() {
		Hippo hippo = new Hippo("Karen");
		Giraffe giraffe = new Giraffe("Brittany");
		Puma puma = new Puma("Sancho");
		Elephant elephant = new Elephant("Serrah");
		
		animals = new Animal[4];
		sanc = new Sanctuary(animals, atten);
		sanc.addAnimal(hippo);
		sanc.addAnimal(giraffe);
		sanc.addAnimal(puma);
		sanc.addAnimal(elephant);
		
		sanc.startAttendantRounds();
	}
}
