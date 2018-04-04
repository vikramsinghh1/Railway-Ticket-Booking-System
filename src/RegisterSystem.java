import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RegisterSystem
{	
	void newUser(UserSystem us) throws IOException
	{
		System.out.println("******************NEW USER*****************");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.print("Enter Username: ");
			String username = br.readLine();
			if(us.users.containsKey(username))
			{
				System.out.println("User already exists! Please try again!");
				continue;
			}
			
			System.out.print("Enter password: ");
			String password = br.readLine();
			User user = new User();
			user.username = username;
			user.password = password;
			user.creditBalance = user.generateRandom(1000, 5000);
			user.debitBalance = user.generateRandom(100, 1000);
			us.users.put(username, user);
			break;
		}
	}
	
}
