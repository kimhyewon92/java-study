package homework.drinkDish;

public class MenuManager {
	
	public static void main(String[] args) {
		Menu[] menu = new Menu[5];
		
//		menu[0] = new Dish("김밥", 6000, "...");
		
		for (Menu menuEl : menu) {
			menuEl.cook();
		}
	}
}
