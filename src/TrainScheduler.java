import java.util.HashMap;

public class TrainScheduler {
	
	static final HashMap<Integer, Train> trainList;
	static
	{
		trainList = new HashMap<Integer,Train>();
	}

	public static HashMap<Integer, Train> getTrainList() {
		return trainList;
	}

	public static void setTrainList(Train train) {
		
		trainList.put(train.getTrainNumber(), train);
	}
}
