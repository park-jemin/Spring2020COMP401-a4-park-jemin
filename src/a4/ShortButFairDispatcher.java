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
		
		Driver closestDriver = availableDrivers[0];
//		for (int i = 1; i < availableDrivers.length; i++) {
//			
////			if (availableDrivers[i].distanceTo(request) < closestDriver.distanceTo(request)) {
////				
////				boolean has = false;
////				for (Driver driver : chosen) {
////					if (availableDrivers[i].equals(driver)) {
////						has = true;
////						break;
////					} 					
////				}
////				closestDriver = (has) ? closestDriver : availableDrivers[i];
////			
////			}
//			
//			closestDriver = (availableDrivers[i].distanceTo(request) < closestDriver.distanceTo(request) 
//					&& !chosen.contains(availableDrivers[i])) ? 
//							availableDrivers[i] : closestDriver;
//							
//		}
		
		for (Driver driver : availableDrivers) {
			closestDriver = (driver.distanceTo(request) < closestDriver.distanceTo(request) 
					&& !chosenID.contains(driver.getID())) ? driver : closestDriver;
		}
		
		
		chosenID.add(closestDriver.getID());
		if (chosenID.size() > 4) {
			chosenID.remove(0);
		}
		
		return closestDriver;
		
		
		
	}

}
