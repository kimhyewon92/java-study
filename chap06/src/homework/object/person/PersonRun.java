package homework.object.person;

import homework.object.person.open.Person;

public class PersonRun {

	public static void main(String[] args) {
		
		// open package
		Person per1 = new Person();
		
		per1.name = "김철수";
		per1.age = 20;
		
		System.out.println(per1.name + "는 " + per1.age + "살 입니다.");
		
		// close package
		homework.object.person.close.Person per2 = new homework.object.person.close.Person();
		
		per2.setName("김철수");
		per2.setAge(20);
		
		System.out.println(per2.getName() + "는 " + per2.getAge() + "살 입니다.");
	}

}
