package controle;

import javax.swing.JOptionPane;

public class IfElseIf {

	public static void main(String[] args) {

		String value = JOptionPane.showInputDialog("Put the grade: ");
		double grade = Double.parseDouble(value);

		if (grade > 10 || grade < 0) {
			System.out.println("Invalid grade!!");
		} else if (grade > 8.1) {
			System.out.println("Valid grade. A concept");
		} else {
			if(grade >= 6.1) {
				System.out.println("Valide grade. B concept");
			}
		}
	}
}
