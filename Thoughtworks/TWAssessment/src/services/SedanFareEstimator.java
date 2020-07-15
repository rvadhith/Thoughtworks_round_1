package services;



//To estimate the cost of sedan car ride cost
public class SedanFareEstimator extends VehicleFareEstimator {

	@Override
	public
	void fareEstimator(int distance) {
		// TODO Auto-generated method stub
		int cost = 0;
		if(distance < 5 && distance >0) {
			cost = 80;
		}
		else if(distance > 5 && distance <= 20) {
			cost = 80 + (distance - 5) * 12;
		}
		else if(distance > 20 && distance < 100) {
			cost = 80 + 15 * 12 + (distance - 20) * 10;
		}
		else {
			cost = distance * 10;
		}
		System.out.println("Sedan - Rs. " + cost);
	}

}
