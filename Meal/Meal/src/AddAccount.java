import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.util.*;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
public class AddAccount implements ActionListener {
	JFrame GUI = new JFrame();
	JButton exit = new JButton("");
	JTextField Weight = new JTextField(2);
	JTextField name = new JTextField(2);
	JTextField height = new JTextField(2);
	JTextField Age = new JTextField(2);
	JButton B  = new JButton("Submit");
	Color orange = new Color(255, 127, 39);
	Color gray = new Color(46, 46, 46);
	
	AddAccount() {
		ImageIcon icon = new ImageIcon("Logo.png");
		GUI.setIconImage(icon.getImage());
		exit.setBackground(gray);
		exit.setBorder(null);
		exit.addActionListener(this);
		exit.setBounds(0, 0, 200, 120);
		ImageIcon f = new ImageIcon("backArrow.png");
		exit.setIcon(f);
		exit.setLocation(20, 20);
		GUI.add(exit);
		
		GUI.getContentPane().setBackground(gray);
		GUI.setSize(800, 800);
		GUI.setLayout(null);
		JLabel prompt = new JLabel("Enter:");
		prompt.setForeground(orange);
		prompt.setFont((new Font("MV Boli", Font.BOLD, 50)));
		prompt.setSize(200, 200);
		prompt.setLocation(300, 00);
		GUI.add(prompt);

		
		JLabel nameP = new JLabel("Name:");
		nameP.setForeground(orange);
		nameP.setSize(200, 200);
		nameP.setFont(new Font("MV Boli", Font.BOLD, 25));
		nameP.setLocation(100, 100);
		GUI.add(nameP);
		name.setLocation(200, 190);
		name.setBackground(orange);
		name.setBorder(null);
		name.setSize(new Dimension(150, 30));
		GUI.add(name);
		
	
		JLabel heightP = new JLabel("Height:");
		heightP.setForeground(orange);
		heightP.setSize(200, 200);
		heightP.setFont(new Font("MV Boli", Font.BOLD, 25));
		heightP.setLocation(100, 200);
		GUI.add(heightP);
		GUI.setVisible(true);
		height.setLocation(200, 285);
		height.setBackground(orange);
		height.setBorder(null);
		height.setSize(new Dimension(150, 30));
		GUI.add(height);
		
	
		JLabel AgeP = new JLabel("Age:");
		AgeP.setForeground(orange);
		AgeP.setSize(200, 200);
		AgeP.setFont(new Font("MV Boli", Font.BOLD, 25));
		AgeP.setLocation(100, 300);
		GUI.add(AgeP);
		GUI.setVisible(true);
		Age.setLocation(200, 390);
		Age.setBackground(orange);
		Age.setBorder(null);
		Age.setSize(new Dimension(150, 30));
		GUI.add(Age);
		
		

		JLabel WeightP = new JLabel("Weight:");
		WeightP.setForeground(orange);
		WeightP.setSize(200, 200);
		WeightP.setFont(new Font("MV Boli", Font.BOLD, 25));
		WeightP.setLocation(100, 400);
		GUI.add(WeightP);
		GUI.setVisible(true);
		Weight.setLocation(200,490);
		Weight.setBackground(orange);
		Weight.setBorder(null);
		Weight.setSize(new Dimension(150, 30));
		GUI.add(Weight);
		
		GUI.add(B);
		B.setLocation(450,310);
		B.setSize(200,75);
		GUI.setVisible(true);
		B.setFont(new Font("MV Boli", Font.BOLD, 25));
		B.setForeground(gray);
		B.setBackground(orange);
		B.setFocusable(false);
		B.setBorder(null);
		B.addActionListener(this);
		
		
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == B) {
			int age = Integer.parseInt(Age.getText());
			int weight =  Integer.parseInt(Weight.getText());
			int Height = Integer.parseInt(height.getText());
			String name1 = name.getText();
			User u = new User(name1,age,Height,weight);
			if (User.users.size() == 1) {
				GUI.setVisible(false);
				UserOne user = new UserOne();
			}
			if (User.users.size() == 2) {
				GUI.setVisible(false);
				UserTwo user2 = new UserTwo();
			}
			if (User.users.size() == 3) {
				GUI.setVisible(false);;
				UserThree user3 = new UserThree();
			}

	}
		if (arg0.getSource() == exit) {
			GUI.setVisible(false);
			AccountsGUI a = new AccountsGUI();
		}
		
		
	}

}
