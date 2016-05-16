package smilito.designpatterns.builder;

public class MealBuilder {
	
	public Meal veggieMeal(){
		Meal meal = new Meal();
		meal.addItem(new VeggieBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
	
	public Meal hamburgerMeal(){
		Meal meal = new Meal();
		meal.addItem(new Hamburger());
		meal.addItem(new Coke());
		return meal;
	}

}
