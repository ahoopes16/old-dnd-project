package gmPortal;

public class loginDetails 
{
	String username;
	String password;
	
	public loginDetails(String user, String pass)
	{
		username = user;
		password = pass;
	}
	
	public String getUser()
	{
		return username;
	}
	
	public String getPass()
	{
		return password;
	}
}
