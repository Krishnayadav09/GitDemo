import java.util.Scanner;

public class Divident_example {

	public static float diviser_method(int divident,int diviser){
		if (divident == 0) {
			return 0;
		}
		
		float result = 0;
		while(divident > diviser) {
			divident -= diviser;
			result++;
		}
		
		float decimalpart = (float) divident /  (float) diviser;
		result += decimalpart;
		return result;	
	}
	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter divident number :");
	int divident = in.nextInt();
	System.out.println("Enter diviser number : ");
	int diviser = in.nextInt();	
	System.out.println(diviser_method(divident,diviser));
	}
}
