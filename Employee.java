package practicetest;
public class Employee {
	String firstName,lastName;
	Employee(String f,String l)
	{
		firstName=f;
		lastName=l;
	}
	void display()
	{
		System.out.println(firstName + " " + lastName );
	}
	//@Override
	//public String toString() {
		//return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	//}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("Ritu","Saluja");
		Employee emp2=new Employee("Swati","Sahu");
		Employee emp3=new Employee("Neha","Verma");
		emp1.display();
		emp2.display();
		emp3.display();
	}
}