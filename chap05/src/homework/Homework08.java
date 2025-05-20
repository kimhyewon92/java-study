package homework;

import java.util.Arrays;

public class Homework08 {

	public static void main(String[] args) {
		String[] menu = {"Burger", "Pizza", "Pasta"};
		String[] add = {"Salad", "Soup"};

		
		System.out.print("어제 메뉴판: ");
		for (String menuEl : menu) {
			System.out.print(menuEl + ", ");
		}
		
		System.out.println();
		
		System.out.print("오늘 메뉴판: ");
		for (String menuEl : menu) {
			System.out.print(menuEl + ", ");
		}
		for (String menuEl : add) {
			System.out.print(menuEl + ", ");
		}
		
	}

}
