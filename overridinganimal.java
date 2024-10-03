package programs;
class animal{
	void move() {
		System.out.println("noving");
	}
}
class cheetah extends animal{
	void move() {
		System.out.println("running");
	}
}
public class overridinganimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     cheetah c=new cheetah();
c.move();

	}

}
