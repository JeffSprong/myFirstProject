package myFirstProject;

public class App {

	public static void main(String[] args) {
		
		double vinylItemPrice = 22.00;
		double gameItemPrice = 33.50;
		double moneyInYellowWallet = 50.00;
		double moneyInRedWallet = 120.50;
		double newMoneyInYellowWallet = moneyInYellowWallet - vinylItemPrice;
		double newMoneyInRedWallet = moneyInRedWallet - gameItemPrice;
		
		int myFirstNumberOfFriends = 3;
		int mySecondNumberOfFriends = 5;
		int myFirstAge = 18;
		int mySecondAge = 56;
		int myFirstNewFriends = myFirstAge / myFirstNumberOfFriends;
		int mySecondNewFriends = mySecondAge / mySecondNumberOfFriends;
		
		String hisFirstName = "Bob";
		String herFirstName = "Sally";
		String hisLastName = "Smith";
		String herLastName = "Rodgers";
		
		char hisMiddleInitial = 'A';
		char herMiddleInitial ='C';
		
		System.out.println("After purchasing the vinyl, the amount left in the yellow wallet is $" + newMoneyInYellowWallet + ".");
		System.out.println("After purchasing the game, the amount left in the red wallet is $" + newMoneyInRedWallet + ".");
		
		System.out.println("When I was 18 years old, I made " + myFirstNewFriends + " new friends that year.");
		System.out.println("When I was 56 years old, I made " + mySecondNewFriends + " new friends that year.");
		
		System.out.println("His full name is " + hisFirstName + " " + hisMiddleInitial + ". " + hisLastName + ".");
		System.out.println("Her full name is " + herFirstName + " " + herMiddleInitial + ". " + herLastName + ".");
		
		
	}

}
