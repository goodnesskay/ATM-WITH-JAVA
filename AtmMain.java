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
	
			
	}

}