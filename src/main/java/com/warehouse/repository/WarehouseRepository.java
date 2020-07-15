package com.warehouse.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.warehouse.model.Warehouse;

public interface WarehouseRepository extends MongoRepository<Warehouse, String> {

	@Query("{name:'?0'}")
	public Warehouse findFirstByName(String name);
}
