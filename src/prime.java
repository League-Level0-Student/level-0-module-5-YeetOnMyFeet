import javax.swing.JOptionPane;

public class prime {
public static void main(String[] args) {
	String num = JOptionPane.showInputDialog("Give me a number");
	int number = Integer.parseInt(num);
	boolean prime = true;
	for (int i = 2; i < number/2; i++) {
		if (number % i == 0) {
			JOptionPane.showMessageDialog(null, "The number is not prime!");
			 prime = false;
			 break;
		}
		
		}
	if (prime) {
		JOptionPane.showMessageDialog(null, "The number is prime!");
	}
	
	
	
	
	
	
	
}
}
