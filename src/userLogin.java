
public class userLogin {
	
	private String firstName, lastName;
	private String userName, password;
	private String accountType;
	
	
	public userLogin() {
		
	}
	
	public userLogin(String userName, String password, String accountType) {
		// TODO Auto-generated constructor stub
		this.userName = userName;
		this.password = password;
		this.accountType = accountType;
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
		  return firstName+"\n"+lastName+"\n"+userName + "\n"+ password + "\n"+ accountType;  
		 }  

}



