import java.util.Scanner;
public class Grade {
	
	 public static void main(String[] args)
	   {

	    Scanner keyboard = new Scanner(System.in);
	int score1;
	int score2;
	int score3;
	int sex;
	double ScoreAvg;
	String grade;


		System.out.print("Enter the first score: ");
          score1 = keyboard.nextInt();

          System.out.print("Enter the second score: ");
          score2 = keyboard.nextInt();

          System.out.print("Enter the third score: ");
          score3 = keyboard.nextInt();

          System.out.println("Enter sex: M/F");
           sex = keyboard.next().charAt(0);
          
          ScoreAvg = (score1 + score2 + score3)/ 3.0;
ScoreAvg = Math.round(ScoreAvg);
if (sex == 'M') {
  if(ScoreAvg > 100)
       grade = "?";
  else if(ScoreAvg >= 90) {
   grade = "A";
  System.out.println("Perfect boy");
}
else if(ScoreAvg >= 80) {
   grade = "B";
  System.out.println("good boy");
}
  else if(ScoreAvg >= 70) {
   grade = "C";
  System.out.println("avg boy");
	   }
else if(ScoreAvg >= 60) {
   grade = "D";
  System.out.println("lazy boy");
}
else {
   grade = "F";
  System.out.println("poor boy");
}

System.out.println("Average score: " + ScoreAvg + " " + grade + "\n");
}
else if (sex == 'F')
{
	  if(ScoreAvg > 100)
	       grade = "?";
	  else if(ScoreAvg >= 90) {
	   grade = "A";
	  System.out.println("Perfect girl");
	}
	else if(ScoreAvg >= 80) {
	   grade = "B";
	  System.out.println("good girl");
	}
	  else if(ScoreAvg >= 70) {
	   grade = "C";
	  System.out.println("avg girl");
		   }
	else if(ScoreAvg >= 60) {
	   grade = "D";
	  System.out.println("lazy girl");
	}
	else {
	   grade = "F";
	  System.out.println("poor girl");
	}

	System.out.println("Average score: " + ScoreAvg + " " + grade + "\n");
	
	   }
}
}
	   

