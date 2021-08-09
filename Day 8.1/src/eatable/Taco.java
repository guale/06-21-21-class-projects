package eatable;

public class Taco implements Eatable {

	@Override
	public void getsAte() {
		System.out.println("Eatable.Taco has been eaten.");
	}

}
