import java.util.ArrayList;
import java.util.List;

public class Employee_Promotion_Management 
{
	double salaryLimit;
	int count=0;
	List<Employee_Promotion_GettersSetters> empList = new ArrayList<>();
	
	public double getSalaryLimit() 
	{
		return salaryLimit;
	}
	
	public void setSalaryLimit(double salaryLimit) 
	{
		this.salaryLimit = salaryLimit;
	}
	
	public List<Employee_Promotion_GettersSetters> getEmpList() 
	{
		return empList;
	}
	
	public void setEmpList(List<Employee_Promotion_GettersSetters> empList) 
	{
		this.empList = empList;
	}

	public void adToEmpList(Employee_Promotion_GettersSetters Obj) 
	{
		empList.add(Obj);
	}
	
	public int empCount()
	{
		int empCnt = 0;
		for(Employee_Promotion_GettersSetters Object : empList)
		{
			if(Object.getEmpSalary()>=salaryLimit)
				empCnt++;
		}
		return empCnt;
	}
}
