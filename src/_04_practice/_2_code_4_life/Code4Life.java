package _04_practice._2_code_4_life;

import java.applet.AudioClip;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Code4Life {

	// 1. Ask the user how many hours they spent coding this week.
String code = JOptionPane.showInputDialog("How many hours did u spend coding this week?");
int name = Integer.parseInt(code);{
	// 2. If it is less than or equal to 2, tell them to stop watching YouTube and
	// write code instead.
	if(name <= 2) {
		JOptionPane.showMessageDialog(null, "Get off of YT and start coding!");
	}
	// 3. If it is greater than or equal to 3 AND less than or equal to 5, tell them
	// they're a Code Ninja
	if(name >= 3) {
		JOptionPane.showMessageDialog(null, "You are a code ninja!");
	}
	// 4. If it is more than 5, call the method below to play the Batman theme song.
	// NOTE: You may have to get batman.wav from league-sounds on github
if(name > 5) {
	playBatmanTheme();}
}
	private static void playBatmanTheme() {
		try {
			AudioClip sound = JApplet.newAudioClip(Code4Life.class.getResource("batman.wav"));
			sound.play();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}