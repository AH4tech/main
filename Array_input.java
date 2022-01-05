import java.util.Scanner;
import java.util.*;

public class Array_input {
	
	public static void main(String[] arg) {
	int N;
	int X;
	int i;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of element of array");
	N = sc.nextInt();
	
	int[]array = new int[N];
	System.out.print("element of array");
	
	
	for( i=0;i<N;i++) {
	    	 array[i]= sc.nextInt();
	    	
	     }
	     System.out.println("element of array are:");
    for( i=0;i<N;i++) {
	    	 System.out.println( array[i ]);
    }	 
	    	 System.out.print("Enter the Divider: ");
	    		X = sc.nextInt();
	    		
	    	if(array[i]%X==0) {
	    		System.out.println(array[i]);
	    	}
	    	else
	    	System.out.println("-1");
	     
		
		
	}
	
}
