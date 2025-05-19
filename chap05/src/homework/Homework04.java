package homework;

public class Homework04 {

	public static void main(String[] args) {
		
		int[] lottoNum = new int[6];
		int count = 0;
		
		for (int j = 0; j < lottoNum.length; j++) {
			int num = (int) (Math.random() * 45) + 1;
			if (num == lottoNum[j]) {
				continue;
			} else {
				lottoNum[j] = num;
			}
		}
//		
//		int temp = 0;
//		for (int h = 0; h < lottoNum.length-2; h++) {
//			for (int j = 0; j < lottoNum.length-1; j++) {
//				if (lottoNum[j] > lottoNum[j+1]) {
//					temp = lottoNum[j];
//					lottoNum[j] = lottoNum[j+1];
//					lottoNum[j+1] = temp;
//				}
//			}
//		}
		
		
		for (int k : lottoNum) {
			System.out.print(k + " ");
		}
		
		
		
	}

}
