package com.warehouse.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.warehouse.model.Warehouse;
import com.warehouse.model.WarehouseCar;
import com.warehouse.service.WarehouseService;

@RestController
@RequestMapping("warehouse")
public class WarehouseController {

	@Autowired
	WarehouseService warehouseService;
	
	@CrossOrigin
	@GetMapping(value = "/carsStr",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Warehouse> getWarehouseList() {
		List<Warehouse> wl =warehouseService.getFullWarehouseList(); 
		return wl;
	}
	
	@CrossOrigin
	@GetMapping(value = "/cars",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<WarehouseCar> getWarehouseStrList() {
		List<WarehouseCar> wcl =warehouseService.getFullCarList();
		return wcl;
	}
	
	@GetMapping(value = "/cars_list",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String> getWList() {
		List<String> wl =new ArrayList<String>();
		wl.add("One");
		wl.add("Two");
		wl.add("Three");
		return wl;
	}
}
