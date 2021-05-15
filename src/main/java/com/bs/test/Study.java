package com.bs.test;

public class Study {
	
	private StudyStatus status;
	
	private int limit;
	
	public Study(int i) {
		this.limit = i;
	}
	
	public Object getStatus() {
		
		return this.status;
	}

	public int getLimit() {
		return limit;
	}
	
	
}
