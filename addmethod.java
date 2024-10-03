package programs;

public class addmethod {
	public void add()
	{
		int a=20;
		int b=30;
		int sum=a+b;
		System.out.println("sum is:"+sum);
	}

	public static void main(String[] args) {
		addmethod obj = new addmethod();
		obj.add();
		
	}

}
