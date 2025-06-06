package homework.homework03;

public class CharacterController {
	public CharacterController() {
		
	}
	
	public int countAlpha(String s) throws CharCheckException {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char word = s.charAt(i);
			if ((word >= 'a' && word <= 'z') || (word >= 'A' && word <= 'Z')) {
				count++;
			}
		}
		System.out.print("'" + s + "'" + "에 포함된 영문자 개수 : ");
		return count;
	}
	// 매개변수로 들어온 값에 영문자가 몇개 들어있는지 반환
	// 매개변수로 들어온 값에 있는 영문자를 세어 반환
	// 문자열에 공백이 있다면 CharCheckException발생, 에러 메시지는 출력 값 참고
}
