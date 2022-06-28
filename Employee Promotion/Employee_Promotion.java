/* Employee count based on their salary where employees will get promotion based on the salary limit */

import java.util.*;

public class Employee_Promotion 
{
	public static void main(String args[])
	{
		
		int noOfEmp,noOfSearch;
		Scanner sc=new Scanner(System.in);
		Employee_Promotion_Management empManage = new Employee_Promotion_Management();
		System.out.println("Enter The Number of Employees");
		noOfEmp=sc.nextInt();
		System.out.println("Enter Employee Details Separated By Colon: Name:ID:Salary");

		for(int i=0;i<noOfEmp;i++)
		{
			String emp[]=sc.next().split(":");
			Employee_Promotion_GettersSetters Object = new Employee_Promotion_GettersSetters(emp[0],emp[1],Double.parseDouble(emp[2]));
			empManage.adToEmpList(Object);
		}
	
		System.out.println("Enter The Number of Search Times:");
		noOfSearch=sc.nextInt();
		double salaryLimit[]=new double[noOfSearch];
		for(int i=0;i<noOfSearch;i++)
		{
			System.out.println("Enter The Salary Limit:");
			salaryLimit[i]=sc.nextDouble();
		}
		
		for(int i=0;i<noOfSearch;i++)
		{
			empManage.setSalaryLimit(salaryLimit[i]);
			System.out.println(salaryLimit[i]+" : "+empManage.empCount());
		}
		sc.close();
	}
}
