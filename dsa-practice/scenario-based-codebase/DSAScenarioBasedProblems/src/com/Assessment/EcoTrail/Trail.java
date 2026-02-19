package com.Assessment.EcoTrail;

public class Trail {
	String trailId;
	String name;
	String region;
	String difficulty;
	int hikeCount;
	
	Trail(String trailId, String name, String region, String difficulty, int hikeCount) {
		this.trailId = trailId;
		this.name = name;
		this.region = region;
		this.difficulty = difficulty;
		this.hikeCount = hikeCount;
		
	}
	
	
	public String getTrailId() {
		return trailId;
	}
	
	public String getNameString() {
		return name;
	}
	
	public String getRegion() {
		return region;
	}
	
	public String getDifficulty() {
		return difficulty;
	}
	
	public int getHikeCount() {
		return hikeCount;
	}
	
	public void setTrailId(String trailId) {
		this.trailId = trailId;
	}
	
	public void setNameString(String name) {
		this.name = name;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	
	public void setHikeCount(int hikeCount) {
		this.hikeCount = hikeCount;
	}

	@Override
	public String toString() {
	    return trailId + " | " + name + " | " + region + " | "
	            + difficulty + " | " + hikeCount + " hikes";
	}

}
