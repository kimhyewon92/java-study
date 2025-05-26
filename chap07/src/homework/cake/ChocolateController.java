package homework.cake;

public class ChocolateController {
	
	public String bakeChocolateCake(double flour, double cream, int cherry, int chip) {
		
		Chocolate c = new Chocolate(flour, cream, cherry, chip);
		
		return "밀가루 : " + c.getFlour() + "(g)\n"
		+ "크림 : " + c.getCream() + "(g)\n"
		+ "체리 : " + c.getCherry() + "(개)\n"
		+ "초콜릿 칩 : " + c.getChip() + "(개)\n"
		+ "초콜릿 케이크가 완성되었습니다.\n";
	}
	
	
}
