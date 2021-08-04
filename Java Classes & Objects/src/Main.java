public class Main {

	public static void main (String[] args){
		Pet john = new Pet("John",10,"Here","Nobody knows");

		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.getLocation());
		System.out.println(john.getType());

		Book wicked = new Book("Wicked",1995,"It's about a witch");
		System.out.println(wicked.getBook());
		if(wicked.isRecent()) System.out.println(wicked.getTitle() + " is a recent book.");
		else System.out.println(wicked.getTitle() + " is not a recent book");

		Book silmarillion = new Book("Silmarillion",1997);
		System.out.println(silmarillion.getBook());
	}
}
