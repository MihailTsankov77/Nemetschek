package SpeedItUp;

import java.util.Comparator;

public class ParkingSpaceNumberComparator implements Comparator<ParkingSpace> {
	public int compare(ParkingSpace o1, ParkingSpace o2) {
		return o1.getParkingSpaceNumber() - o2.getParkingSpaceNumber();
	}
}