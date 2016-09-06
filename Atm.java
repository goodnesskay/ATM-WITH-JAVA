public class Atm{

	private String password;
		
	private	int option;
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

}