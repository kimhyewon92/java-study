package homework.chickenJava;

public class Product {
	private String name;
	private int price;
	
	
	public Product() {
		
	}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price ;
	}
	
	
	public int calculatePrice() {
		return price * 90 / 100;
//		return (int) (price * 0.9);
	}
}
