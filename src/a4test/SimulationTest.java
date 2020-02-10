package a4test;

import a4.CompletedRide;
import a4.Position;
import a4.RoundRobinDispatcher;
import a4.Simulation;
import a4.Vehicle;
import a4.*;

public class SimulationTest {

	public static void main(String[] args) {
		Simulation sim = new Simulation(0, 10, new RoundRobinDispatcher());
		
		double total_profit = 0.0;
		CompletedRide[] ride_log = sim.getRideLog();
		
		for (int i=0; i<ride_log.length; i++) {
			double profit = ride_log[i].getProfit();
			System.out.println("Ride " + i + ": " + String.format("%.2f", profit));
			total_profit += profit;
		}
		System.out.println("Total Profit: " + String.format("%.2f", total_profit));
//		completedRidePriceTest();
	}
	

//	static void completedRidePriceTest() {
//		Position driver_pos = new PositionImpl(0,0);
//		Vehicle v = new VehicleImpl("Ford", "Focus", "ABC-123", driver_pos);
//		Driver d = new DriverImpl("John", "Smith", 1234, v);
//		
//		RideRequest req = new RideRequestImpl(new PositionImpl(1,1), new PositionImpl(1,10));
//		CompletedRide c = new CompletedRideImpl(req, d);
//		req.complete(d);
//		System.out.println(c.getWaitTime());
//		System.out.println(c.getTotalTime());
//		System.out.println(c.getPrice());
//		System.out.println(c.getCost());
//		System.out.println(c.getProfit());
//		System.out.println(d.getVehicle().getPosition().getX() + ", " + d.getVehicle().getPosition().getY());
//	}
}
