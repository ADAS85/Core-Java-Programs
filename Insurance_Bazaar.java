/* Insurance Bazaar develops insurance policy schemes which are stored in HashMap with the PolicyID as key and PolicyName as value */

import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.stream.*;

public class Insurance_Bazaar 
{
	static Map<Integer,String> policy = new HashMap<Integer,String>();
	
	public static void addPolicyDetails(int policyID,String policyName)    // Adds the policyID and policyName to the HashMap
	{
		policy.put(policyID,policyName);
	}
	
	public static List<Integer> policySearchBasedOnType(String policyType)    // Searches the policyType based on Two Wheeler or Health Insurance
	{
		return policy.keySet().stream().filter(val->(policy.get(val)).contains(policyType)).collect(Collectors.toList());
	}
	
	
	public static void main(String args[])
	{
		int policyID;
		String policyName;
		int n;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Total Number of Policies:");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter Policy ID:");
			policyID=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Policy Name:");
			policyName=sc.nextLine();
			addPolicyDetails(policyID,policyName);
		}

		int choice;
		
		do
		{
			System.out.println("Enter The Policy Name To Be Searched:\n1.Two Wheeler\n2.Health Insurance\n3.Display Records\n4.Exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				String policyType="Two Wheeler";
				List<Integer> val = policySearchBasedOnType(policyType);
				for(Integer value : val)
				{
					System.out.println(value+"\n");
				}
				break;
				
			case 2:
				policyType="Health Insurance";
				val = policySearchBasedOnType(policyType);
				for(Integer value : val)
				{
					System.out.println(value+"\n");
				}
				break;
				
			case 3:
				for(Integer key : policy.keySet())
				{
					System.out.println(key+"  -  "+policy.get(key)+"\n");
				}
				break;
				
			case 4:
				System.out.println("Thank You!");
				System.exit(0);
				break;
				
			default:
				System.out.println("--Invalid Choice--");
			}
		}while(true);
	}
}
		