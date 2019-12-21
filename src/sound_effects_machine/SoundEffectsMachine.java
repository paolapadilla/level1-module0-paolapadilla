package sound_effects_machine;

import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SoundEffectsMachine implements ActionListener {
	private static JButton button1;
	private static JButton button2;
	private static JButton button3;

	public static void main(String[] args) {
		new SoundEffectsMachine().showButton();

	}

	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		JPanel panel= new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		button1 = new JButton();
		button2= new JButton();
		button3= new JButton();
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button1.addActionListener(this);
		button1.setText("Alien Spaceship UFO");
		button2.addActionListener(this);
		button2.setText("Cartoon phone Ring");
		button3.addActionListener(this);
		button3.setText("Cartoon Birds 2");

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(button1.equals(e.getSource())){
			playSound("Alien Spaceship UFO.wav");

		}
			if(button2.equals(e.getSource())){
			playSound("Cartoon-birds-2_daniel-simion.wav");

		}
		if(button3.equals(e.getSource())){
			playSound("cartoon-telephone_daniel_simion.wav");

	}





	}
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}



}
 