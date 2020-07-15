package com.warehouse.service;

import java.util.ArrayList;import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warehouse.model.Car;
import com.warehouse.model.Vehicle;
import com.warehouse.model.Warehouse;
import com.warehouse.model.WarehouseCar;
import com.warehouse.repository.WarehouseRepository;

@Service
public class WarehouseService {

	@Autowired
	WarehouseRepository warehouseRepository;

	public List<Warehouse> getFullWarehouseList(){
		List<Warehouse> wl =warehouseRepository.findAll(); 
		
		return wl;
	}
	
	public List<WarehouseCar> getFullCarList(){
		List<WarehouseCar> wlc = new ArrayList<WarehouseCar>();
		List<Warehouse> wl =warehouseRepository.findAll(); 
		
		for(Warehouse w: wl) {
			for(Vehicle v : w.getCars().getVehicles()) {
				try {
				wlc.add(new WarehouseCar(w, v));
				} catch (Exception e) {
					System.out.println(v.get_id());
				}
			}
		}
	
		return wlc;
	}
	
	
}

