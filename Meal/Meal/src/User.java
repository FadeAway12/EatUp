import java.util.*;
public class User {
	static ArrayList<User> users = new ArrayList<>();
	String name;
	int age;
	int height;
	int weight;
	double calReq;
	double proReq;
	double fatReq;
	double carbReq;
	ArrayList<Meal> breakfast;
	ArrayList<Meal> lunch;
	ArrayList<Meal> dinner;
	ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
	ArrayList<Meal> meals = new ArrayList<Meal>();
	
	public User(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		ingredients.add(new Ingredient("Orange", 45, 0.9, 9, 0.1));
		ingredients.add(new Ingredient("Apple", 95, .5, 21, .3));
		ingredients.add(new Ingredient("Pear", 101, 0.6, 27, .3));
		ingredients.add(new Ingredient("Tomato", 22, 1.08, 3.23, .25));
		ingredients.add(new Ingredient("Rye Bread", 90, 3, 15, 1));
		ingredients.add(new Ingredient("Turkey slice", 25, 2, 0, 2));
		ingredients.add(new Ingredient("Egg", 70, 6, 0, 5));
		ingredients.add(new Ingredient("Protein powder", 117, 24, 3, 1));
		ingredients.add(new Ingredient("Cup of whole milk", 160, 8, 12, 9));
		ingredients.add(new Ingredient("100g steak", 243, 27.4, 0, 14.8));
		ingredients.add(new Ingredient("Potato", 132, 5.1, 9.2, 7.6));
		ingredients.add(new Ingredient("Butter", 102, .1, 0, 11.5));
		ingredients.add(new Ingredient("150g yogurt", 130, 14, 6, 5));
		ingredients.add(new Ingredient("Chicken Breast", 128, 26, 0, 2.7));
		ingredients.add(new Ingredient("Orange juice", 110, 2, 27, 0));
		ingredients.add(new Ingredient ("Chocolate chip cookie", 190, 2, 25, 9));
		meals.add(new Meal("Small Turkey Sandwich", 
				ingredients.get(3), ingredients.get(4), ingredients.get(2)));
		meals.get(0).addIngredient(ingredients.get(3));
		meals.add(new Meal("Orange", ingredients.get(0)));
		meals.add(new Meal("Apple", ingredients.get(1)));
		meals.add(new Meal("Scrambled Egg with Toast", ingredients.get(5), ingredients.get(5), ingredients.get(3)));
		meals.add(new Meal("Protein shake", ingredients.get(7), ingredients.get(6)));
		meals.add(new Meal("Steak slice", ingredients.get(8)));
		meals.add(new Meal ("Hard boiled egg", ingredients.get(5)));
		meals.add(new Meal ("Cup of milk", ingredients.get(7)));
		meals.add(new Meal("Chicken Breast", ingredients.get(12)));
		meals.add(new Meal("Orange juice", ingredients.get(13)));
		meals.add(new Meal("Chocolate chip cookie", ingredients.get(14)));
		Meal mashedPotatoes = new Meal("Mashed Potatoes", ingredients.get(9));
		mashedPotatoes.addIngredient(ingredients.get(10));
		meals.add(mashedPotatoes);
		meals.add(new Meal("Fruit mix", ingredients.get(0), ingredients.get(1)));
		meals.add(new Meal("Yogurt cup", ingredients.get(11)));
		calReq =(1.2)*( (10*weight)+(6.25*height)-(5*age)+5);
		carbReq = (2*calReq/4)/4;
		fatReq = (calReq/4)/9;
		proReq = (calReq/4)/4;
		users.add(this);
	}
	public void changeIntake(double pro, double carb, double fat) {
		proReq = pro;
		carbReq = carb;
		fatReq = fat;
	}
	public void addIngredient(Ingredient ing) {
		ingredients.add(ing);
	}
	public void addMeal(Meal meal) {
		meals.add(meal);
	}
	public static boolean listEqual(ArrayList<Meal> a, ArrayList<Meal> b) {
		if (a == null && b != null) {
			return false;
		}
		if (a != null && b == null) {
			return false;
		}
		boolean equal = true;
		for (int i = 0; i<Math.min(a.size(), b.size()); i++) {
			if (!a.get(i).name.equals(b.get(i).name)) {
				equal = false;
			}
		}
		return equal;
	}
	public void generateMeal() {
		getBreakfast();
		getLunch();
		getDinner();
	}
	public ArrayList<Meal> getBreakfast() {
		
		ArrayList<Meal> breakfast = new ArrayList<>();
		double minDiff = Integer.MAX_VALUE;
		for (int i = 1; i<=meals.size(); i++) {
			//generate a list with meals.size() choose i items
		    ArrayList<ArrayList<Meal>> result = getCombinations(meals, i);
		    for (int k = 0; k<result.size(); k++) {
		    	/*for (int p = 0; p<result.get(k).size(); p++) {
		    		System.out.println(result.get(k).get(p).name);
		    	}*/
		    	double diff = diffToReq(result.get(k), this.proReq/5, this.carbReq/2, this.fatReq/3);
		    	if (diff<minDiff  && !listEqual(this.breakfast, result.get(k))) {
		    		breakfast = result.get(k);
		    		minDiff = diff;
		    	}
		    }
		}
		this.breakfast = breakfast;
		return breakfast;
	}
	public ArrayList<Meal> getLunch() {
		ArrayList<Meal> lunch = new ArrayList<>();
		double minDiff = Integer.MAX_VALUE;
		for (int i = 1; i<=meals.size(); i++) {
			//generate a list with meals.size() choose i items
		    ArrayList<ArrayList<Meal>> result = getCombinations(meals, i);
		    for (int k = 0; k<result.size(); k++) {
		    	/*for (int p = 0; p<result.get(k).size(); p++) {
		    		System.out.println(result.get(k).get(p).name);
		    	}*/
		    	double diff = diffToReq(result.get(k), 2*this.proReq/5, this.carbReq/3, this.fatReq/3);
		    	if (diff<minDiff  && !listEqual(this.lunch, result.get(k))) {
		    		lunch = result.get(k);
		    		minDiff = diff;
		    	}
		    }
		}
		this.lunch = lunch;
		return lunch;
	}
	public ArrayList<Meal> getDinner() { //ignore the lunch, it means dinner here lmao
		ArrayList<Meal> dinner = new ArrayList<>();
		double minDiff = Integer.MAX_VALUE;
		for (int i = 1; i<=meals.size(); i++) {
			//generate a list with meals.size() choose i items
		    ArrayList<ArrayList<Meal>> result = getCombinations(meals, i);
		    for (int k = 0; k<result.size(); k++) {
		    	/*for (int p = 0; p<result.get(k).size(); p++) {
		    		System.out.println(result.get(k).get(p).name);
		    	}*/
		    	double diff = diffToReq(result.get(k), 2*this.proReq/5, this.carbReq/6, this.fatReq/3);
		    	if (diff<minDiff && !listEqual(this.dinner, result.get(k))) {
		    		dinner = result.get(k);
		    		minDiff = diff;
		    	}
		    }
		}
		this.dinner = dinner;
		return dinner;
	}
	/**
	 * returns list of all lists of c items from list food
	 * @param food
	 * @param c
	 * @return
	 */
	  private static ArrayList<ArrayList<Meal>> getCombinations(ArrayList<Meal> input, int n) {
		    ArrayList<ArrayList<Meal>> result = new ArrayList<>();
		    getCombinations(input, n, 0, new ArrayList<>(), result);
		    return result;
		  }

		  private static void getCombinations(ArrayList<Meal> input, int n, int start, ArrayList<Meal> temp, ArrayList<ArrayList<Meal>> result) {
		    if (temp.size() == n) {
		      result.add(new ArrayList<>(temp));
		      return;
		    }

		    for (int i = start; i < input.size(); i++) {
		      temp.add(input.get(i));
		      getCombinations(input, n, i + 1, temp, result);
		      temp.remove(temp.size() - 1);
		    }
		  }
	public double diffToReq(ArrayList<Meal> a, double pro, double carb, double fat) {
		double cal = pro*4+carb*4+fat*9;
		double sum = 0;
		int calT=0;
		int proT=0;
		int carbT=0;
		int fatT=0;
		for (int i = 0; i<a.size(); i++) {
			calT+=a.get(i).cal;
			proT+=a.get(i).pro;
			carbT+=a.get(i).carb;
			fatT+=a.get(i).fat;
		}
		//System.out.println(cal + " " + calT);
		sum = Math.abs((cal-calT))+9*Math.abs(fatT-fat)+4*Math.abs(proT-pro)+4*Math.abs(carbT-carb);
		return sum;
	}
}
//prot carb fat