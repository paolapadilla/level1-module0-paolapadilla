import javax.swing.JOptionPane;

public class BinaryConverter {

	public static void main(String[] args) {
		String convert(String input) {
			if(input.length()!=8){
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s,silly!!!");
			return"-";			
			}
		}
	}

}
