package homework.cake;

public class GreenTeaController {
	
	GreenTea gt = new GreenTea();
	
	public String bakeGreenTeaCake(double flour, double cream, double powder, int cheese) {
		gt.setFlour(flour);
		gt.setCream(cream);
		gt.setPowder(powder);
		gt.setCheese(cheese);
		
		return "밀가루 : " + gt.getFlour() + "(g)\n"
				+ "크림 : " + gt.getCream() + "(g)\n"
				+ "녹차 파우더 : " + gt.getPowder() + "(g)\n"
				+ "치즈 큐브 : " + gt.getCheese() + "(개)\n"
				+ "녹차 케이크가 완성되었습니다.\n";
	}
	
}
