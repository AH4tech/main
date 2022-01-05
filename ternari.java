import java.util.Scanner;

public class ternari {
       public static void main (String[] arg) {
	
    	   int a;
    	   int b;
    	   int c;
	
	Scanner reader = new Scanner(System.in);
	  
	  
	  System.out.println("a: ");
	  a = reader.nextInt();
	  
	  System.out.println("b: ");
	   b = reader.nextInt();
	   
	   System.out.println("c ");
	   c = reader.nextInt();
	   
	   int result = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
	   System.out.println(result);
       }
}
