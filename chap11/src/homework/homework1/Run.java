package homework.homework1;

public class Run {
	
	public static void main(String[] args) {
		String str = "김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		
		String[] persons = str.split("\n");

		for (int i = 0; i < persons.length; i++) {
				String[] person = persons[i].split(",");
		}
		
	}
	
	
}
