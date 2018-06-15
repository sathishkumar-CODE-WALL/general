package com.tryout.parking;

public class Slot{

	int slotId;
	boolean isOccupied;
	float pricePerHour=2.0f;
	int vehicleId=-1;
	
	public Slot(int slotId, boolean isOccupied, float pricePerHour){
		this.slotId=slotId;
		this.isOccupied=isOccupied;
		this.pricePerHour=pricePerHour;
	}
	
	public float calcParkingCharge(int hours){
		return hours*pricePerHour;
		
	}

	public int getSlotId() {
		return slotId;
	}
	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}
	public boolean isOccupied() {
		return isOccupied;
	}
	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
	public float getPricePerHour() {
		return pricePerHour;
	}
	public void setPricePerHour(float pricePerHour) {
		this.pricePerHour = pricePerHour;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public void clearVehicleId(){
		this.vehicleId=-1;
	}
	
}
