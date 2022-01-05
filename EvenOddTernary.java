import java.util.Scanner;
public class EvenOddTernary {
	public static void main(String[] args) 
	   {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Please enter a number : ");
	      int number = sc.nextInt();
	      // java odd or even
	      String strOutput = (number % 2 == 0) ? "even" : "odd";   
	      System.out.println(number + " is " + strOutput);
	      sc.close();
	   }
}
