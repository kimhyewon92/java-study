package sec02.exam04;

public class DriverExample {
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi= new Taxi();
		
		driver.drive(bus); // instanceof 검사후 타입변환되어 bus.메소드() checkFare 사용
		driver.drive(taxi);
	}
	
}
