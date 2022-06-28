
public class Employee_Promotion_GettersSetters 
{
	private String empName;
	private String empID;
	private double empSalary;
	
	public String getEmpName() 
	{
		return empName;
	}
	
	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}
	
	public String getEmpID() 
	{
		return empID;
	}
	
	public void setEmpID(String empID) 
	{
		this.empID = empID;
	}
	
	public double getEmpSalary() 
	{
		return empSalary;
	}
	
	public void setEmpSalary(double empSalary) 
	{
		this.empSalary = empSalary;
	}
	
	public Employee_Promotion_GettersSetters(String empName, String empID, double empSalary) 
	{
		this.empName = empName;
		this.empID = empID;
		this.empSalary = empSalary;
	}
}
