public class Guitar extends Instrument{
	public Guitar(String name, String type) {
		super(name, type);
	}

	@Override
	public void createSound() {
		System.out.println("Guitar goes twang.");
	}
}
