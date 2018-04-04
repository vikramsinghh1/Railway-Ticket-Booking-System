
public class PaymentEngine {

	public boolean deductBalance(Train t, User user) {
		// TODO Auto-generated method stub
		
		
		if(t.getTrainFare() < user.debitBalance)
		{
			user.debitBalance-= t.getTrainFare();
			System.out.println("Balance of "+t.getTrainFare()+" has been deducted for the booking");
			return true;
		}
		else
			return false;
		
	}


	public void processRefund(User user, Ticket t) {
		System.out.println("Amount of "+t.getFare()+" has been credited to the user's account");
		user.debitBalance+=t.getFare();

	}

}
