import java.util.Scanner;

public class AtmMain {
	public static void main(String[] args){
		Scanner password = new Scanner(System.in);
		String pass;
		Atm enterPassword = new Atm();
		System.out.println("Enter your ATM password: ");
		pass = password.nextLine();
		enterPassword.setPassword(pass);

		
		enterPassword.displayPassword();

		int w,x,y,z;

		w=4;
		x=1;
		y=2;
		z=3;

		System.out.println("Select an option");
		System.out.println(" 1 for withdrawal");
		System.out.println(" 2 for balance");
		System.out.println(" 3 for transfer");
		System.out.println(" 4 for Deposit");

		Scanner option= new Scanner(System.in);

		int number= option.nextInt();

		enterPassword.optionChoose(number);
		
		if(number==x || number==y || number==z || number==w){
			System.out.println("Loading...");
		}else{
			System.out.println("Invalid Command");
		} 		
	
			
	}

}