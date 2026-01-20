package com.generics.smartwarehouse;

public class Electronics extends WarehouseItem{
	public Electronics(String name) {
		super(name);
	}
	@Override
	public String getCategory() {
		return "Eletronics";
	}
}
