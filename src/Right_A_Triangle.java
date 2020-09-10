public class Right_A_Triangle {

	
	public static void pattern(int n) {
		for(int i=0;i<n;i++) {
			System.out.print(" ");
		
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=3;
		pattern(n);
	}

}