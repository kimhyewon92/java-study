package homework.homework2;

public class Practice {
	public String takeState(String s) {
		String[] sentence = s.split("\r\n");
		
		for (int i = 0; i < sentence.length; i++) {
			String[] sentenceSplit = sentence[i].split(" ");
			for (int j = 0; j < sentenceSplit.length; j++) {
				if (sentenceSplit[j].endsWith("구")) {
					System.out.println(sentenceSplit[j]);
				}
			}
		}
		return "null";
	}
}
