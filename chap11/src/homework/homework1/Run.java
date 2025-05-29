package homework.homework1;

public class Run {
	
	public static void main(String[] args) {
		String str = "김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		
		String[] persons = str.split("\n");
		
		String name = "";
		int age = 0;
		String address = "";
		char gender = 0;
		
		
		for (int i = 0; i < persons.length; i++) {
				String[] personinfo = persons[i].split(",");
				for (int j = 0; j < personinfo.length; j++) {
					switch (j) {
					case 0:
						name = personinfo[j];
						break;
					case 1:
						age = Integer.parseInt(personinfo[j]);
						break;
					case 2:
						address = personinfo[j];
						break;
					case 3:
						gender = personinfo[j].charAt(0);
						break;
					}
					
				}
				Person pers = new Person(name, age, address, gender);	
				System.out.println(pers.toString());
				
		}
		
		
	}
	
	
}
