package programs;

public class multipleobjects {
	int x=50;
	int y=15;
	int sum=x+y;
	

	public static void main(String[] args) {
		multipleobjects a = new multipleobjects();
		multipleobjects b = new multipleobjects();
		multipleobjects c = new multipleobjects();
		System.out.println(a.x);
		System.out.println(b.y);
		System.out.println(c.sum);
	}

}
