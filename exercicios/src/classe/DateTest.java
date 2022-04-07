package classe;

public class DateTest {

	public static void main(String[] args) {
		
		Date date1 = new Date();
		date1.day = "04";
		date1.month = "-07";
		date1.year = "-1984";
		
		var date2 = new Date();
		date2.day = "25";
		date2.month = "-02";
		date2.year = "-1999";
		
		System.out.printf("Wallace's birthday = %s%s%s\n",date1.day,date1.month,date1.year);
		System.out.printf("Nathally's birthday = %s%s%s", date2.day,date2.month,date2.year);
	}
}
