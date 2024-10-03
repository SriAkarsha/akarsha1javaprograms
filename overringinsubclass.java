package programs;
class person{
	void getFirstname() {
		String firstname="Sri";
		System.out.println("your first name:"+firstname);
	}
	void getLastname() {
		String lastname="Akarsha";
		System.out.println("your first name:"+lastname);
	}
}
class employee extends person{
	void getEmployeeid() {
		int empid=15;
		System.out.println("your employee id is:"+empid);
		}
	void getLastname() {
		String jobti="Manager";
		System.out.println("your job title:"+jobti);
	}
	
}

public class overringinsubclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
employee e=new employee();
e.getFirstname();
e.getEmployeeid();
e.getLastname();
	}

}
