
public class Ingredient {
	static int totalIngredients;
	/*
	 * instance fields of class
	 */
	String name;
	double cal;
	double pro;
	double carb;
	double fat;
	/**
	 * checks if current state of instance fields valid
	 */
	private void checkValid() {
		double predictedCal = 4*(pro+carb)+9*fat;
		if (cal<0 || pro<0 || carb<0 || fat<0) {
			throw new IllegalArgumentException();
		}
		else if (Math.abs(predictedCal-cal)>cal/5) {
			throw new IllegalArgumentException();
		}
	}
	/**
	 * constructor. requires all parameters or invalid
	 * @param name
	 * @param cal
	 * @param pro
	 * @param carb
	 * @param fat
	 * @param sugar
	 * @param sodium
	 */
	public Ingredient(String name, double cal, double pro, double carb, double fat) {
		this.name = name;
		this.cal = cal;
		this.pro = pro;
		this.carb = carb;
		this.fat = fat;
		try {
			checkValid();
		}
		catch (IllegalArgumentException e) {
			System.out.println("Invalid arguments. Please make sure they are accurate."); //do something if parameters are invalid
		}
		totalIngredients++;
	}
	/**
	 * constructor without protein, carbohydrate and fat
	 * @param name
	 * @param cal
	 * @param pro
	 * @param carb
	 * @param fat
	 */
	public Ingredient(String name, double cal) { //warn user that the ingredient does NOT have extensive nutritional info
		double fat = (cal/2)/9;
		double carb = cal/16;
		double pro = cal/16;
		this.name = name;
		this.cal = cal;
		this.fat = fat;
		this.carb = carb;
		this.pro = pro;
		try {
			checkValid();
		}
		catch (IllegalArgumentException e) {
			System.out.println("Invalid arguments. Please make sure they are accurate."); //do something if parameters are invalid
		}
		totalIngredients++;
	}
}
