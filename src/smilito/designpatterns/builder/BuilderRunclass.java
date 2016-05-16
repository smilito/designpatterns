package smilito.designpatterns.builder;

public class BuilderRunclass {
	
	public static void run(){
		
		System.out.println("BEGIN 	BUILDER PATTERN ================");
		
		MealBuilder mealBuilder = new MealBuilder();	
		
		System.out.println("VeggieMeal: ");
		Meal veggieMeal = mealBuilder.veggieMeal();
		veggieMeal.showItems();
		System.out.println("Total cost: " + veggieMeal.getCost());
		
		System.out.println("Meat meal: ");
		Meal meatMeal = mealBuilder.hamburgerMeal();
		meatMeal.showItems();
		System.out.println("Total cost: " + meatMeal.getCost());
		
		System.out.println("END 	BUILDER PATTERN ================");
		
	}
}
