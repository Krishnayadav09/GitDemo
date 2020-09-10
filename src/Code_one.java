import java.util.Scanner;
public class Code_one {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int n1 = user_input.nextInt();
		
		System.out.println("Enter 2nd number: ");
		int n2 = user_input.nextInt();
		
		System.out.println("Enter 3rd number: ");
		int n3 = user_input.nextInt();
		
		System.out.println("Enter 4th number: ");
		int n4 = user_input.nextInt();
		
		if (n1 == n2 && n2 == n3 && n3 == n4) {
			System.out.println("Numbers are equal.");
		}
		else {
			System.out.println("Numbers are not equal!");
		}

	}

}
