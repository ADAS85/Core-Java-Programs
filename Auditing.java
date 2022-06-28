/*  Store employee details in HashMap and get salary based on which auditing is done on the employees */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Auditing 
{
	interface EmployeeAudit
	{
		public ArrayList<String> fetchEmployeeDetails(double salary);
	}
	
	
	private static Map<String,Double> empDetails = new HashMap<>();
	
	public Map<String,Double> getEmpDetails() 
	{
		return empDetails;
	}

	public void setEmpDetails(Map<String,Double> empDetails) 
	{
		Auditing.empDetails = empDetails;
	}

	public void addEmployeeDetails(String employeeName,double salary)
	{
		empDetails.put(employeeName,salary);
	}
	
	public static EmployeeAudit findEmployee()
	{
		EmployeeAudit empAud = salary->{
			ArrayList<String> empName = new ArrayList<>();
			for(String obj : empDetails.keySet()) 
			{
				if(empDetails.get(obj)<=salary)
				{
					empName.add(obj);
				}
			}
			return empName;
		};
		return empAud;
	}
	
	
	public static void main(String args[])
	{
		int choice;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1. Add Employee Details\n2. Find Employee Details\n3. Exit");
			choice=sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Employee Name:");
				String name = sc.nextLine();
				System.out.println("Enter Employee Salary:");
				double salary = sc.nextDouble();
				Auditing audit=new Auditing();
				audit.addEmployeeDetails(name,salary);
				break;
				
			case 2:
				System.out.println("Enter The Salary To Be Searched:");
				salary=sc.nextDouble();
				EmployeeAudit empAudit = Auditing.findEmployee();
				ArrayList<String> empName = empAudit.fetchEmployeeDetails(salary);
				System.out.print("\nEmployee List:  ");
				for(String obj : empName)
				{
					System.out.println(obj);
					System.out.print("\t\t");
				}
				System.out.print("\n");
				break;
				
			case 3:
				System.out.println("Happy Auditing");
				System.exit(0);
				break;
				
			default:
				System.out.println("--Invalid Choice--");	
			}
		}while(true);
	}
}