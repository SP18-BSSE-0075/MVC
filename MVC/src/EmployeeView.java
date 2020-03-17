
public class EmployeeView
{
	
	public void EmployeeDetails(Employee emp)
	{
		System.out.println("\n => EMPLOYEE ID : " + emp.getEmployeeID());
		System.out.println("\n => FIRST NAME : " + emp.getFirstName());
		System.out.println("\n => LAST NAME : " + emp.getLastName());
		System.out.println("\n => GENDER : " + emp.getGender());
		System.out.println("\n => HIRED DATE : " + emp.getHiredDate());
		System.out.println("\n => SALARY : " + emp.getSalary());
	}

}
