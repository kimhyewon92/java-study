package homework;

public class EmployeeRun {

	public static void main(String[] args) {
		Employee em1 = new Employee();
		
		em1.setEmpNo(100);
		em1.setEmpName("홍길동");
		em1.setDept("영업부");;
		em1.setJob("과장");
		em1.setAge(25);
		em1.setGender('남');
		em1.setSalary(3000000);
		em1.setBonus(0.05);
		em1.setPhone("010-123-4567");
		em1.setAddress("서울시 강남구");
		
		System.out.println("=== 홍길동의 정보 ===");
		System.out.println("사번 : " + em1.getEmpNo());
		System.out.println("부서 : " + em1.getDept());
		System.out.println("직급 : " + em1.getJob());
		System.out.println("나이 : " + em1.getAge());
		System.out.println("월급 : " + em1.getSalary());
		System.out.println("전화번호 : " + em1.getPhone());
		System.out.println("주소 : " + em1.getAddress());
		
	}

}
