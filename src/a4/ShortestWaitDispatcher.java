package a4;

/*
 * ShortestWaitDispatcher
 * An implementation of Dispatcher that chooses the first driver that is closest to the client's
 * position (i.e., will incur the shortest wait time)
 */

public class ShortestWaitDispatcher implements Dispatcher {

	public ShortestWaitDispatcher() {
		
	}
	
	@Override
	public Driver chooseDriver(Driver[] availableDrivers, RideRequest request) {
		Driver closestDriver = availableDrivers[0];
		for (Driver driver : availableDrivers) {
			closestDriver = (driver.distanceTo(request) < closestDriver.distanceTo(request)) ? driver : closestDriver;
		}
		return closestDriver;
	}

}
