package controle;

import javax.swing.JOptionPane;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		String value = JOptionPane.showInputDialog("Put the concept grade");
		int concept = Integer.parseInt(value);
		
		switch(concept) {
		case 10, 9:
			System.out.println("A");
			break;
		case 8, 7:
			System.out.println("B");
			break;
		case 6, 5, 4:
			System.out.println("C");
			break;
		case 3, 2, 1, 0:
			System.out.println("D");
			break;
		default:
			System.out.println("Grade do not exist");
		}
	}
}
