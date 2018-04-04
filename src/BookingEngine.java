
class BookingEngine extends Train{

	
	void bookTicket(int n, User user)
	{
		Train t = TrainScheduler.getTrainList().get(n);
		System.out.println("******************TICKET BOOKED*****************");
		System.out.println("From "+t.getStartCity());
		System.out.println("To "+t.getEndCity());
		int seats = t.getNumberOfSeats()-1;
		Ticket ticket = new Ticket();
		ticket.setStartCity(t.getStartCity());
		ticket.setEndCity(t.getEndCity());
		ticket.setFare(t.getTrainFare());
		user.bookings.put(ticket.getBookingNumber(),ticket);
		t.setNumberOfSeats(seats);
		TrainScheduler.setTrainList(t);
		
		System.out.println("Seats left "+seats);
		
		System.out.println("*****************************************");

	}
	
}
