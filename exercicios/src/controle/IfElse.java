package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String value = JOptionPane.showInputDialog("Put a number");
		int number = Integer.parseInt(value);
		
		if(number %  2 == 0)
			System.out.println("It is a even");
		else
			System.out.println("It is a odd number");
		
	}
}
