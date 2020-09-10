
public class InstanceAndStaticVariable {

	int k=100;
	static int y=200;
	
	public static void main(String[] args) {
		
		InstanceAndStaticVariable t=new InstanceAndStaticVariable();
		System.out.println(t.k + "....."+t.y);
		InstanceAndStaticVariable t1 = new InstanceAndStaticVariable();
		t.k = 500;
		t.y = 600;
		System.out.println(t1.k +"....."+ t1.y);
	}

}
