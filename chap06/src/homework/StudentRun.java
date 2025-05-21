package homework;

public class StudentRun {

	public static void main(String[] args) {
		Student stud1 = new Student();
		Student stud2 = new Student();
		Student stud3 = new Student();
		
		stud1.setName("김철수");
		stud1.setClassName('A');		
		
		stud2.setName("홍길동");
		stud2.setClassName('F');		
		
		stud3.setName("이영희");
		stud3.setClassName('B');		
						
		System.out.println(stud1.getNum() + " " + stud1.getName() + " " + stud1.getClassName());
		System.out.println(stud2.getNum() + " " + stud2.getName() + " " + stud2.getClassName());
		System.out.println(stud3.getNum() + " " + stud3.getName() + " " + stud3.getClassName());
		
//		stud1.setNum(5);
	}

}
