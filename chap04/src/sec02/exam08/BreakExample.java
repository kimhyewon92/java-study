package sec02.exam08;

public class BreakExample {

	public static void main(String[] args) {
		while (true) { // 무한 반복, 내부에 반복을 빠져나가는 코드가 들어갈 것임
			// 1~6까지 임의의 정수값
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			
			if (num == 6) {
				break; // 가장 가까운 반복문을 빠져나감
			}
		}
		System.out.println("프로그램 종료");
		
		int sum =0;
		int i = 1;
		while (true) {
			sum += i;
			if (sum > 1000) {
				break;
			}
			i++; // 또는 출력시 i-1
		}
		System.out.println(i +"까지의 합: "+ sum);
		
		
		
		
		
	}

}
