package programs;
import java.util.*;


public class scannerclass {

	public static void main(String[] args) {
		System.out.println("Enter your Name:");
		Scanner obj = new Scanner(System.in);
		String name=obj.nextLine();		
		System.out.println("Enter your rollno:");
		Scanner obj1 = new Scanner(System.in);
		int rollno=obj1.nextInt(); 		
		System.out.println("Enter your age:");
		Scanner obj2 = new Scanner(System.in);
		int age=obj2.nextInt(); 
	}

}
