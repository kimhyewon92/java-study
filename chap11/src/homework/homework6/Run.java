package homework.homework6;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = "the quick brown fox jumps over the lazy dog";
		String[] sentenceWords = sentence.split(" ");
		String words = "";
		
		System.out.print("단어를 입력하세요: ");
		
		while (true) {
			words = sc.nextLine();
			
			for (int i = 0; i < sentenceWords.length; i++) {
				if (words.equals(sentenceWords[i])) {
					System.out.print(words + " 다음 단어: " + sentenceWords[i+1]);
				} else if (words.equals(sentenceWords[sentenceWords.length-1])) {
					System.out.println("마지막 단어입니다.");
					break;
				} else {
				System.out.println("존재하지 않는 단어입니다.");
				}
			}
		}
	}

}
