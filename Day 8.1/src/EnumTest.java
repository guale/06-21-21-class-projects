public class EnumTest {

	Day day;

	public EnumTest(Day day){
		this.day = day;
	}

	public void weekendOrWeekday(){
		switch (day) {
			case SATURDAY, SUNDAY -> {
				System.out.println("It's a weekend");
			}
			default -> {
				System.out.println("It's a weekday");
			}
		}
	}

}
