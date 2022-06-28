/* Takes a string of students' roll numbers separated by comma where the first two letters are department name and total students are counted who got placed */

import java.util.*;
import java.util.Arrays;
import java.util.stream.*;

public class Placement_Enrollment_Count 
{
	public static Stream<String> getRollNumbers(String rollNumbers)
	{
		String roll[] = rollNumbers.split(",");
		return Arrays.stream(roll);
	}
	
	public static int getCount(Stream<String> rollNumberStream,String deptAcronym)
	{
		int studCount=0;
		studCount = (int)rollNumberStream.filter(roll->roll.toLowerCase().contains(deptAcronym.toLowerCase())).count();
		return studCount;
	}
	
	public static void main(String args[])
	{
		String rollNumbers,deptAcronym;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Data: Comma Separated Roll Numbers");
		rollNumbers=sc.nextLine();
		System.out.println("Enter Department Code");
		deptAcronym=sc.nextLine();
		
		int studNum = getCount(getRollNumbers(rollNumbers),deptAcronym);
		System.out.println("Number of Students Got Placed In "+deptAcronym+" Department: "+studNum);
		sc.close();
	}
}
