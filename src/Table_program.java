import java.util.Scanner;
public class Table_program {
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a number ");
			int a = input.nextInt();
			
			for(int i=0;i<10;i++) {
				System.out.println(a+" x "+(i+1)+" = "+(a*(i+1)));
			}
			
				}}
