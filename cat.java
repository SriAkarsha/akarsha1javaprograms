package programs;

public class cat {
	String name;
	int age;
	cat(){
		name="unknown";
		age=0;
	}
	public static void main(String[] args) {
	cat c = new cat();
	System.out.println(c.name);
	System.out.println(c.age);
	}

}
