package programs;

public class demoo { 
	
		private String name;
		private int age;
		public void Person(String name, int age)
		{
			this.name = name;
			this.age = age; 
			}
		public String getName() {
			return name;
			}
		public void setName(String name)
		{
			this.name = name;
			} public int getAge() {
				return age;
				}
			public void setAge(int age) {
				this.age = age; 
				}
			public void displayInfo() {
				System.out.println("Name: " + name);
				System.out.println("Age: " + age); 
				}
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
