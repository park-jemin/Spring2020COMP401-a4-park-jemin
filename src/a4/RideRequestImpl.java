package a4;

public class RideRequestImpl implements RideRequest {

	private Position clientPosition, destination;
	private boolean isComplete = false;
	private CompletedRide trip;
	
	
	public RideRequestImpl(Position clientPosition, Position destination) {
		if (clientPosition.equals(null) || destination.equals(null)) {
			throw new RuntimeException ("Attempted to pass null position in RideRequestImpl constructor");
		}
		
		this.clientPosition = clientPosition;
		this.destination = destination;
	}
	
	public Position getClientPosition() {
		return clientPosition;
	}
	public Position getDestination() {
		return destination;
	}
	
	public boolean getIsComplete() {
		return isComplete;
	}
	
	public CompletedRide complete(Driver driver) {		
		if (isComplete) {
			return trip;
		} else {			
			isComplete = true;
			trip = new CompletedRideImpl(this, driver);
			driver.getVehicle().moveToPosition(clientPosition, destination);
			return trip;
		}
	}


}
