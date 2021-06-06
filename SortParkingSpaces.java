package SpeedItUp;

import java.util.Scanner;

public class SortParkingSpaces {

	public static void main(String[] args) {
		
		ParkingSpace[] parkingSpaces = new ParkingSpace[3];
		
		enterData(parkingSpaces);
		
		sortBySpaceNumber(parkingSpaces);
		
		displayData(parkingSpaces);

	}
	
	
	public static void enterData(ParkingSpace[] parkingSpaces) {
		Scanner sc = new Scanner (System.in);
		int parkingSpaceNumber;
		int space;
		String user;
		String description;
		
		
		for(int i = 0; i < parkingSpaces.length; i++) {
			System.out.println("Enter parking space number:");
			parkingSpaceNumber = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter space in square meters:");
			space = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter user name:");
			user = sc.nextLine();
			
			System.out.println("Enter description:");
			description = sc.nextLine();
			
			parkingSpaces[i] = new ParkingSpace(parkingSpaceNumber, space, user, description);
		}
	}
	
	public static void displayData(ParkingSpace[] parkingSpaces) {
		
		for(int i = 0; i < parkingSpaces.length; i++) {
			System.out.println(parkingSpaces[i].toString());
		}
	}
	
	public static void sortBySpaceNumber(ParkingSpace[] parkingSpaces) {
		MergeSort.mergeSort(parkingSpaces, new ParkingSpaceNumberComparator());
	}
		
	public static void sortByArea(ParkingSpace[] parkingSpaces) {
		MergeSort.mergeSort(parkingSpaces, new ParkingAreaComparator());
	}
	
	public static void sortByUser(ParkingSpace[] parkingSpaces) {
		MergeSort.mergeSort(parkingSpaces, new ParkingUserComparator());
	}
		
	
	
	public static void parkingSpace74GoTop(ParkingSpace[] parkingSpaces) {
		int index = -1;
		for(int i = 0; i < parkingSpaces.length; i++) {
			if(parkingSpaces[i].getParkingSpaceNumber()==74) {
				
				for(int j = 0; j<i; i++) {
					ParkingSpace swap = parkingSpaces[j];
					parkingSpaces[j] = parkingSpaces[i];
					parkingSpaces[i] = swap;
				}
				
//				break;
			}
		}
		
	}
	
	
	

}
