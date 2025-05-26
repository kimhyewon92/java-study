package homework.galaxyiphone;

public class Run {

	public static void main(String[] args) {
		SmartPhone[] smartphone = new SmartPhone[2];
		
		smartphone[0] = new GalaxyS24();
		smartphone[1] = new Iphone15();
		
		for (SmartPhone s : smartphone) {
			s.printMaker(); 
			s.makeCall(); 
			s.takeCall(); 
			s.touch(); 
			s.charge(); 
			s.picture();
			System.out.println();
		}
	}
	

}
