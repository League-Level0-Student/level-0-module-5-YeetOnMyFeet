package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		
		int happiness = 0;
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("What type of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
while (happiness < 4) {
	
System.out.println(happiness);
		


			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed", "Pet", "Hug" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if (task == 0) {
	 happiness += feed();
}
else if (task == 1) {
	happiness +=pet();
}
else if(task == 2) {
	happiness += hug();
}

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if (happiness >= 4) {
	JOptionPane.showMessageDialog(null, "You sure do love you cat!");
}
}

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	public static int feed() {
		
		JOptionPane.showMessageDialog(null, "Your cat shows love!");
		return 1;
		
	}
	public static int pet() {
		
		JOptionPane.showMessageDialog(null, "Your cat purrs!");
		return -2;
	}
	public static int hug() {
		
		JOptionPane.showMessageDialog(null, "Your cat cuddles on your lap!");
		return 4;
	}
	
	
	
}

