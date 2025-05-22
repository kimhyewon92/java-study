package homework.field.person;

public class Run {
	
	public static void main(String[] args) {
		
		Person per1 = new Person("01012345678", 190.5, 100.2);
		Person per2 = new Person("01056434563", 175.4, 65.6);
		
		System.out.println("전화번호: " + per1.getTelNum() + " 키: " + per1.getHeight() + " 몸무게: " + per1.getWeight());
		System.out.println("전화번호: " + per2.getTelNum() + " 키: " + per2.getHeight() + " 몸무게: " + per2.getWeight());
		
	}
	
}
