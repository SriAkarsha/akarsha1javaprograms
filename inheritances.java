package programs;
 class car{
	public void display() {
		
	
	System.out.println("This is a car");
	}
 }
class benz extends car{
	public void show()
	{
	System.out.println("This is benz");	
}
}
 class audi extends car
{ public void print() {
	
	System.out.println("This is audi");	
}
}
public class inheritances {

	public static void main(String[] args) {
		
		car c = new car();
		benz b = new benz();
		audi a =new audi();
		b.display();
		b.show();

	}

}
