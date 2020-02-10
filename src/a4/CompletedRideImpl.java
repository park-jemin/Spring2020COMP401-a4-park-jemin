package a4;

public class CompletedRideImpl implements CompletedRide {
	
	private RideRequest request;
	private Driver driver;
	private int waitTime;
	
	public CompletedRideImpl(RideRequest request, Driver driver) {
		if (request.equals(null) || driver.equals(null)) {
			throw new RuntimeException("Attempted to pass null value into CompletedRideImpl constructor");
		}
		
		this.request = request;
		this.driver = driver;
		waitTime = driver.distanceTo(request);
	}
	
	public RideRequest getRequest() {
		return request;
	}
	public Driver getDriver() {
		return driver;
	}
	
	public int getWaitTime() {
		return waitTime;
	}
}
