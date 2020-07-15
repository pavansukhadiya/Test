package com.warehouse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.warehouse.model.Car;
import com.warehouse.model.Location;
import com.warehouse.model.Vehicle;
import com.warehouse.model.Warehouse;
import com.warehouse.repository.WarehouseRepository;

@SpringBootApplication
public class WarehouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarehouseApplication.class, args);
	}
	
}
