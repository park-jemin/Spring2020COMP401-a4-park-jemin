package a4;

public class VehicleImpl implements Vehicle {
	
	private String make, model, plate;
	private Position position;
	private int mileage = 0;
	
	public VehicleImpl (String make, String model, String plate, Position position) {
		if (make.equals(null) || model.equals(null) || plate.equals(null) || position.equals(null)) {
			throw new RuntimeException ("Attempted to pass null value in VehicleImpl constructor");
		}
		
		this.make = make;
		this.model = model;
		this.plate = plate;
		this.position = position;
	}
	
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getPlate() {
		return plate;
	}

	public int getMileage() {
		return mileage;
	}

	public Position getPosition() {
		return position;
	}

	public void moveToPosition(Position p) {
		if (p.equals(null)) {
			throw new RuntimeException("Attempted to move VehicleImpl to null position");
		}
		
		mileage += position.getManhattanDistanceTo(p);
		position = p;
	}
	
	public void moveToPosition(Position p, Position q) {
		moveToPosition(p);
		moveToPosition(q);
	}
	
}