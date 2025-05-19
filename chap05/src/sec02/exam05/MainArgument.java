package sec02.exam05;

public class MainArgument {
	
	public static void main(String[] args) {
		// 우리가 툴에서 Run 을 실행하는 것은 결국 명령어로 java 클래스명 하는 것과 동일
		// java MainArgument 명령어와 같은 run
		System.out.println(args.length);
		
		// 툴에서 직접 argument 를 주는 방법: Run Configurations > Arguments
		// 인자값 여러개 띄어쓰기로 3 5 입력하면 문자열 배열로 만들어짐
		
		// String[] 배열 매개변수 활용하기
		if (args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0); // 프로그램(JVM) 강제 종료
			// 여기서 0은 정상 종료를 의미
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		// Quiz: 문자열을 정수(int)로 반환해서 더한 결과를 출력
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		System.out.println(num1 + num2);
		
		
		
	}
	
}
