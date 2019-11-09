import java.applet.AudioClip;

import javax.swing.JApplet;

public class SoundEffectsMachine {

	public static void main(String[] args) {
		
		new SoundEffectsMachine().playSound("morse-code.wav");
		
		
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
