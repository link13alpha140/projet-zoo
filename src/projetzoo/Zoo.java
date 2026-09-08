package projetzoo;

import java.util.ArrayList;

public class Zoo {
	ArrayList<Animal> Lanimaux = new ArrayList<Animal>();

	public void AddAnimal(Animal nom) {
		Lanimaux.add(nom);
	}
	
	public void Crier() {
		for(Animal animal : Lanimaux) {
			animal.crier();
		}
	}
	
	public void Manger() {
		for(Animal animal : Lanimaux) {
			animal.manger();
		}
	}
	
	public void Nager() {
		for(Animal animal : Lanimaux) {
			if(animal instanceof Nageur) {
				((Nageur) animal).nager();
			}
		}
	}
}
