package services;



//To estimate the cost of mini car ride cost
public class MiniFareEstimator extends VehicleFareEstimator {

	//@Override
	public void fareEstimator(int distance) {
		// TODO Auto-generated method stub
		int cost = 0;
		if(distance < 3 && distance >0) {
			cost = 50;
		}
		else if(distance > 3 && distance < 18) {
			cost = 50 + (distance - 3) * 10;
		}
		else if(distance > 18 && distance < 75) {
			cost = 50 + 15 * 10 + (distance - 18) * 8;
		}
		else {
			cost = distance * 8;
		}
		System.out.println("Mini - Rs. " + cost);
	}

}
