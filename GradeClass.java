package demo1;


import java.util.Scanner;

public class GradeClass   {   
	
	
	public void getGrademethod()  {
	
		Quiz qz = new Quiz();
		int result = qz.Total;
		
		if(result >= 8 ) {
			System.out.println("Your Result is...." + "Grade A");
		}else if(result>=6 && result<8){
			System.out.println("Your Result is...." + "Grade B");
		}else if(result==5) {
			System.out.println("Your Result is...." + "Grade C");
		}else {
			System.out.println("Your Result is...." + "Fail");
		}
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Student Name");
		String name = scanner.nextLine();

		System.out.println("Enter Student score");
		String score = scanner.next();
		ResultStore rs = new ResultStore();
		//rs.getResult(name, score);
		
		
		
	
	}	

}
