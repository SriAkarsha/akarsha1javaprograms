package programs;
class human{
	public void display() {
		System.out.println("I am a human");
	}
 }
class boy extends human{
	public void display()
	{
	System.out.println("I am a boy");	
}
}

public class overriding {

	public static void main(String[] args) {
		boy b = new boy();
		b.display();

	}

}
