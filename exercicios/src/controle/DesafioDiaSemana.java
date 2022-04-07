package controle;

import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		String day = JOptionPane.showInputDialog("Put the day of the week: ");
		
		if(day.equals("Monday")) {
			System.out.println(01);
		} else if(day.equalsIgnoreCase("Tuesday")) {
			System.out.println(02);
		} else if(day.equalsIgnoreCase("Wednesday")) {
			System.out.println(03);
		} else if("Thursday".equalsIgnoreCase(day)) {
			System.out.println(04);
		} else if("Friday".equalsIgnoreCase(day)){
			System.out.println(05);
		} else {
			System.out.println("It is not a week day");
		}
		
	}
}
