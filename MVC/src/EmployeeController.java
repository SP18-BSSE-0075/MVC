import java.util.Date;

public class EmployeeController
{
	private Employee empModel;
	private EmployeeView empView;
	
	public EmployeeController(Employee empModel, EmployeeView empView) 
	{
		super();
		this.empModel = empModel;
		this.empView = empView;
	}

	public String getEmployeeID() {
		return empModel.getEmployeeID();
	}
	public void setEmployeeID(String employeeID) {
		empModel.setEmployeeID(employeeID);
	}
	
	public String getFirstName() {
		return empModel.getFirstName();
	}
	public void setFirstName(String firstName) {
		empModel.setFirstName(firstName);;
	}
	public String getLastName() {
		return empModel.getLastName();
	}
	public void setLastName(String lastName) {
		empModel.setLastName(lastName);;
	}
	public String getGender() {
		return empModel.getGender();
	}
	public void setGender(String gender) {
		empModel.setGender(gender);;
	}
	public Date getHiredDate() {
		return empModel.getHiredDate();
	}
	public void setHiredDate(Date hiredDate) {
		empModel.setHiredDate(hiredDate);;
	}
	public double getSalary() {
		return empModel.getSalary();
	}
	public void setSalary(double salary) {
		empModel.setSalary(salary);;
	}
	public void renovateView()
	{
		empView.EmployeeDetails(empModel);
	}
	

}
