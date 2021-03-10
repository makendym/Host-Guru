
public class userInfo {
	private String firstName, lastName;
	private String userName, password;
	private String accountType;
	
	
	
	public userInfo(String userName, String password, String accountType) {
		this.userName = userName;
		this.password = password;
		this.accountType = accountType;
	}
	
	public userInfo(String firstName, String lastName,String userName, String password, String accountType) {
		this.firstName = firstName;
		this.lastName =lastName;
		this.userName = userName;
		this.password = password;
		this.accountType = accountType;
		
	}
	
	
	public String getFirstName() {
		
		return firstName;
	}
	public String getLastName() {
		
		return lastName;
	}
	public String getUserName() {
		
		return userName;
	}
	public String getPassword() {
		
		return password;
	}
	public String getAccountType() {
		return accountType;
	}
	
	public void setFirstName(String firstName) {
		 this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		 this.lastName = lastName;
	}
	public void setUserName(String userName) {
		 this.userName = userName;
	}
	public void setPassword(String password) {
		 this.password = password;
	}
	public void setAccountType(String accountType) {
		 this.accountType = accountType;
	}
	
	 public String toString(){//overriding the toString() method  
		  return userName + "\n"+ password + "\n"+ accountType + "\n\n";  
		 }  

}
