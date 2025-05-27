package homework.homework02;

public class UnSupportedException extends RuntimeException{
	public UnSupportedException(String message) {
		super(message); // 부모 생성자에 예외 메시지 전달
	}
}
