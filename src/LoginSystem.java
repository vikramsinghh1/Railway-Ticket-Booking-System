import java.io.BufferedReader;
import java.io.InputStreamReader;

class LoginSystem
{
	void login(UserSystem us) throws Exception
	{
		System.out.println("************RETURNING USER*****************");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.print("Enter Username: ");
			String username = br.readLine();
			System.out.print("Enter password: ");
			String password = br.readLine();
			if(us.users.containsKey(username))
				if(us.users.get(username).password.equals(password))
				{
					BookingSystem bs = new BookingSystem();
					while(true)
					{
						User loggedInUser = us.getUsers().get(username);
						int val = loggedInUser.bookingSystem.booking(loggedInUser); // improve this quick fix
						if(val == 1)
							return;
					}
				}
			System.out.println("Credentials don't match! Try again!");
		}
	}
}

