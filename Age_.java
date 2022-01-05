import java.util.Scanner;
public class Age_ {
	
public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		System.out.println("Enter sex: M/F");
		int sex = sc.next().charAt(0);
		
	
		if(sex == 'F') {
			if((age >= 20)) {
				System.out.println("Women");
			}
			else if((age <20)) {
				System.out.println("girl");
			}
			
		}
		
		
		if(sex == 'M') {
			if((age >= 25)) {
				System.out.println("Men");
			}
			else if (age < 25) {
				System.out.println("Boy");
			}
			else {
				System.out.println("ERROR");
			}
		}
	}
}
