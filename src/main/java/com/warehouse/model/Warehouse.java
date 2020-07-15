package com.warehouse.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "warehouse")
public class Warehouse {
	
	@Id
	private String id;

	private String name;
	
	private Location location;
	
	private Car cars;
	
	public Warehouse(String id, String name, Location location, Car cars) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.cars = cars;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Car getCars() {
		return cars;
	}

	public void setCars(Car cars) {
		this.cars = cars;
	}
}
