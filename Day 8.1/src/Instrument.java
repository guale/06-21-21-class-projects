public abstract class Instrument {

	private String name;
	private String type;

	public abstract void createSound();

	public Instrument(String name, String type) {
		this.name = name;
		this.type = type;
	}
}
