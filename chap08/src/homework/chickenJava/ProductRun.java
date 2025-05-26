package homework.chickenJava;

public class ProductRun {

	public static void main(String[] args) {
		Product item1 = new Food("치킨", 20000, 3);
		Product item2 = new Book("자바의 정석", 15000);
		
		System.out.println(item1.getName() + "의 최종 가격 : " + item1.calculatePrice());
		System.out.println(item2.getName() + "의 최종 가격 : " + item2.calculatePrice());
		
	}

}
