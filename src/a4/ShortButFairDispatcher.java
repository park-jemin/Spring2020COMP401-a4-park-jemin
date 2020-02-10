package a4;

import java.util.*;

/*
 * ShortButFairDispatcher
 * An implementation of Dispatcher that chooses the driver that is closest to the client's position but without 
 * considering the last five drivers chosen (you can assume that there will be more than five available drivers). 
 * In other words, if your dispatcher first chooses DriverA, then the next four times that the dispatcher is 
 * asked to choose a driver, DriverA should not be eligible for being chosen.
 */

public class ShortButFairDispatcher implements Dispatcher {

	private List<Integer> chosenID;
	
	public ShortButFairDispatcher() {
		chosenID = new ArrayList<Integer>();
	}
	
	@Override
	public Driver chooseDriver(Driver[] availableDrivers, RideRequest request) {
		
		Driver closestDriver = availableDrivers[6];
		
		for (Driver driver : availableDrivers) {
			closestDriver = (driver.distanceTo(request) <= closestDriver.distanceTo(request) 
					&& !chosenID.contains(driver.getID())) ? driver : closestDriver;
		}
		
		
		chosenID.add(closestDriver.getID());
		if (chosenID.size() > 5) {
			chosenID.remove(0);
		}
		
		return closestDriver;		
		
	}

}
