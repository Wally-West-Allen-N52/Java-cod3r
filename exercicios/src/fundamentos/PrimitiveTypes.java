package fundamentos;

/**
 * 
 * @author wally
 *
 */
public class PrimitiveTypes {
	
	public static void main(String[] args) {
		// Employee informations
		
		// Numeric integer types
		byte yearsInCompany = 23;
		short flightsnumber = 542;
		int id = 56789;
		long accumulatedpoints = 3_234_845_223L; // Literally Long
		
		// Numeric float pints
		float salary = 11_445.44F; // literally Float
		double accumulatedSeles = 2_991_797_103.01;
		
		// boolean type
		boolean isOnvacation =  false; //true
				
		// Character type
		char status = 'A';
		
		// Days in company
		System.out.println(yearsInCompany * 365);
		// Number of flights
		System.out.println(flightsnumber / 2);
		// Points per Dollars
		System.out.println(accumulatedpoints / accumulatedSeles);
		
		System.out.println("ID: " + id + " earn a salary: US$" + salary);
		System.out.println("Is on vacation? - " + isOnvacation);
		System.out.println("Status: " + status);
	}
}
