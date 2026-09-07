package projetzoo;

public class AppliMain {
	public static void main(String[] args) {
		AppliMain myObj = new AppliMain();
		Animal lion = new Lion();
		Animal singe = new Singes();
		Pingouin pingouin = new Pingouin();
		lion.crier();
		singe.crier();
		pingouin.crier();
		lion.manger();
		singe.manger();
		pingouin.manger();
		pingouin.nager();
	}

}
