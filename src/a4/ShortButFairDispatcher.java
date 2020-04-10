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

	private List<Driver> chosen = new ArrayList<>();
	
	public ShortButFairDispatcher() {}

	public Driver chooseDriver(Driver[] availableDrivers, RideRequest request) {
		Arrays.sort(availableDrivers, Comparator.comparing((d) -> d.distanceTo(request)));
		for (Driver driver : availableDrivers) {
			if (!chosen.contains(driver)) {
				chosen.add(driver);
				if (chosen.size() > 5)
					chosen.remove(0);
				
				return driver;
			}
		}
		return null;		
	}

}
