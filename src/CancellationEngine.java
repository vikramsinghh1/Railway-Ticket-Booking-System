import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CancellationEngine {
	
	static Scanner in = new Scanner(System.in);
	PaymentEngine pEngine;
	
	void cancelTicket(User user)
	{
		
		System.out.println("******************EXISTING BOOKINGS*****************");

		System.out.println("The User has the following bookings\n");
		HashMap<Integer,Ticket> bookings = user.getBookings();
		
		for(Ticket ticket : bookings.values())
		{
			System.out.println("Booking Number: "+ ticket.getBookingNumber());
			System.out.println(" From : "+ticket.getStartCity());
			System.out.println(" To : "+ticket.getEndCity());
		}
		System.out.println("****************************************");

		System.out.println("Please Enter the booking Number you wish to cancel");
		int bookingNumber = in.nextInt();
		if(bookings.containsKey(bookingNumber))
		{
			Ticket t = bookings.get(bookingNumber);
			System.out.println("Your booking has been cancelled");
			System.out.println("Amount of "+t.getFare()+" has been credited back to your account");
			if(pEngine == null)
				pEngine = new PaymentEngine();
			
			pEngine.processRefund(user,t);
			user.removeBooking(bookingNumber);
			System.out.println("*****************************************");

		}
		else
		{
			System.out.println("Please Enter a valid booking Number");
		}
	}

}
