package homework.cake;

public class GreenTeaController {
	
	
	public String bakeGreenTeaCake(double flour, double cream, double powder, int cheese) {
		GreenTea gt = new GreenTea(flour, cream, powder, cheese);
		
		return "밀가루 : " + gt.getFlour() + "(g)\n"
				+ "크림 : " + gt.getCream() + "(g)\n"
				+ "녹차 파우더 : " + gt.getPowder() + "(g)\n"
				+ "치즈 큐브 : " + gt.getCheese() + "(개)\n"
				+ "녹차 케이크가 완성되었습니다.\n";
	}
	
}
