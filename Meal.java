import java.util.*;
public class Meal {
	String name;
	ArrayList<Ingredient> ingredients = new ArrayList<>();
	double cal;
	double pro;
	double fat;
	double carb;
	
	private void updateStats() {
		cal = 0;
		pro = 0;
		fat = 0;
		carb = 0;
		for (int i = 0; i<ingredients.size(); i++) {
			Ingredient ing = ingredients.get(i);
			cal+=ing.cal;
			pro+=ing.pro;
			fat+=ing.fat;
			carb+=ing.carb;
		}
	}
	
	public void addIngredient(Ingredient ing) {
		ingredients.add(ing);
		updateStats();
	}
	
	private Meal(String name) {
		this.name = name;
		updateStats();
	}
	public Meal (String name, double cal) {
		this(name);
		this.cal = cal;
		updateStats();
	}
	public Meal(String name, Ingredient ing1) {
		this(name);
		ingredients.add(ing1);
		updateStats();
	}
	public Meal(String name, Ingredient ing1, Ingredient ing2) {
		this(name, ing1);
		ingredients.add(ing2);
		updateStats();
	}
	public Meal(String name, Ingredient ing1, Ingredient ing2, Ingredient ing3) {
		this(name, ing1, ing2);
		ingredients.add(ing3);
		updateStats();
	}
	public Meal(String name, ArrayList<Ingredient> ings) {
		this(name);
		for (int i = 0; i<ings.size(); i++) {
			ingredients.add(ings.get(i));
		}
		updateStats();
	}
}
