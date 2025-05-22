package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
//		Vehicle vehicle = new Vehicle();
		
		Bus bus = new Bus();
		driver.drive(bus); // 부모 타입 Vehicle 매개변수 자리에 bus가 들어가서 자동 타입 변화
		
		Taxi taxi = new Taxi();
		driver.drive(taxi); // 부모 타입 Vehicle 매개변수 자리에 taxi가 들어가서 자동 타입 변화
		
		
		
		
	}
	
}
