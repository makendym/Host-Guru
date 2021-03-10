import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

public class hostGuru {
	  
	  String firstName, lastName, userName,password,accountType;
	  HashMap<String, String> hmap = new HashMap<String, String>();
	  ArrayList<userLogin> userLog = new ArrayList<userLogin>();
	  ArrayList<userInfo> list = new ArrayList<userInfo>();
	  userLogin userLogin;
	  userInfo user;
	  Scanner ui = new Scanner(System.in);
	  int x = 1;
	public void createAccount() {
		    
			System.out.println("Enter First Name : ");
			firstName = ui.nextLine();
			System.out.println("Enter Last Name : ");
			lastName = ui.nextLine();
			
			System.out.println("Enter New Username : ");
			userName = ui.nextLine();
		
			System.out.println("Enter  New Password : ");
			password = ui.nextLine();
			
			System.out.println("Enter Account Type : ");
			accountType = ui.nextLine();
//			userInfo user;
			//user = new userInfo(firstName,lastName,userName,password,accountType);
			user = new userInfo(firstName,lastName,userName,password, accountType);
			list.add(user);
		
			 printList();
		}

	public void userInterface() {
			
			

			//Genral introduction
			System.out.println("Welcome to Host Guru!\n");
			System.out.println("1. Login");
			System.out.println("2. Create account");
			Scanner ui = new Scanner(System.in);
			int option = ui.nextInt();
			ui.nextLine(); 

		
			if(option == 2) {	
				
				createAccount();
//				System.out.println("1. Login");
//				System.out.println("2. Create account");
//				 option = ui.nextInt();
				}else{
					loginAccount();
					//System.out.println(" This is not a valid option ");
				 }
				
				 
			}
			
			
	
	
	public void loginAccount() {
		System.out.println("Enter Username : ");
		userName = ui.nextLine();
	
		System.out.println("Enter Password : ");
		password = ui.nextLine();
		
		System.out.println("Enter Account Type : ");
		accountType = ui.nextLine();
//		userLogin userLogin;
		userLogin = new userLogin(userName,password,accountType);
		
		userLog.add(userLogin);
		boolean successful = true;
		Iterator<userInfo> userIn = list.iterator();
        while (userIn.hasNext()) {
            userInfo product = userIn.next();
          successful = product.getUserName().contains(userLogin.getUserName());
           
        }
        if (successful) {
        	System.out.println("You are now logged in... \n\n");
        	welcomeHost();
		        
		    }else{
		    System.out.println("Message : Sorry this username or password is invalid \n");
		    }
	}
	
	 public void welcomeHost() {
		
		System.out.println("Hey there, " + userLogin.getUserName() + " \n");
		System.out.println("Welcome to Host Guru! The planner that makes your life simple :\n");
	}
	
	 public void welcomeGuest() {
//			System.out.println("Hey there," + getUsername() + "! .Welcome to Host Guru\n");
		}
	 public void hostAccount() {
		
		System.out.print("What are you looking for your guest to bring at this event :\n");
		for(int i = 0; i < 3; i++) {
		String item = ui.nextLine();
		//items.add(item);
		}
	}
	
	 public void guestAccount() {
		
//		System.out.print("What are you bring at this event :\n");
//		for (int i = 0; i < items.size(); i++) {
//		      System.out.println( (i+1) +". "+ items +"\n");
//		    }
//		
//		
//		String bringing = ui.nextLine();
//		list.add(bringing);
	}
	
	void printList() {
		System.out.print("Your list of names \n");
		//int numberOfUser = 7;
		for(userInfo userInfo : list) {
            System.out.println(userInfo.toString());
        }
	}
	void printGuesList() {
//		System.out.print("items guest will bring \n");
//		for (int i = 0; i < list.size(); i++) {
//		      System.out.println(list.get(i) +"\n");
//		    }
	}
//	void guestAccount1() {
//		System.out.print("Welcome guest!");
//		System.out.print("Who is your host :");
//		String item = ui.nextLine();
//		ArrayList<String> items = new ArrayList<String>();
//		items.add(item);
//	}
	
	
	
	
	
	
	
	
	
	
	
//	void createAccount() {
//		System.out.println("Enter Username : ");
//		 username = ui.nextLine();
//	
//		System.out.println("Enter Password : ");
//		password = ui.nextLine();
//		
//		hmap.put(username, password);
//	}
//	void addAccount(String user, String pass){
//		
//		hmap.put(user,pass);
//	}
//	void display(){
//		Set set = hmap.entrySet();
//	      Iterator iterator = set.iterator();
//	      while(iterator.hasNext()) {
//	         Map.Entry mentry = (Map.Entry)iterator.next();
//	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
//	         System.out.println(mentry.getValue());
//	      }
//
//	}
	}
