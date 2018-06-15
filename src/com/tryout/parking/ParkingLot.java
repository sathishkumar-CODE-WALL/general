package com.tryout.parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

	
	
List<Slot> occupiedLots = new ArrayList<Slot>();
List<Slot> unoccupiedLots = new ArrayList<Slot>();

public void loadSlots(int no){
	for(int index=0;index<no;index++){
		unoccupiedLots.add(new Slot(index,false,2.0f));
	}
}

public Slot getSlot(){
	Slot slot= null;
	
	if(unoccupiedLots.isEmpty())
		return null;
	else{
		slot=unoccupiedLots.get(0);
		unoccupiedLots.remove(0);
	}
	return slot;
}

public void putSlot(Slot slot){
	unoccupiedLots.add(slot);
}
	
public boolean SlotAvailable(){
	return !unoccupiedLots.isEmpty();
}

}
