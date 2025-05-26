package sec02.exam02;

// 실행 예외 처리
public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		// 실행예외는 컴파일에서 검사 안해줌
		try {
			data1 = args[0]; // 실행 예외 발생 ArrayIndexOutOfBoundsException
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) { // 다른 예외는 못 잡고 입력한 예외만.. exception 은 상위라 모든 예외 들어갈수있음
			System.out.println("실행 매개값의 수가 부족합니다.");
			return; // 메소드 종료
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2); // "a20" 같은 문자가 섞이면 실행 예외 발생
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
