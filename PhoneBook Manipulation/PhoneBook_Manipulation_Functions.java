import java.util.List;
import java.util.ArrayList;

public class PhoneBook_Manipulation_Functions 
{
	private List<PhoneBook_Manipulation_GettersSetters> phoneBook = new ArrayList<>();

	public List<PhoneBook_Manipulation_GettersSetters> getPhoneBook() 
	{
		return phoneBook;
	}

	public void setPhoneBook(List<PhoneBook_Manipulation_GettersSetters> phoneBook) 
	{
		this.phoneBook = phoneBook;
	} 
	
	public void addContact(PhoneBook_Manipulation_GettersSetters Object)    // Adds contact objects to ArrayList
	{
		phoneBook.add(Object);
	}
	
	public List<PhoneBook_Manipulation_GettersSetters> viewAllContacts()    // Returns the ArrayList containing contact objects
	{
		return phoneBook;
	}
	
	public PhoneBook_Manipulation_GettersSetters viewPhoneNo(long phoneNo)    // Displays the given phone number
	{
		for(PhoneBook_Manipulation_GettersSetters Object : phoneBook)
		{
			if(Object.getPhoneNo()==phoneNo)
				return Object;
		}
		return null;
	}
	
	public boolean removeContact(long phoneNo)    // Removes the given phone number from the ArrayList
	{
		int flag=0;
		for(PhoneBook_Manipulation_GettersSetters Object : phoneBook)
		{
			if(Object.getPhoneNo()==phoneNo)
			{
				phoneBook.remove(Object);
				flag=1;
				break;
			}
		}
		if(flag==1)
			return true;
		else
			return false;
	}
}