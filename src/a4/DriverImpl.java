package a4;

public class DriverImpl implements Driver {

	private String first, last;
	private int id;
	Vehicle vehicle;
	
	public DriverImpl(String first, String last, int id, Vehicle vehicle) {
		if (first.equals(null) || last.equals(null) || vehicle.equals(null)) {
			throw new RuntimeException ("Attempted to pass null value in DriverImpl constructor");
		}
		
		this.first = first;	
		this.last = last;
		this.id = id;
		this.vehicle = vehicle;
	}
	
	public String getFirstName() {
		return first;
	}

	public String getLastName() {
		return last;
	}

	public int getID() {
		return id;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle v) {
		if (v.equals(null)) {
			throw new RuntimeException ("Attempted to set vehicle as null in DriverImpl");
		}
		vehicle = v;	
	}
	
	
}