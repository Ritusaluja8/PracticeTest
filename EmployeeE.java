package practicetestt;
import java.util.Scanner;
public class EmployeeE {
	private String firstName;
	private String lastName;
	public EmployeeE(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	void display() throws Exception {
		if(firstName==null && lastName==null)
		{
			throw new NullPointerException("entry missing");
			
		}
		/*else {
			System.out.println("name is " + firstName + " " + lastName );
			
		}*/
		if(firstName.length()<3 && lastName.length()<3)
		{
			throw new Exception("firstname and lastname should be minimum 3 charecters");
		}
		/*else {
			System.out.println(firstName + " " + lastName);
		}*/
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EmployeeE emp1=new EmployeeE(null,null);
		//Employee emp2=new Employee("Ritu","Saluja");
		//Employee emp3=new Employee("H","S");
		emp1.display();
		//emp2.display();
		//emp3.display();
	}
}