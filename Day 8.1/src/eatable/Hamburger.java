package eatable;

public class Hamburger implements Eatable {

	@Override
	public void getsAte() {
		System.out.println("Eatable.Hamburger has been eaten.");
	}

}
