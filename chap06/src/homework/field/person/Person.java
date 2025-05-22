package homework.field.person;

public class Person {
	private String name;
	private String address;
	public String telNum;
	public double height;
	public double weight;
	
	public Person(String telNum, double height, double weight) {
		this.telNum = telNum;
		this.height = height;
		this.weight = weight;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
