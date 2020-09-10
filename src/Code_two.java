import java.util.Scanner;
public class Code_two {

	public static void main(String[] args) {
//	Scanner input = new Scanner(System.in);
	boolean [] [] a = {{true, false, true},{false, true, false}};
	for(int i=0; i<a.length;i++) {
		for (int j=0; j<a[0].length;j++) {
			if (a[i][j]) {
			System.out.print("t");
			}
			else {
				System.out.print("f");
			}
		}
		System.out.println();
	}
	}

}
