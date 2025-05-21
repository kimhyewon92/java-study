package homework;

public class Student {
	private int num;
	private String name;
	private char className;
	
	Student() {
		// 객체를 생성할 때마다 자동으로 1씩 큰 값이 부여?
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
//		this.num = num;
		System.out.println("학번은 수정이 불가능합니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getClassName() {
		return className;
	}

	public void setClassName(char className) {
		this.className = className;
	}
	
	
	
}
