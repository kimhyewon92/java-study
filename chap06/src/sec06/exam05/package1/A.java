package sec06.exam05.package1;

class A {
	// 필드
	public int field1;
	int field2;
	private int field3;
	
	// 생성자
	public A () {
		// 클래스 내부에서는 모두 사용 가능
		field1 = 1;
		field2 = 2;
		field3 = 3;
		
		method1();
		method2();
		method3();
	}
	
	
	// 메소드
	public void method1() {}
	void method2() {}
	private void method3() {}
	
	
}
