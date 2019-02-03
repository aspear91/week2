
public class week2assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tempOutside = 100;
		int hotTemp = 90;
		boolean isHotOutside = false || tempOutside >= hotTemp;
		
		
		int currentDay = 6;
		boolean isWeekday = currentDay <= 5;
		
		
		double moneyInWallet = 25.00;
		boolean hasMoneyInPocket = false || moneyInWallet > 0;
		
		
		double costOfMilk = 2.99;
		
		int thirstLevel = 6;
		
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		if (shouldBuyIcecream == true) {
			System.out.println("It's hot enough, and I have the money. I'll buy some ice cream!");
		}
		boolean willGoSwimming = isHotOutside && !isWeekday;
		if (willGoSwimming == true) {
			System.out.println("Its the weekend, and hot out. Ill go swimming!");
		}
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		if (isAGoodDay == true) {
			System.out.println("Golly, it's a good day!");
		}
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= (costOfMilk * 2);
		if (willBuyMilk == true) {
			System.out.println("The setting is just right. Time to buy some milk!");
		}
		

	}

}
