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
public class MealPlanGUI implements ActionListener {
	User u;
	Color orange = new Color(255, 127, 39);
	Color gray = new Color(46, 46, 46);
	JFrame GUI  = new JFrame();
	JButton exit = new JButton("");
	public MealPlanGUI(User u) {
		ImageIcon icon = new ImageIcon("Logo.png");
		GUI.setIconImage(icon.getImage());
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
		
		this.u = u;
		JLabel title = new JLabel(u.name + "'s Meal Plan");
		title.setForeground(orange);
		title.setSize(400, 200);
		title.setFont(new Font("MV Boli", Font.BOLD, 40));
		title.setLocation(350, 0);
		GUI.add(title);
		/*
		 * 		JLabel mealT = new JLabel("Meal plan:");
		mealT.setForeground(orange);
		mealT.setSize(400, 200);
		mealT.setFont(new Font("MV Boli", Font.BOLD, 20));
		mealT.setLocation(500, 100);
		GUI.add(mealT);
		 */
		
		JLabel breakf = new JLabel("Breakfast:");
		JLabel lunchf = new JLabel("Lunch:");
		JLabel dinnerf = new JLabel("DInner:");
		breakf.setForeground(orange); lunchf.setForeground(orange); dinnerf.setForeground(orange);
		breakf.setSize(400, 200); lunchf.setSize(400, 200); dinnerf.setSize(400, 200);
		breakf.setFont(new Font ("MV Boli", Font.BOLD, 25));
		lunchf.setFont(new Font ("MV Boli", Font.BOLD, 25));
		dinnerf.setFont(new Font ("MV Boli", Font.BOLD, 25));
		breakf.setLocation(100, 100);
		lunchf.setLocation(350, 100);
		dinnerf.setLocation(550, 100);
		
		JLabel totalInfo = new JLabel();
		totalInfo.setText("Calories: " + (int)u.calReq + " Protein: " + (int)u.proReq + " Carb: " + (int)u.carbReq
				+ " Fat: " + (int) u.fatReq);
		totalInfo.setSize(600, 200);
		totalInfo.setForeground(orange);
		totalInfo.setFont(new Font("MV Boli", Font.BOLD, 15));
		totalInfo.setLocation(150, 550);
		GUI.add(totalInfo);
		GUI.add(breakf);
		GUI.add(lunchf);
		GUI.add(dinnerf);
		
		ArrayList<Meal> breakfast = u.getBreakfast();
		ArrayList<Meal> lunch = u.getLunch();
		ArrayList<Meal> dinner = u.getDinner();
		
		String br = "<html>";
		String l = "<html>";
		String d = "<html>";
		
		for (int i = 0; i<breakfast.size(); i++) {
			br += breakfast.get(i).name + "<br/>";
		}
		br+="</html>";
		for (int i = 0; i<lunch.size(); i++) {
			l += lunch.get(i).name + "<br/>";
		}
		l+="</html>";
		for (int i = 0; i<dinner.size(); i++) {
			d += dinner.get(i).name + "<br/>";
		}
		d+="</html>";
		System.out.println(br);
		JLabel breakfastT = new JLabel(br);
		JLabel lunchT = new JLabel(l);
		JLabel dinnerT = new JLabel(d);
		
		breakfastT.setForeground(orange); lunchT.setForeground(orange); dinnerT.setForeground(orange);
		breakfastT.setFont(new Font("MV Boli", Font.BOLD, 15));
		lunchT.setFont(new Font("MV Boli", Font.BOLD, 15));
		dinnerT.setFont(new Font("MV Boli", Font.BOLD, 15));
		breakfastT.setSize(200, 600);
		lunchT.setSize(200, 600);
		dinnerT.setSize(200, 600);
		breakfastT.setLocation(100, 80);
		lunchT.setLocation(300, 80);
		dinnerT.setLocation(500, 80);
		GUI.add(breakfastT);
		GUI.add(lunchT);
		GUI.add(dinnerT);
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
		
	}
}
