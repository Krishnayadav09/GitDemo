
public class ArrayAverageProgram {

	public static void main(String[] args) {
		int numbers[] = new int[]{10,20,30,40,50,60,-50,-16};
		int sum = 0;
		
		for (int i=0; i<numbers.length;i++) {
			sum = sum+numbers[i];
		}
			double average = sum/numbers.length;
			System.out.println("Average of numbers is " + average);
	
		
	}

}
