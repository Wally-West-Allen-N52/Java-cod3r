package controle;

import javax.swing.JOptionPane;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		String belt = JOptionPane.showInputDialog("Put the belt");
		
		switch(belt.toLowerCase()) {
		case "black":
			System.out.println("Super ninja!!");
		case "brown":
			System.out.println("almost-super ninja!");
		case "purple":
			System.out.println("not a ninja");
		default:
			System.out.println("Do konw nothing");
		}
	}
}
