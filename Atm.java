import java.util.Scanner;

public class Atm {
	
	public static void main(String[] args){	
		//calls the Data class that sets the user name and password
		Data atmMachine = new Data();
		
		//calls the deposit class for deposit transaction
		Deposit atmDeposit = new Deposit();
		
		System.out.print("Hello, please input your name: ");
		Scanner name = new Scanner(System.in);
		String fullName = name.next();
		atmMachine.set_name(fullName);
		
		//we will echo the name of the user before asking the users password
		System.out.println("Welcome " + atmMachine.get_name());
		
		System.out.println("Enter Your Password " + atmMachine.get_name() + " : ");
		Scanner password = new Scanner(System.in);
		int code = password.nextInt();
		atmMachine.set_password(code);
		
		System.out.println("Thank you, " + atmMachine.get_name() + ". Your password has been saved");
		
		
		//Now, the user should be able to select some options in the ATM MACHINE
		System.out.println("Select from the following activities: ");
		System.out.println(" Press 1 for DEPOSIT");
		System.out.println(" Press 2 for WITHDRAWAL");
		System.out.println(" Press 3 for TRANSFER");
		
		//this takes input form the user
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		int x= 1;
		int y= 2;
		int z= 3;
		
		//now, let us do some validation on the user's input
		if(number == x || number == y || number == z){
			System.out.println("Correct Selection");
		}else{			
			System.out.println("You have made an invalid selection, Please Try Again");
		}
		
		//this handles the user's deposit request
		
		if (number == x){
			System.out.println("Please wait, your request is being processed");
			System.out.println("Your balance is " + atmDeposit.get_firstBalance() + " naira" );
			System.out.println("Deposit money into your account");
			System.out.println("How much do you want to deposit:");
			//user inputs amount to be deposited
			Scanner money = new Scanner(System.in);
			int cash = money.nextInt();
			atmDeposit.set_money(cash);
			int actualMoney = atmDeposit.get_money();
			int balance = atmDeposit.get_firstBalance() + actualMoney;
			System.out.println("Your Request is successful");
			System.out.println("Your Balance is now " + balance + "Naira");
		}
		
	}
}
