package homework.homework6;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = "the quick brown fox jumps over the lazy dog";
		String[] sentenceSplit = sentence.split(" ");
		String words = "";
		
		System.out.print("단어를 입력하세요: ");
		
		words = sc.nextLine();
			
		
		if (sentence.contains(words)) {
		
		for (int i = 0; i < sentenceSplit.length; i++) {
			if (words.equals(sentenceSplit[i])) {
				if (words.equals(sentenceSplit[sentenceSplit.length-1])) {
					System.out.println("마지막 단어입니다.");
					break;
					}
				System.out.print(words + " 다음 단어: " + sentenceSplit[i+1]);
			} 
		}
		
		} else {
			System.out.println("존재하지 않는 단어입니다.");
		}
		
		
		
	}

}
