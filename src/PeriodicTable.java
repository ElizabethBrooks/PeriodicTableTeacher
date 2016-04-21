/* //http://www.youtube.com/watch?v=70v1DE1CxLs

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;


public class PeriodicTable extends JFrame {
	
	public PeriodicTable() {
		setupPanel();
	}

	//Panel formatting
	private void setupPanel(){
		getContentPane().setBackground(new Color(255, 255, 204));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
	}
}
*/
