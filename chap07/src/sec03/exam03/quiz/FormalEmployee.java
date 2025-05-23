package sec03.exam03.quiz;

public class FormalEmployee extends Employee {
	private int empNo;
	private int salary;
	
	public FormalEmployee(String name, String dept, int empNo, int salary) {
		super("정규직", name, dept);
		this.empNo = empNo;
		this.salary = salary;
	}
	
	
	
	@Override
	public int getPay() {
		return salary/12;
	}



	@Override
	public String getinfo() {
		String info = getType() + ", " + getName() + ", " + getDept() + ", " + empNo + ", " + salary;
		return info;
	}
	// 공통 출력문은 super.getInfo()활용해도 좋음..
	
	
}
