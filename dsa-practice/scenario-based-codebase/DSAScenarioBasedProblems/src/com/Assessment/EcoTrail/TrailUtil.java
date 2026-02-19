package com.Assessment.EcoTrail;

import java.util.*;
public class TrailUtil {
	
	private List <Trail> trailList = new ArrayList<>();
	
	public List<Trail> getTrailList(){
		return this.trailList;
	}
	
	public void setTrailList(List<Trail> List){
		this.trailList = trailList;
	}
	
	public void addTrailRecord(Trail trail) {
		  this.trailList.add(trail);
	}
	
	public Trail getTrailById(String trailId) {
		for(Trail t : trailList) {
			if(t.getTrailId().equals(trailId)) {
				return t;
			}
		}
		return null;
	}
	
	public Set getMostHikedTrails() {
		Set <Trail> set = new HashSet<>(); 
		int count = Integer.MIN_VALUE;
		for(Trail t : trailList) {
			if(t.getHikeCount() > count) {
				count = t.getHikeCount();
			}
		}
		
		for(Trail t : trailList) {
			if(t.getHikeCount() == count) {
				set.add(t);
			} 
		}
		return set;
	}
	
	public Map getHikeCountByRegion() {
		Map<String, Integer> map = new HashMap<>();
		for(Trail t : trailList) {
			map.put(t.getRegion(), map.getOrDefault(t.getRegion(),0)+t.getHikeCount());
		}
		return map;
	}
	
	 public Map<String, List<Trail>> groupTrailsByDifficulty() {
	        Map<String, List<Trail>> map = new LinkedHashMap<>();

	        for (Trail t : trailList) {
	            map.putIfAbsent(t.getDifficulty(), new ArrayList<>());
	            map.get(t.getDifficulty()).add(t);
	        }

	        return map;
	    }

	    public boolean updateHikeCount(String trailId, int additionalHikes) {
	        Trail t = getTrailById(trailId);
	        if (t != null) {
	            t.setHikeCount(t.getHikeCount() + additionalHikes);
	            return true;
	        }
	        return false;
	    }

	    public List<Trail> filterTrails(String region, String difficulty) {
	        List<Trail> list = new ArrayList<>();

	        for (Trail t : trailList) {
	            if (t.getRegion().equals(region) &&
	                t.getDifficulty().equals(difficulty)) {
	                list.add(t);
	            }
	        }

	        return list;
	    }

	    public Map<String, List<Trail>> getTopTrailsByRegion(int n) {
	        Map<String, List<Trail>> regionMap = new LinkedHashMap<>();

	        for (Trail t : trailList) {
	            regionMap.putIfAbsent(t.getRegion(), new ArrayList<>());
	            regionMap.get(t.getRegion()).add(t);
	        }

	        for (String region : regionMap.keySet()) {
	            List<Trail> list = regionMap.get(region);

	            list.sort((a, b) -> b.getHikeCount() - a.getHikeCount());

	            if (list.size() > n) {
	                regionMap.put(region, list.subList(0, n));
	            }
	        }

	        return regionMap;
	    }

	    public Map<String, String> getDifficultyStats() {
	        Map<String, String> stats = new LinkedHashMap<>();

	        Map<String, List<Trail>> grouped = groupTrailsByDifficulty();

	        for (String difficulty : grouped.keySet()) {
	            List<Trail> list = grouped.get(difficulty);

	            int count = list.size();
	            int total = 0;

	            for (Trail t : list) {
	                total += t.getHikeCount();
	            }

	            int average = count == 0 ? 0 : total / count;

	            String summary = "count=" + count +
	                    ", totalHikes=" + total +
	                    ", averageHikes=" + average;

	            stats.put(difficulty, summary);
	        }

	        return stats;
	    }
	
}
