package sec02.exam02;

public class DriverExample {
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		driver.drive(bus);
		
		Taxi taxi = new Taxi();
		driver.drive(taxi); // 매개변수로 들어가면 Vehicle 타입으로 자동 타입변환
		
	}
	
}
