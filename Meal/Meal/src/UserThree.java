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
public class UserThree implements ActionListener {
	User u = User.users.get(2);
	JFrame GUI = new JFrame();
	Color orange = new Color(255, 127, 39);
	Color gray = new Color(46, 46, 46);
	JButton exit = new JButton("");
	
	JButton mealFind = new JButton("");
	JButton newIng = new JButton("");
	UserThree() {
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
		
		GUI.setSize(800, 800);
		GUI.setLayout(null);
		GUI.getContentPane().setBackground(gray);
		JLabel name = new JLabel(u.name + "'s Plan");
		name.setForeground(orange);
		name.setSize(400, 200);
		name.setFont(new Font("MV Boli", Font.BOLD, 40));
		name.setLocation(270, 0);
		GUI.add(name);
		
		JLabel mealR = new JLabel("Add meals/ings:");
		mealR.setForeground(orange);
		mealR.setSize(400, 200);
		mealR.setFont(new Font("MV Boli", Font.BOLD, 20));
		mealR.setLocation(100, 100);
		GUI.add(mealR);
		
		JLabel mealT = new JLabel("Meal plan:");
		mealT.setForeground(orange);
		mealT.setSize(400, 200);
		mealT.setFont(new Font("MV Boli", Font.BOLD, 20));
		mealT.setLocation(500, 100);
		GUI.add(mealT);
		
		mealFind.setBackground(gray);
		mealFind.setBorder(null);
		mealFind.setBounds(70, 300, 200, 200);
		mealFind.addActionListener(this);
		mealFind.setFocusable(false);
		ImageIcon i = new ImageIcon("plate.png");
		mealFind.setIcon(i);
		GUI.add(mealFind);

		newIng.setBackground(gray);
		newIng.setBorder(null);
		newIng.setBounds(400, 260, 300, 400);
		newIng.addActionListener(this);
		newIng.setFocusable(false);
		ImageIcon l = new ImageIcon("AccLogo.png");
		newIng.setIcon(l);
		GUI.add(newIng);
		
		GUI.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == exit) {
			GUI.setVisible(false);
			AddAccount a = new AddAccount();
		}
		if (e.getSource() == mealFind) {
			GUI.setVisible(false);
			AddIngredients il = new AddIngredients(u);
		}
		if (e.getSource() == newIng) {
			GUI.setVisible(false);
			MealPlanGUI g = new MealPlanGUI(u);
		}
		
	}
}
