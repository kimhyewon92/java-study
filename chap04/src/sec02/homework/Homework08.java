package sec02.homework;

public class Homework08 {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 4; i++) {
			System.out.print(" ");
			for (int j = 1; j <= 9 ; j++) {
				if (j >= 5-i && j <= 5+i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		
		
		
		
		
		
		
	}

}
