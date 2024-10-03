package programs;
class shape{
	void getArea() {
		int a=10;
		System.out.println("The area of square:"+(a*a));
	}
}
class rectangle extends shape{
	void getArea() {
		int x=10;
		int y=20;
		System.out.println("The area of rectangle :"+(x*y));
		
	}
}
public class overidingshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
rectangle r=new rectangle();
r.getArea();
	}

}
