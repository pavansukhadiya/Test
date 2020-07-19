package com.warehouse.model;

import org.springframework.data.mongodb.core.mapping.Field;

public class Location {

	@Field(name = "lat")
	private String _lat;
	
	@Field(name = "long")
	private String _long;
	
	public Location(String _lat,String _long) {
		this._lat = _lat;
		this._long = _long;
	}

	public String get_lat() {
		return _lat;
	}

	public void set_lat(String _lat) {
		this._lat = _lat;
	}

	public String get_long() {
		return _long;
	}

	public void set_long(String _long) {
		this._long = _long;
	}
}
