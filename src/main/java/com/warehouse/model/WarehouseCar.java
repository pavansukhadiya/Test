package com.warehouse.model;

public class WarehouseCar {

	public String id;
	public String warehouseName;
	private String make;
	private String model;
	private int year_model;
	private double price;
	private String date_added;
	private boolean licensed;
	private double lng;
	private double lang;
	
	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public double getLang() {
		return lang;
	}

	public void setLang(double lang) {
		this.lang = lang;
	}

	public WarehouseCar(Warehouse w, Vehicle v) {
		this.id = v.get_id()+"";
		this.warehouseName = w.getName();
		this.make = v.getMake();
		this.model = v.getModel();
		this.year_model = v.getYear_model();
		this.price = v.getPrice();
		this.date_added = v.getDate_added();
		this.licensed = v.isLicensed();
		this.lang = new Double(w.getLocation().get_lat());
		this.lng = new Double(w.getLocation().get_long());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear_model() {
		return year_model;
	}

	public void setYear_model(int year_model) {
		this.year_model = year_model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDate_added() {
		return date_added;
	}

	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}

	public boolean isLicensed() {
		return licensed;
	}
	
	public String getLicensed() {
		return licensed ? "Y":"N";
	}

	public void setLicensed(boolean licensed) {
		this.licensed = licensed;
	}
	
}
