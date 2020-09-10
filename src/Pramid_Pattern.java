
public class Pramid_Pattern {

	
	public static void main(String[] args) {
		int n=4;
		pattern(n);
		}
	public static void pattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>1;j--) 
			{
				System.out.print("s");
			}
			for(int k=0;k<i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	}


