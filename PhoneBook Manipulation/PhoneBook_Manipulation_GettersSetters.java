
public class PhoneBook_Manipulation_GettersSetters 
{
	private String firstName;    // Private class members which cannot be accessed outside class
	private String lastName;
	private long phoneNo;
	private String emailID;
	
	// Private class members are accessed using appropriate Setters and Getters
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public long getPhoneNo() 
	{
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String getEmailID() 
	{
		return emailID;
	}
	
	public void setEmailID(String emailID) 
	{
		this.emailID = emailID;
	}

	public PhoneBook_Manipulation_GettersSetters(String firstName, String lastName, long phoneNo, String emailID) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.emailID = emailID;
	}
}
