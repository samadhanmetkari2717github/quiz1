package demo1;


import java.util.Scanner;

public class UserName {
	
	
	public void getUserName() {
		Quiz quiz= new Quiz();
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many students want to give exam ");
		int no = sc.nextInt();
	    String pass="Welcome";
		
		
		for(int i=1;i<=no; i++) {	
			
		   System.out.println("Enter user Name");
	       String username=sc.next();
	       System.out.println("Enter password");
	       String password =sc.next();
	    
	       if(username.equals(username) && pass.equals(password)) { //check the user name and password
	    	
	       System.out.println("******  Exam Started  ******");
		   quiz.getQuestion();
	      }  else {
	    	System.out.println("You Entered Wrong Password");
	           }
	    
			}

	}
	}


