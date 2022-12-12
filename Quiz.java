package demo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Quiz {

	public static int Total = 0;

	public void getQuestion() {
		
		

		Question q1 = new Question("Q1 clone()is a method of...? ", " Option.1 Object Class", " Option.2 User Class",
				" Option.3 Vector Class", " Option.4 List Class");
		Question q2 = new Question("Q2 In which version leagacy class is introduced...?", " Option.1 Java 1.1 version",
				" Option.2 Java 1.0 Version", " Option.3 Java 1.4 Version ", " Option.4 Java 1.5 Version");
		Question q3 = new Question("Q3 Static variables are stored at...?", " Option.1 Heap Area ",
				" Option.2 Method Area ", " Option.3 Stack Area ", " Option.4 Native Area");
		Question q4 = new Question("Q4 What is  the Extention for java ...?", " Option.1 .js ", " Option.2 .java ",
				" Option.3 .txt ", " Option.4 .class");
		Question q5 = new Question("Q5 How to make String muttable... ? ",
				" Option.1 By using Builder Class & Buffer Class", " Option.2 By using object of class",
				" Option.3 By using String Object ", " Option.4 By using Constrctor");
		Question q6 = new Question("Q6 Which access specifier is used in Encapsulation...?", " Option.1 Public",
				" Option.2 Private", " Option.3 Protected", " Option.4 Defalut");
		Question q7 = new Question("Q7  ... is used to read the state of object into file ?", " Option.1 Inputstream",
				" Option.2 OutputStream", " Option.3 serialization", " Option.4 Deserialization");
		Question q8 = new Question("Q8 In wich interface duplicate keys are not allowed...?", " Option.1 SortedSet",
				" Option.2 list", " Option.3 Set", " Option.4 Map");
		Question q9 = new Question("Q9  Which keyword is used to call immediate parent class constructor...?",
				" Option.1 this. ", " Option.2 super.", " Option.3 this()", " Option.4 super()");
		Question q10 = new Question("Q10 Which of the following to string method is defined...?",
				" Option.1 java.lang.object", " Option.2 java.lang.strin", " Option.3 java.lang.util",
				" Option.4 None");

		Map<Question, Integer> mp = new HashMap<Question, Integer>();//save all correct ans 
		mp.put(q1, 1);
		mp.put(q2, 2);
		mp.put(q3, 2);
		mp.put(q4, 2);
		mp.put(q5, 1);
		mp.put(q6, 2);
		mp.put(q7, 4);
		mp.put(q8, 4);
		mp.put(q9, 4);
		mp.put(q10, 1);

		GradeClass gd = new GradeClass();
		Scanner sc = new Scanner(System.in);
		int correctCount = 0;
		int wrongCount = 0;
		
		for (Map.Entry<Question,Integer> map : mp.entrySet()) {
	               
			System.out.println(map.getKey().getQuestion());
			System.out.println(map.getKey().getOption1());
			System.out.println(map.getKey().getOption2());
			System.out.println(map.getKey().getOption3());
			System.out.println(map.getKey().getOption4());

			System.out.println("Enter your Ans");
			int userans = sc.nextInt();
			int comparedAns = Integer.compare(userans, map.getValue());
			if (comparedAns == 0) {
				System.out.println("Selected ans is correct");
				correctCount++;
			} else {
				System.out.println("Selected ans is wrong");
				wrongCount++;
			}                                                   
		}
		System.out.println("***** Exam End *****");
		System.out.println("You entered Correct Answer= " + correctCount);
		System.out.println("You entered Wrong Answer =  " + wrongCount);
		System.out.println("Your Score out of 10 is ...." + correctCount);
		Total = correctCount;
		
		
		gd.getGrademethod();
	
	}
}
