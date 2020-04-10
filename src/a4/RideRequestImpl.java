package a4;

public class RideRequestImpl implements RideRequest {

	private Position clientPosition, destination;
	private CompletedRide trip = null;
	
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
		return trip != null;
	}
	
	public CompletedRide complete(Driver driver) {				
		if (trip == null) {
			trip = new CompletedRideImpl(this, driver);
			driver.getVehicle().moveToPosition(clientPosition, destination);
		}
		return trip;
		
	}


}
