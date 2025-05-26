package homework.gasolineElectric;

public class Run {

	public static void main(String[] args) {
		Engine engine1 = new GasolineEngine();
		Car car1 = new Car(engine1);
		car1.startEngine();
		
		System.out.println("------------------------");
		
		Engine engine2 = new ElectricEngine();
		Car car2 = new Car(engine2);
		car2.startEngine();
	}

}
