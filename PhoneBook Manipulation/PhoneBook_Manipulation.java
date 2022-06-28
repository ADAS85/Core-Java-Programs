/* PhoneBook Project which stores, retrieves and deletes a phone number from the phoneBook ArrayList */

import java.util.*;

public class PhoneBook_Manipulation 
{
	public static void main(String args[])
	{
		String firstName,lastName,emailID;
		long phoneNo;
		int choice;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		PhoneBook_Manipulation_Functions Object2 = new PhoneBook_Manipulation_Functions();
		System.out.println("Menu:");
		
		do
		{
			System.out.println("1.Add Contact Details\n2.Display All Contacts\n3.Search Contact By Phone\n4.Remove Contact\n5.Exit\n");
			System.out.println("Enter Your Choice:");
			choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter The First Name:");
				firstName=sc.nextLine();
				System.out.println("Enter The Last Name:");
				lastName=sc.nextLine();
				System.out.println("Enter The Phone Number:");
				phoneNo=Long.parseLong(sc.nextLine());
				System.out.println("Enter The Email-ID:");
				emailID=sc.nextLine();
				
				PhoneBook_Manipulation_GettersSetters Object = new PhoneBook_Manipulation_GettersSetters(firstName,lastName,phoneNo,emailID);
				Object2.addContact(Object);
				break;
				
			case 2:
				for(PhoneBook_Manipulation_GettersSetters Obj : Object2.viewAllContacts())
				{
					if(Obj==null)
						System.out.println("No Records");
					else
					{
						System.out.println("Name: "+Obj.getFirstName()+" "+Obj.getLastName());
						System.out.println("Phone: "+Obj.getPhoneNo());
						System.out.println("Email-ID : "+Obj.getEmailID()+"\n");
					}
				}
				break;
				
			case 3:
				System.out.println("Enter The Phone No. To Search:");
				phoneNo=sc.nextLong();
				PhoneBook_Manipulation_GettersSetters Obj = Object2.viewPhoneNo(phoneNo);
				System.out.println("Name: "+Obj.getFirstName()+" "+Obj.getLastName()+"\n");
				break;
			
			case 4:
				System.out.println("Enter The Phone No. To Search:");
				phoneNo=sc.nextLong();
				boolean removed = Object2.removeContact(phoneNo);
				if(removed)
					System.out.println("Contact Successfully Removed\n");
				else
					System.out.println("Contact Deletion Failed\n");
				break;
			
			case 5:
				System.out.println("Thank You For Using The Application!");
				System.exit(0);
				
			default:
				System.out.println("--Invalid Choice--\n");
			}
		}while(true);
	}
}