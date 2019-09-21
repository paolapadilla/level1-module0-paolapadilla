import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JackInTheBox implements ActionListener {
       int count = 0;    
       JButton button = new JButton();
	public static void main(String[] args) {
		new JackInTheBox().showButton();
		
		

	}
public void showButton() {
	JFrame frame = new JFrame();
		JPanel panel = new JPanel();	
		frame.add(panel);
		frame.add(button);
		frame.pack();
		button.setLabel("Surprise");
		frame.setVisible(true);
		button.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	if(button.equals(e.getSource())) {
		count++;
		System.out.println("button clicked");
	}
	if(count ==5) {
		System.out.println("pressed 5 times");
	}
}


}
