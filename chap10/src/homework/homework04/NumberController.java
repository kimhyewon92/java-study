package homework.homework04;

public class NumberController {
	public NumberController() {}
	
	public boolean checkDouble(int num1, int num2) throws NumberRangeException{
		boolean bool = true;
		if ((num1 >= 1 && num1 <= 100) && (num2 >= 1 && num2 <= 100)) {
			if (!(num1 % num2 == 0 || num2 % num1 == 0)) {
				bool = false;
			}
		} else {
			throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");
		}
		// 매개변수로 들어온 값들이 서로 배수 관계인지 판단하여 boolean값 반환
		// 매개변수로 들어온 두 값이 1~100 사이일때
		// num1이 num2의 배수이면 true
		// num1이 num2의 배수가 아니라면 false 반환
		// 1~100사이의 숫자가 아니라면
		// NumRangeException 발생
		// 에러 메시지는 출력 값 참고
		
		return bool;
	}
}
