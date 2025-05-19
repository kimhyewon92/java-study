package homework;

public class Homework04 {

	public static void main(String[] args) {
		
		int[] lottoNum = new int[6];
		
		for (int i = 0; i < lottoNum.length; i++) {
			int num = (int) (Math.random() * 45) + 1;
			for (int j = 1; j < lottoNum.length; j++) {
				if (num == lottoNum[j]) {
					break;
				} else {
					lottoNum[i] = num;
				}
			}
		}
		for (int i : lottoNum) {
			System.out.print(i + " ");
		}
		
		// 오름차순 정리
		for (int i = 0; i < lottoNum.length; i++) {
			
		}
		
		
		
	}

}
