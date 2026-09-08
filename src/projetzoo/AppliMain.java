package projetzoo;

public class AppliMain {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Animal lion = new Lion();
		Animal singe = new Singes();
		Pingouin pingouin = new Pingouin();
		zoo.AddAnimal(lion);
		zoo.AddAnimal(singe);
		zoo.AddAnimal(pingouin);
		zoo.Crier();
		zoo.Nager();
		zoo.Manger();
	}

}
