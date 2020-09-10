
public class Array1 {

	public static void main(String[] args) {
		
		int [][]a = new int[10][10];
		 
		int b=1;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[0].length;j++) {
				
				a[i][j]=b++;
			}
			 b=1;
		}
		
           for(int i=0;i<a.length;i++) {
			
		   for(int j=0;j<a[0].length;j++) {
				
				System.out.print(a[i][j]+"  ");
			}
		   
		   System.out.println();
	   }

	}
}
