import javax.swing.Icon;
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
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
public class AccountsGUI implements ActionListener{
	Color orange = new Color(255, 127, 39);
	Color gray = new Color(46, 46, 46);
	JFrame GUI = new JFrame();
	JButton addButton = new JButton("");
	JButton buttonOne = new JButton("");
	JButton buttonTwo = new JButton("");
	JButton buttonThree = new JButton("");
	JButton exit = new JButton("");
	AccountsGUI() {
		ImageIcon icon = new ImageIcon("Logo.png");
		GUI.setIconImage(icon.getImage());
		GUI.setTitle("Eat Up");
		GUI.setLayout(null);

		GUI.setSize(800, 800);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUI.getContentPane().setBackground(gray);
		if (User.users.size() == 0) {
			addButton.setBackground(gray);
			addButton.setBorder(null);
			addButton.setBounds(200, 150, 480, 400);
			addButton.setFocusable(false);
			addButton.addActionListener(this);
			ImageIcon img = new ImageIcon ("AccLogoP.png");
			addButton.setIcon(img);
			JLabel text = new JLabel("Create Account");
			text.setForeground(orange);
			text.setFont(new Font("MV Boli", Font.BOLD, 50));
			text.setSize(1000, 1000);
			text.setLocation(220 , 150);
			GUI.add(text);
			GUI.add(addButton);
			
			exit.setBackground(gray);
			exit.setBorder(null);
			exit.addActionListener(this);
			exit.setBounds(0, 0, 200, 120);
			ImageIcon f = new ImageIcon("backArrow.png");
			exit.setIcon(f);
			exit.setLocation(20, 20);
			GUI.add(exit);
		}
		if (User.users.size() == 1) {
			System.out.println("hi");
			JLabel textOne = new JLabel(User.users.get(0).name);
			buttonOne.setBackground(gray);
			buttonOne.setBorder(null);
			buttonOne.setBounds(50, 150, 300, 300);
			buttonOne.setFocusable(false);
			buttonOne.addActionListener(this);
			ImageIcon img2 = new ImageIcon("AccLogo.png");
			img2 = resizeIcon(img2, 141, 240); //109:184 ratio
			buttonOne.setIcon(img2);
			textOne.setSize(1000, 1000);
			textOne.setForeground(orange);
			textOne.setFont(new Font("MV Boli", Font.BOLD, 40));
			textOne.setLocation(130, 70);
			GUI.add(textOne);
			GUI.add(buttonOne);
			
			
			JLabel addText = new JLabel("Create Account");
			addButton.setBackground(gray);
			addButton.setBorder(null);
			addButton.setBounds(450, 150, 270, 300);
			addButton.setFocusable(false);
			addButton.addActionListener(this);
			ImageIcon imgAdd = new ImageIcon("AccLogoP.png"); //354:364 ratio
			imgAdd = resizeIcon(imgAdd, 240, 240);
			addButton.setIcon(imgAdd);
			addText.setSize(1000, 1000);
			addText.setForeground(orange);
			addText.setFont(new Font ("MV Boli", Font.BOLD, 40));
			addText.setLocation(420, 70);
			GUI.add(addText);
			GUI.add(addButton);
		}
		if (User.users.size() == 2) {
			JLabel textOne = new JLabel(User.users.get(0).name);
			JLabel textTwo = new JLabel(User.users.get(1).name);
			JLabel addText = new JLabel("Create Account");
			buttonOne.setBackground(gray);
			buttonOne.setBorder(null);
			buttonOne.setBounds(25, 150, 250, 300);
			buttonOne.setFocusable(false);
			buttonOne.addActionListener(this);
			ImageIcon imgAdd = new ImageIcon("AccLogo.png");
			imgAdd = resizeIcon(imgAdd, 130, 221); //*1.2
			buttonOne.setIcon(imgAdd);
			textOne.setSize(1000, 1000);
			textOne.setForeground(orange);
			textOne.setFont(new Font("MV Boli", Font.BOLD, 30));
			textOne.setLocation(100, 0);
			textTwo.setSize(1000, 1000);
			textTwo.setForeground(orange);
			textTwo.setFont(new Font ("MV Boli", Font.BOLD, 30));
			textTwo.setLocation(300, 0);
			addText.setSize(1000, 1000);
			addText.setForeground(orange);
			addText.setFont(new Font ("MV Boli", Font.BOLD, 30));
			addText.setLocation(500, 0);
			addText.setSize(1000, 1000);
			GUI.add(textOne);
			GUI.add(textTwo);
			GUI.add(addText);
			GUI.add(buttonOne);
			
			buttonTwo.setBackground(gray);
			buttonTwo.setBorder(null);
			buttonTwo.setBounds(215, 150, 250, 300);
			buttonTwo.setFocusable(false);
			buttonTwo.addActionListener(this);
			buttonTwo.setIcon(imgAdd);
			GUI.add(buttonTwo);
			
			addButton.setBackground(gray);
			addButton.setBorder(null);
			addButton.setBounds(500, 150, 250, 300);
			addButton.setFocusable(false);
			addButton.addActionListener(this);
			ImageIcon imgAdd2 = new ImageIcon("AccLogoP.png"); //354:364 ratio
			imgAdd2 = resizeIcon(imgAdd2, 240, 240);
			addButton.setIcon(imgAdd2);
			GUI.add(addButton);
		}
		if (User.users.size() == 3) {
			JLabel textOne = new JLabel(User.users.get(0).name);
			JLabel textTwo = new JLabel(User.users.get(1).name);
			JLabel textThree = new JLabel(User.users.get(2).name);
			JLabel addText = new JLabel("Create Account");
			buttonOne.setBackground(gray);
			buttonOne.setBorder(null);
			buttonOne.setBounds(0, 135, 200, 325);
			buttonOne.setFocusable(false);
			buttonOne.addActionListener(this);
			ImageIcon imgAdd = new ImageIcon("AccLogo.png");
			imgAdd = resizeIcon(imgAdd, 109, 184); //*1.2
			buttonOne.setIcon(imgAdd);
			textOne.setSize(1000, 1000);
			textOne.setForeground(orange);
			textOne.setFont(new Font("MV Boli", Font.BOLD, 30));
			textOne.setLocation(50, 0);
			textTwo.setSize(1000, 1000);
			textTwo.setForeground(orange);
			textTwo.setFont(new Font ("MV Boli", Font.BOLD, 30));
			textTwo.setLocation(240, 0);
			addText.setSize(1000, 1000);
			addText.setForeground(orange);
			addText.setFont(new Font ("MV Boli", Font.BOLD, 30));
			addText.setLocation(500, 0);
			addText.setSize(1000, 1000);
			GUI.add(textOne);
			GUI.add(textTwo);
			GUI.add(addText);
			GUI.add(buttonOne);
			
			textThree.setSize(1000, 1000);
			textThree.setForeground(orange);
			textThree.setFont(new Font("MV Boli", Font.BOLD, 30));
			textThree.setLocation(380, 0);
			GUI.add(textThree);
			buttonTwo.setBackground(gray);
			buttonTwo.setBorder(null);
			buttonTwo.setBounds(175, 150, 200, 300);
			buttonTwo.setFocusable(false);
			buttonTwo.addActionListener(this);
			buttonTwo.setIcon(imgAdd);
			GUI.add(buttonTwo);
			
			buttonThree.setBackground(gray);
			buttonThree.setBorder(null);
			buttonThree.setBounds(330, 150, 200, 300);
			buttonThree.setFocusable(false);
			buttonThree.addActionListener(this);
			buttonThree.setIcon(imgAdd);
			GUI.add(buttonThree);
			
			addButton.setBackground(gray);
			addButton.setBorder(null);
			addButton.setBounds(525, 150, 250, 300);
			addButton.setFocusable(false);
			addButton.addActionListener(this);
			ImageIcon imgAdd2 = new ImageIcon("AccLogoP.png"); //354:364 ratio
			imgAdd2 = resizeIcon(imgAdd2, 175, 180);
			addButton.setIcon(imgAdd2);
			GUI.add(addButton);
		}
		GUI.setVisible(true);
	}
	private static ImageIcon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
	    Image img = icon.getImage();  
	    Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);  
	    return new ImageIcon(resizedImage);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addButton) {
			//create new account
			if (User.users.size() == 3) {
				JLabel error = new JLabel("Error: Max users reaached");
				error.setForeground(new Color (255, 0, 0));
				error.setSize(1000, 100);
				error.setFont(new Font("MV Boli", Font.BOLD, 30));
				error.setLocation(200, 0);
				GUI.add(error);
				GUI.repaint();
			}
			else {
				GUI.setVisible(false);
				AddAccount makeAcc = new AddAccount();
			}
		}
		if (e.getSource() == buttonOne) {
			GUI.setVisible(false);
			UserOne u = new UserOne();
		}
		if (e.getSource() == buttonTwo) {
			GUI.setVisible(false);
			UserTwo u = new UserTwo();
		}
		if (e.getSource() == buttonThree) {
			GUI.setVisible(false);
			UserThree u = new UserThree();
		}
		if (e.getSource() == exit) {
			GUI.setVisible(false);
			MealGUI m = new MealGUI();
			System.out.println("hi");
		}

	}
	
	
}
