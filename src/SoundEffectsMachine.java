import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SoundEffectsMachine implements ActionListener {
	private static JButton button1;
	private static JButton button2;
	private static JButton button3;
	private JButton button2;
	private JButton button3;

	public static void main(String[] args) { new SoundEffectsMachine().showButton();

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
			button1.addActionListener();
			button1.setText("Alien Spaceship UFO");
			button2.addActionListener();
			button2.setText("Airplane Landing Airport");
			button3.addActionListener();
			button3.setText("Heavy Rain Wind");

		}





	}


	@Override
	public void actionPerformed(ActionEvent e) {


	}
}
