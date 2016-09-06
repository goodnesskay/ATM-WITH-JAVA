public class Atm{

	private String password;
		

	public void setPassword(String pass){
	   
	password = pass; 

}

	public String getPassword(){
	
	return password;

}

	public void displayPassword(){

	System.out.println(" Your password is " + getPassword());
	}	   

}