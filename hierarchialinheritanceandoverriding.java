package programs;
class animal{
	void eat() {
		System.out.println("Animals hunt their prey inorder to eat ");
	}
	void sound() {
		System.out.println("Different animals make different sounds");
	}
}

class lion extends animal{
	void eat() {
		System.out.println("Lion is a meat eating animal ");
	}
	void sound() {
		System.out.println("Lion roars");
	}
		
	}
class tiger extends animal{
	void eat() {
		System.out.println("Tiger is a Carnivore ");
	}
	void sound() {
		System.out.println("Tiger screams");
	}
	
}
class panther extends animal{
	void eat() {
	System.out.println("Panther is a flesh eating animal");
}
void sound() {
	System.out.println("Panther growls");
}
	
}
public class hierarchialinheritanceandoverriding {
	public static void main(String[] args) {
		lion l=new lion();
		l.eat();
		l.sound();
		tiger t=new tiger();
		t.eat();
		t.sound();
		panther p=new panther();
		p.eat();
		p.sound();
		
	}

}
