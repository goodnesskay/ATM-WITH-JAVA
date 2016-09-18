
public class Data {
	private String name;
	private int password;
	
	//sets the name of the User 
	public void set_name(String fullName){
		name = fullName;
	}
	
	public String get_name(){
		return name;
	}
	
	//sets password of the users
	public void set_password(int code){
		password = code;
	}
	
	//for password verification, this gets the password
	public int get_password(){
		return password;
	}
}
