package com.ac.javaCodeAnnot;

public class CarMaintenance implements Maintenance {

	@Override
	public String oilMaintenance() {
		return "Oil change due in 6000 miles";
	}

}
