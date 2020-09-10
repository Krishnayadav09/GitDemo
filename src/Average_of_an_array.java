
public class Average_of_an_array {

	public static void main(String[] args) {
		int [] num = new int []{10,50,35,68,40,60};
		int sum = 0;
		for (int i=0;i<num.length;i++) {
			sum = sum+num[i];	
		}
		System.out.println("Total sum of given array is: "+ sum);
		double average;
		average = sum/num.length;
		System.out.println("The average of given array is: "+ average);
		System.out.println("The Numbers are greater than average : ");
		for(int i=0; i<num.length;i++) {
		if(num[i]>average) {
			System.out.println(num[i]);
		}
		
		}
	}

}
