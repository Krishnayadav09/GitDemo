package package1;

class Default extends Shivam{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("default"+'c');
        Default d = new Default();
        System.out.println(d.sum());
	}

	int sum() {
		int a=5;
		int b=5;
		int sum = a-b;
		return sum;
	}
	
}
