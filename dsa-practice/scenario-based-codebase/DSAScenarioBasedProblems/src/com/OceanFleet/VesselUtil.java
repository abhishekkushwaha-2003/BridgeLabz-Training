package com.OceanFleet;

import java.util.ArrayList;

import java.util.List;

public class VesselUtil extends Vessel{
	
	private List<Vessel> vesselList = new ArrayList<>();
	
	VesselUtil(String vesselId, String vesselName, double averageSpeed, String vesselType){
		super(vesselId, vesselName, averageSpeed, vesselType);
	}
	VesselUtil(){
		super(null, null, 0.0, null);
	}

	
	public void addVesselPerformance(Vessel vessel) {
		if(!vesselList.contains(vessel)) {
			vesselList.add(vessel);
		}
	}
	public Vessel getVesselById(String vesselId) {
		

			for(Vessel v: vesselList) {
				if(v.getVesselId().equals(vesselId)) {
					return v;
					
				}
			}
		return null;
	}

	public List<Vessel> getHighPerformanceVessels(){
		List<Vessel> result = new ArrayList<>();
		
		double speed = Double.MIN_VALUE;
		for(Vessel v: vesselList) {
			if(v.getAverageSpeed() >= speed) {
				speed = v.getAverageSpeed();
			}
		}
		
		for(Vessel v: vesselList) {
			if(v.getAverageSpeed() == speed) {
				result.add(v);			}
		}
		
		return result;
		
	}
}