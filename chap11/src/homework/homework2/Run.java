package homework.homework2;

public class Run {

	public static void main(String[] args) {
		String s = "서울특별시 금천구 구로디지털2로 95\r\n"
				+ "서울특별시 서대문구 연희로 248\r\n"
				+ "울산광역시 남구 돋질로 233\r\n"
				+ "경상북도 구미시 송정대로 55";
		
		Practice practice = new Practice();
		System.out.println(practice.takeState(s));
		
	}
	
}
