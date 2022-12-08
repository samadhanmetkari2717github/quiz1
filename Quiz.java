package demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import demo.MainClass;

public class Quiz {
	
	public void quizMethod() throws SQLException {
		
		Question q1 = new Question("Q1 clone()is a method of...? ", " Option.1 Object Class"," Option.2 User Class" ," Option.3 Vector Class"," Option.4 List Class");
		Question q2 = new Question("Q2 In which version leagacy class is introduced...?", " Option.1 Java 1.1 version"," Option.2 Java 1.0 Version"," Option.3 Java 1.4 Version "," Option.4 Java 1.5 Version");
		Question q3 = new Question("Q3 Static variables stored at...?", " Option.1 Heap Area "," Option.2 Method Area "," Option.3 Stack Area "," Option.4 Native Area");
        
		 Map <Question, Integer> mp= new HashMap< Question, Integer>();
		mp.put(q1, 1);
		mp.put(q2, 2);
		mp.put(q3, 2);
		
		Scanner sc= new Scanner(System.in);
		int correctAns=0;
		int wrongAns=0;
		int Total =0;
		
		for(Map.Entry<Question, Integer> map :mp.entrySet()) {
			System.out.println(map.getKey().getQuestion());
			System.out.println(map.getKey().getOption1());
			System.out.println(map.getKey().getOption2());
			System.out.println(map.getKey().getOption3());
			System.out.println(map.getKey().getOption4());
			
			System.out.println("Enter your Ans");
			
			int ans=sc.nextInt();
			int cans=Integer.compare(ans, map.getValue());
			
			if(cans==0) {
				System.out.println("Selected ans is correct");
				correctAns++;
			
			}else {
				System.out.println("Selected ans is wrong");
				wrongAns++;
			}
						
		}
		System.out.println("You entered Correct Answer= "+correctAns);
		System.out.println("You entered Wrong Answer =  "+wrongAns);
		
		
		 Total = correctAns;
		System.out.println("Your score is =  "+Total);
		
		if(Total > 3) {
			System.out.println("Good Prformance");
		}else if(Total > 2) {
			System.out.println("avarage");
		} else if(Total == 1) {
			System.out.println("fail");
		}
		
		
	}
	public static void main(String[] args) throws SQLException {
		Quiz q = new Quiz ();
		q.quizMethod();
	}
	
	
	
}
