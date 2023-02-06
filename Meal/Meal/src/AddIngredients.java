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
public class AddIngredients implements ActionListener {
	User u;
	JFrame GUI = new JFrame();
	Color orange = new Color(255, 127, 39);
	Color gray = new Color(46, 46, 46);
	JButton exit = new JButton();
	
	JTextField ingCal = new JTextField(2);
	JTextField ingName = new JTextField(2);
	JTextField ingPro = new JTextField(2);
	JTextField ingCarb = new JTextField(2);
	JTextField ingFat = new JTextField(2);
	JButton B  = new JButton("Add Ingredient");
	
	JButton M = new JButton("Add meal");
	
	JTextField mealName = new JTextField(2);
	JTextField ing1 = new JTextField(2);
	JTextField ing2 = new JTextField(2);
	JTextField ing3 = new JTextField(3);
	
	public AddIngredients(User u) {
		ImageIcon icon = new ImageIcon("Logo.png");
		GUI.setIconImage(icon.getImage());
		this.u = u;
		GUI.setSize(800, 800);
		GUI.setLayout(null);
		GUI.getContentPane().setBackground(gray);
		GUI.setSize(800, 800);
		exit.setBackground(gray);
		exit.setBorder(null);
		exit.addActionListener(this);
		exit.setBounds(0, 0, 200, 120);
		ImageIcon f = new ImageIcon("backArrow.png");
		exit.setIcon(f);
		exit.setLocation(20, 20);
		GUI.add(exit);
		
		JLabel nameP = new JLabel("Name:");
		nameP.setForeground(orange);
		nameP.setSize(200, 200);
		nameP.setFont(new Font("MV Boli", Font.BOLD, 25));
		nameP.setLocation(100, 100);
		GUI.add(nameP);
		ingName.setLocation(200, 190);
		ingName.setBackground(orange);
		ingName.setBorder(null);
		ingName.setSize(new Dimension(150, 30));
		GUI.add(ingName);
		
		JLabel heightP = new JLabel("Calories:");
		heightP.setForeground(orange);
		heightP.setSize(200, 200);
		heightP.setFont(new Font("MV Boli", Font.BOLD, 25));
		heightP.setLocation(100, 200);
		GUI.add(heightP);
		GUI.setVisible(true);
		ingCal.setLocation(200, 285);
		ingCal.setBackground(orange);
		ingCal.setBorder(null);
		ingCal.setSize(new Dimension(150, 30));
		GUI.add(ingCal);
		
	
		JLabel AgeP = new JLabel("Protein:");
		AgeP.setForeground(orange);
		AgeP.setSize(200, 200);
		AgeP.setFont(new Font("MV Boli", Font.BOLD, 25));
		AgeP.setLocation(100, 300);
		GUI.add(AgeP);
		GUI.setVisible(true);
		ingPro.setLocation(200, 390);
		ingPro.setBackground(orange);
		ingPro.setBorder(null);
		ingPro.setSize(new Dimension(150, 30));
		GUI.add(ingPro);
		
		

		JLabel weightP = new JLabel("Carb:");
		weightP.setForeground(orange);
		weightP.setSize(200, 200);
		weightP.setFont(new Font("MV Boli", Font.BOLD, 25));
		weightP.setLocation(100, 400);
		GUI.add(weightP);
		GUI.setVisible(true);
		ingCarb.setLocation(200,490);
		ingCarb.setBackground(orange);
		ingCarb.setBorder(null);
		ingCarb.setSize(new Dimension(150, 30));
		GUI.add(ingCarb);
		
		JLabel fat = new JLabel("Fat:");
		fat.setForeground(orange);
		fat.setSize(200, 200);
		fat.setFont(new Font("MV Boli", Font.BOLD, 25));
		fat.setLocation(100, 500);
		GUI.add(fat);
		GUI.setVisible(true);
		ingFat.setLocation(200,590);
		ingFat.setBackground(orange);
		ingFat.setBorder(null);
		ingFat.setSize(new Dimension(150, 30));
		GUI.add(ingFat);
		
		GUI.add(B);
		B.setLocation(200,650);
		B.setSize(150,50);
		GUI.setVisible(true);
		B.setFont(new Font("MV Boli", Font.BOLD, 15));
		B.setForeground(gray);
		B.setBackground(orange);
		B.setFocusable(false);
		B.setBorder(null);
		B.addActionListener(this);
		
		JLabel mName = new JLabel("Name:");
		mName.setForeground(orange);
		mName.setSize(200, 200);
		mName.setFont(new Font("MV Boli", Font.BOLD, 25));
		mName.setLocation(400, 100);
		GUI.add(mName);
		GUI.setVisible(true);
		mealName.setLocation(500,190);
		mealName.setBackground(orange);
		mealName.setBorder(null);
		mealName.setSize(new Dimension(150, 30));
		GUI.add(mealName);
		
		JLabel i1 = new JLabel("Ing 1:");
		i1.setForeground(orange);
		i1.setSize(200, 200);
		i1.setFont(new Font("MV Boli", Font.BOLD, 25));
		i1.setLocation(400, 200);
		GUI.add(i1);
		GUI.setVisible(true);
		ing1.setLocation(500, 285);
		ing1.setBackground(orange);
		ing1.setBorder(null);
		ing1.setSize(new Dimension(150, 30));
		GUI.add(ing1);
		
	
		JLabel i2 = new JLabel("Ing 2:");
		i2.setForeground(orange);
		i2.setSize(200, 200);
		i2.setFont(new Font("MV Boli", Font.BOLD, 25));
		i2.setLocation(400, 300);
		GUI.add(i2);
		GUI.setVisible(true);
		ing2.setLocation(500, 390);
		ing2.setBackground(orange);
		ing2.setBorder(null);
		ing2.setSize(new Dimension(150, 30));
		GUI.add(ing2);
		
		

		JLabel i3 = new JLabel("Ing 3:");
		i3.setForeground(orange);
		i3.setSize(200, 200);
		i3.setFont(new Font("MV Boli", Font.BOLD, 25));
		i3.setLocation(400, 400);
		GUI.add(i3);
		GUI.setVisible(true);
		ing3.setLocation(500,490);
		ing3.setBackground(orange);
		ing3.setBorder(null);
		ing3.setSize(new Dimension(150, 30));
		GUI.add(ing3);
		

		
		GUI.add(M);
		M.setLocation(400,650);
		M.setSize(150,50);
		GUI.setVisible(true);
		M.setFont(new Font("MV Boli", Font.BOLD, 15));
		M.setForeground(gray);
		M.setBackground(orange);
		M.setFocusable(false);
		M.setBorder(null);
		M.addActionListener(this);
		
		GUI.setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == exit) {
			GUI.setVisible(false);
			if (u.name == User.users.get(0).name) {
				UserOne u = new UserOne();
			}
			if (u.name == User.users.get(1).name) {
				UserTwo u2 = new UserTwo();
			}
			if (u.name == User.users.get(2).name) {
				UserThree u3 = new UserThree();
			}
		}
		if (arg0.getSource() == B) {
			String name = ingName.getText();
			int cal = Integer.parseInt(ingCal.getText());
			int pro = Integer.parseInt(ingPro.getText());
			int carb = Integer.parseInt(ingCarb.getText());
			int fat = Integer.parseInt(ingFat.getText());
			u.addIngredient(new Ingredient(name, cal, pro, carb, fat));
			for (int i = 0; i<u.ingredients.size(); i++) {
				System.out.println(u.ingredients.get(i).name);
			}
		}
		if (arg0.getSource() == M) { //add meal
			String mealText = mealName.getText();
			String ingName1 = ing1.getText();
			String ingName2 = ing2.getText();
			String ingName3 = ing3.getText();
			int count = 0;
			Ingredient ing1 = null; Ingredient ing2 = null; Ingredient ing3 = null;
			for (int i = 0; i<u.ingredients.size(); i++) {
				Ingredient ing = u.ingredients.get(i);
				if (ing.name.equals(ingName1)) {
					count++;
					ing1 = ing;
				}
				if (ing.name.equals(ingName2)) {
					count++;
					ing2 = ing;
				}
				if (ing.name.equals(ingName3)) {
					count++;
					ing3 = ing;
				}
			}
			if (count == 1) {
				u.meals.add(new Meal(mealText, ing1));
			}
			if (count == 2) {
				u.meals.add(new Meal(mealText, ing1, ing2));
			}
			if (count == 3) {
				u.meals.add(new Meal(mealText, ing1, ing2, ing3));
			}
			for (int i = 0; i<u.meals.size(); i++) {
				System.out.println(u.meals.get(i).name);
			}
		}
		
	}
}
