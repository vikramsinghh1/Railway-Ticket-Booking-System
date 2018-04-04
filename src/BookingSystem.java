import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

class BookingSystem
{
	EnquiryEngine Eengine;
	BookingEngine Bengine;
	PaymentEngine Pengine;
	CancellationEngine Cengine;
	static Scanner in = new Scanner(System.in);
	public int booking(User user) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("*******************************************");
		System.out.println("1) Enquire");
		System.out.println("2) Book Ticket");
		System.out.println("3) Cancel Ticket");
		System.out.println("4) Return to previous menu"); 
		System.out.print("Enter your choice: ");
		int choice = Integer.parseInt(br.readLine());
		if(choice == 1)
		{
			HashMap<Integer,Train> tt = enquiry();
			if(tt.isEmpty())
				 System.out.println("No trains exists for the given information");
			
			return 0;  // why?
		}
		else if(choice == 2)
		{
			HashMap<Integer,Train> tt = enquiry();
			if(!tt.isEmpty())
			{
				//while(true)
				{
					System.out.println("Select train number to book");
					int n = in.nextInt();
					if(tt.containsKey(n))
					{
						Train t = tt.get(n);
						if(t.getNumberOfSeats() > 0)
						{
							System.out.println("Train has "+ t.getNumberOfSeats()+" seats");
							System.out.println("booking");
							if(Bengine == null)
								Bengine = new BookingEngine();
							if(Pengine == null)
								Pengine = new PaymentEngine();
							
							if(Pengine.deductBalance(t,user))
							{
								Bengine.bookTicket(n,user);
							}
							else
								System.out.println("Booking failed. User has insufficient balance.");
						}
						else
						{
							System.out.println("Train doesn't have any vacant seat");
						}
					}
					else
						System.out.println("Please enter the correct Train Number");
				}
			}
			
			return 0;	
		}
		else if(choice == 3)
		{
			if(Cengine == null)
				Cengine = new CancellationEngine();
			
			Cengine.cancelTicket(user);
		}
		return 1;
	}

	private HashMap<Integer,Train> enquiry() throws Exception  {
		if(Eengine == null)
			Eengine = new EnquiryEngine();
		
		 HashMap<Integer,Train> t = Eengine.enquire();
		 
		 return t;
		 
		
	}
	
	
}

