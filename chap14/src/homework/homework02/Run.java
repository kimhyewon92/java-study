package homework.homework02;

public class Run {

	public static void main(String[] args) throws Exception {
		Practice p = new Practice();
		
		long method1time = p.method1("C:\\test\\sub\\나비야1.dat");
		long method2time = p.method2("C:\\test\\sub\\나비야2.dat");
		
		System.out.println("method1 소요 시간: " + method1time + " ns");
		System.out.println("method2 소요 시간: " + method2time + " ns");
		
		
		
	}

}
