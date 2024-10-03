package programs;

public class dog {
String name;
String color;
  dog(String name1,String color1){
	  name=name1;
	  color=color1;
  }
	public static void main(String[] args) {
		dog d=new dog("puppy","red");
		System.out.println(d.name);
		System.out.println(d.color);
	}

}
