import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
public class MealGUI implements ActionListener {
	JFrame GUI = new JFrame();
	JButton myButton = new JButton("");
	JLabel text = new JLabel("View Accounts");
	MealGUI() {
		text.setForeground(new Color(255, 127, 39));
		text.setFont(new Font("MV Boli", Font.BOLD, 50));
		text.setSize(1000, 1000);
		text.setLocation(220 , 150);
		ImageIcon img = new ImageIcon ("AccLogo.png");
		myButton.setIcon(img);
		myButton.setBackground(new Color(46, 46, 46));
		myButton.setBorder(null);
		GUI.setLayout(null);
		myButton.setBounds(200, 150, 400, 400);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		GUI.setTitle("Eat Up");
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUI.add(myButton); 
		GUI.add(text);
		GUI.setSize(800, 800);
		GUI.getContentPane().setBackground(new Color(46, 46, 46));
		GUI.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == myButton) {
			
			AccountsGUI accounts = new AccountsGUI();
		}
		
	}
}
