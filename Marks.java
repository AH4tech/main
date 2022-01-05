import java.util.*;
import java.util.Scanner;

public class Marks {
	public static void main(String[] args)
	 {
	  
		 int num ;
		 char sex;
	  Scanner reader = new Scanner(System.in);
	  
	  
	  System.out.println("Enter score: ");
	   num = reader.nextInt();
	  
	  System.out.println("Enter sex: M/F");
	   sex = reader.next().charAt(0);
		
		
		if(sex == 'F') {
			if((num >= 60)) {
				System.out.println("good Girl");
			}
			else if((num >=35)) {
				System.out.println(" avg girl");
			}
			else if((num <35)) {
				System.out.println(" dumb girl");
			}
			
		}
		
		if(sex == 'M') {
			if((num >= 60)) {
				System.out.println("Good Boy");
			}
			else if((num >=35)) {
				System.out.println(" avg boy");
			}
			else if (num < 35) {
				System.out.println("Dumb Boy");
			}
			
		}
		
		
		
		
		
		
	  
	 }

	}


