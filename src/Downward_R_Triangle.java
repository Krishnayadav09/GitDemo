
public class Downward_R_Triangle {

	public static void pattern(int n) {
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
			System.out.print("* ");	
			}System.out.println();
			}	
	}
	
	public static void main(String[] args) {
		int n=5;
		pattern(n);
	}

}
