
public class Ticket  extends BookingEngine{

	
	private String startCity;
	private String endCity;
	private	int bookingNumber;
	private static int bookingNumberGenerator = 0;
	private double fare;
	
	public double getFare() {
		return fare;
	}

	protected void setFare(Double double1) {
		this.fare = double1;
	}

	public String getStartCity() {
		return startCity;
	}

	public String getEndCity() {
		return endCity;
	}

	public int getBookingNumber() {
		return bookingNumber;
	}

	Ticket()
	{
		bookingNumberGenerator++;
		bookingNumber = bookingNumberGenerator;
	}
	
	protected void setStartCity(String startCity) {
		this.startCity = startCity;
	}
	protected void setEndCity(String endCity) {
		this.endCity = endCity;
	}
	
	
	
}
