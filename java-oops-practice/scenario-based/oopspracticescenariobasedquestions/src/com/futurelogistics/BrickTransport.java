package com.futurelogistics;

public class BrickTransport extends GoodsTransport {

	public BrickTransport(String transportId, String transportDate, int transportRating, float brickSize,
			int brickQuantity, float brickPrice) {
		super(transportId, transportDate, transportRating);
		this.brickSize = brickSize;
		this.brickQuantity = brickQuantity;
		this.brickPrice = brickPrice;
	}

	float brickSize;
	int brickQuantity;
	float brickPrice;

	public float getBrickSize() {
		return brickSize;
	}

	public void setBrickSize(float brickSize) {
		this.brickSize = brickSize;
	}

	public int getBrickQuantity() {
		return brickQuantity;
	}

	public void setBrickQuantity(int brickQuantity) {
		this.brickQuantity = brickQuantity;
	}

	public float getBrickPrice() {
		return brickPrice;
	}

	public void setBrickPrice(float brickPrice) {
		this.brickPrice = brickPrice;
	}

	@Override
	public String vehicleSelection() {
		if(brickQuantity<300) {
			return "Truck";
		}else if(brickQuantity>=300 && brickQuantity<=500) {
			return "Lorry";
		}else {
			return "Monster Lorry";
		}
	}

	@Override
	public float calculateTotalCharge() {
		float total = brickQuantity*brickPrice;
		float taxedtotal = (float) (total*0.3);
		int vehicleCost =0;
		String vehicle = vehicleSelection();
		if(vehicle.equalsIgnoreCase("truck")) {
			vehicleCost =1000;
		}else if(vehicle.equalsIgnoreCase("lorry")) {
			vehicleCost = 1700;
		}else {
			vehicleCost = 3000;
		}
		double discount =0;
		if(getTransportRating()==5) {
			discount =0.20*total;
		}else if(getTransportRating()>=3) {
			discount= 0.10*total;
		}else {
			discount =0;
		}
		return (float) (total+taxedtotal +vehicleCost-discount);
		
		
	}

}
