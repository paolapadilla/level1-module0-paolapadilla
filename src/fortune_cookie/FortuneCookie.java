package fortune_cookie;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	

	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int rand = new Random().nextInt(5);
		JOptionPane.showMessageDialog(null, "Woohoo");
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You're going to have a great day!");
		} else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "Something good is going to happen!");
		} else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You're nice!");
		} else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You're cool!");
		} else if (rand == 4) {
			JOptionPane.showMessageDialog(null, "You're going to get good grades!");
		}
	}
}
