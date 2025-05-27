package homework.drinkDish;

public class MenuManager {
	
	public static void main(String[] args) {
		Menu[] menu = new Menu[5];
		
//		for (int i = 0; i < menu.length; i++) {
//			int num = (int) (Math.random() * 2) + 1;
//		}
		
		for (Menu menuEl : menu) {
			menuEl.cook();
		}
	}
}
