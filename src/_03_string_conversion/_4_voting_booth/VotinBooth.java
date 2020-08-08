package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotinBooth {

	public static void main(String[] args) {
		String quantity = JOptionPane.showInputDialog("How old are you in years");
		int years = Integer.parseInt(quantity);
		if (years>17){
			JOptionPane.showMessageDialog(null, "Who do you think the next president should be?");
		}
		else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think");
		}
	}
}
