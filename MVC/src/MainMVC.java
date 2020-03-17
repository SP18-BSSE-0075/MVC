import java.util.Date;

public class MainMVC 
{
	public static void main(String [] args)
	{
		// Employee Model
		Employee empModel = fetchEmployeeFromDB();
		
		// Employee View
		EmployeeView empView = new EmployeeView();
		
		// Employee Controller
		EmployeeController empControl = new EmployeeController(empModel, empView);
		
		// Controller taking input
		empControl.setEmployeeID("emp02");
		
		// Controller updates the view of EmployeeDetails
		empControl.renovateView();
	}
	
	private static Employee fetchEmployeeFromDB()
	{
		Employee emp = new Employee();
		emp.setEmployeeID("emp01");
		emp.setFirstName("Umair");
		emp.setLastName("Ali");
		emp.setGender("M");
		emp.setHiredDate(new Date());
		emp.setSalary(5000000);
		
		return emp;
	}

}
