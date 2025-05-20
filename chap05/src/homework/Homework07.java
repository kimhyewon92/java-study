package homework;

import java.util.Arrays;

public class Homework07 {

	public static void main(String[] args) {

		String[] report = {"Introduction", "Research", "Conclusion"};
		
		String[] newReport = Arrays.copyOf(report, report.length);
		
		newReport[0] = "Team Feedback";
		
		System.out.print("원본 보고서: ");
		for (String i : report) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		
		System.out.print("복사된 보고서: ");
		for (String i : newReport) {
			System.out.print(i + ", ");
		}
	}

}
