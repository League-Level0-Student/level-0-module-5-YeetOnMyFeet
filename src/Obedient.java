import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient {
public static void main(String[] args) {
	Robot rob = new Robot();
	 rob.penDown();
	 rob.setSpeed(100);
	 String call = JOptionPane.showInputDialog("Which shape do you want to draw between a triangle, circle, or square?");
	 System.out.println(call);
	 if (call.equals("triangle") ) {
		drawTriangle();
	}
	 else if (call.equals("square")) {
		drawSquare();
	}
	 
	 else if (call.equals("circle")) {
		drawCircle();
	}
	 else {
		JOptionPane.showMessageDialog(null, "Error! Enter one of the three!");
	}
}
	 
	 public static void drawSquare() {
		 Robot rob = new Robot();
		 rob.penDown();
		 rob.setSpeed(100);
	 for (int i = 0; i < 4; i++) {
		rob.move(100);
		rob.turn(-90);
	}
	 }
	
	 public static void drawTriangle() {
		 Robot rob = new Robot();
		 rob.penDown();
		 rob.setSpeed(100);
	 rob.turn(-45);
	 rob.move(100);
	 rob.turn(-90);
	 rob.move(100);
	 rob.turn(-135);
	 rob.move(100);
	 }
	 
	 public static void drawCircle() {
		 Robot rob = new Robot();
		 rob.penDown();
		 rob.setSpeed(100);
		 for (int i = 0; i < 360; i++) {
			rob.turn(1);
			rob.move(1);
		}
		 
		 
	 }

	

	
	

}

