package SpeedItUp;


import java.util.Comparator;

public class ParkingUserComparator implements Comparator<ParkingSpace> {
	public int compare(ParkingSpace o1, ParkingSpace o2) {
		return o1.getSpace() - o2.getSpace();
	}
}