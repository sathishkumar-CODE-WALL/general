package com.tryout.parking;

public abstract class Vehicle implements Parkable{

	int vehicleId;
	String vehicleType;
	
	@Override
	public void park(Slot slot) {
		slot.setOccupied(true);
		slot.setVehicleId(vehicleId);
	}

	@Override
	public void unpark(Slot slot) {
		slot.setOccupied(false);
		slot.clearVehicleId();
	}
}
