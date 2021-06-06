package SpeedItUp;

public class ParkingSpace {
	
	private int parkingSpaceNumber;
	private int space;
	private String user;
	private String description;
	
	public ParkingSpace(int parkingSpaceNumber, int space, String user, String description) {
		this.setParkingSpaceNumber(parkingSpaceNumber);
		this.setSpace(space);
		this.setUser(user);
		this.setDescription(description);
	}
	
	@Override
	public String toString() {
		return "Parking space number: " + this.parkingSpaceNumber + "\n" 
				+ "Space in square meters: " + this.space + "\n" 
				+ "User name: " + this.user + "\n"
				+ "Description: " + description + "\n\n";
	}
	
	public int getParkingSpaceNumber() {
		return parkingSpaceNumber;
	}

	public void setParkingSpaceNumber(int parkingSpaceNumber) {
		this.parkingSpaceNumber = parkingSpaceNumber;
	}

	public int getSpace() {
		return space;
	}

	public void setSpace(int space) {
		this.space = space;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
