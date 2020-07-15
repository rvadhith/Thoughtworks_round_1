package services;


//To estimate the cost of SUV car ride cost
public class SUVFareEstimator extends VehicleFareEstimator {

	@Override
	public
	void fareEstimator(int distance) {
		int cost = 0;
		if(distance < 5 && distance >0) {
			cost = 100;
		}
		else if(distance > 5 && distance <= 20) {
			cost = 100 + (distance - 5) * 15;
		}
		else{
			cost = 100 + 15 * 15 + (distance - 20) * 12;
		}
		System.out.println("SUV - Rs. " + cost);
	}

}
