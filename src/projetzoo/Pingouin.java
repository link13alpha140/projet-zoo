package projetzoo;

public class Pingouin extends Animal implements Nageur {

	@Override
	public void nager() {
		System.out.println("Plouf");
	}

	@Override
	void crier() {
		System.out.println("Glouglou");
	}

	@Override
	void manger() {
		System.out.println("Carnivore");
	}

}
