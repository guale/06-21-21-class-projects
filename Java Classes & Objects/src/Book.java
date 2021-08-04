import java.util.Calendar;

public class Book {

	//Title
	//Year published
	//Synopsis

	private String title;
	private int yearPublished;
	private String synopsis;

	public Book(){}
	public Book(String title, int year){
		this.title = title;
		this.yearPublished=year;
	}
	public Book(String title, int year, String synopsis){
		this.title = title;
		this.yearPublished=year;
		this.synopsis = synopsis;
	}

	public String getTitle() {
		return title;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public String getSynopsis() {
		return synopsis;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	public void setYearPublished(int yearPublished){
		this.yearPublished = yearPublished;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public boolean isRecent(){
		int year = Calendar.getInstance().get(Calendar.YEAR);
		return yearPublished - 20 >= year;
	}

	public String getBook(){
		if(synopsis != null){
		return String.format("%s is a book published in %s. \n Synopsis: \n %s", title, yearPublished, synopsis);
		}
		return String.format("%s is a book published in %s.", title, yearPublished);
	}
}
