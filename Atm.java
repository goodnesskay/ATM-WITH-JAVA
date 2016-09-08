public class Atm{

	private String password;
		
	private	int option;

	private int deposit;

	public int balance;	

	public void setPassword(String pass){
	   
	password = pass; 

}

	public String getPassword(){
	
	return password;

}

	public void displayPassword(){

	System.out.println(" Your password is " + getPassword());
	}

	public void optionChoose(int number){
		
		option = number;
	}
	
	public void setBalance(int actualBalance){
	deposit= actualBalance;
}	 

	public void balance(int  mainBalance){
		balance = mainBalance; 
	}

	public int getBalance(){
		return balance;
	}  

}