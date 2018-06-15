package com.tryout.parking;

public class ParkingManager {
	
	static ParkingLot parkingLot = new ParkingLot();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		parkingLot.loadSlots(10);
		
		Car car = new Car(1);
		if(parkingLot.SlotAvailable()){
			car.park(parkingLot.getSlot());
		}
		
		Truck truck = new Truck(2);
		if(parkingLot.SlotAvailable()){
			truck.park(parkingLot.getSlot());
		}
		
	}

}
