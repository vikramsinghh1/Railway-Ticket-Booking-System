import java.io.BufferedReader;
import java.util.HashMap;

class UserSystem
{
	HashMap<String, User> users;
	
	public UserSystem()
	{
		users = new HashMap<>();
		User user = new User();
		user.username ="admin";
		user.password = "admin";
		users.put("admin",user);
	}
	
	public HashMap<String, User> getUsers()
	{
		return users;
	}
	
	public void setUsers(String username, User user)
	{
		users.put(username, user);
	}
	void disp(BufferedReader br) throws Exception
	{
		while(true)
		{	
			RailwayBooking.disps.clear();
			RailwayBooking.disps.add("New User");
			RailwayBooking.disps.add("Returning User");
			RailwayBooking.disps.add("Return to previous menu");
			RailwayBooking.disp(RailwayBooking.disps.size(), RailwayBooking.disps);
			int secondChoice = Integer.parseInt(br.readLine());
			if(secondChoice == 1)
			{
				RegisterSystem rs = new RegisterSystem();
				rs.newUser(this);
			}
			else if(secondChoice == 2)
			{
				LoginSystem ls = new LoginSystem();
				ls.login(this);
			}
			else 
				return;
		}	
	}
}
