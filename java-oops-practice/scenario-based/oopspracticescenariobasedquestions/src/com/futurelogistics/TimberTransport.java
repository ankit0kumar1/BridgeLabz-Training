package com.futurelogistics;

public class TimberTransport extends GoodsTransport{
	public TimberTransport(String transportId, String transportDate, int transportRating, float timberLength,
			float timberRadius, String timberType, float timberPrice) {
		super(transportId, transportDate, transportRating);
		this.timberLength = timberLength;
		this.timberRadius = timberRadius;
		this.timberType = timberType;
		this.timberPrice = timberPrice;
	}
	float timberLength;
	float timberRadius;
	String timberType;
	float timberPrice;
	public float getTimberLength() {
		return timberLength;
	}
	public void setTimberLength(float timberLength) {
		this.timberLength = timberLength;
	}
	public float getTimberRadius() {
		return timberRadius;
	}
	public void setTimberRadius(float timberRadius) {
		this.timberRadius = timberRadius;
	}
	public String getTimberType() {
		return timberType;
	}
	public void setTimberType(String timberType) {
		this.timberType = timberType;
	}
	public float getTimberPrice() {
		return timberPrice;
	}
	public void setTimberPrice(float timberPrice) {
		this.timberPrice = timberPrice;
	}
	@Override
	public String vehicleSelection() {
		double area = 2* 3.147* timberRadius*timberLength;
		if(area<250) {
			return "Truck";
		}else if(area<=400) {
			return "Lorry";
		}else {
			return"Monster Lorry";
		}
	}
	@Override
	public float calculateTotalCharge() {
		double volume = timberRadius * timberRadius * timberLength;
		float rate = 0.15f;
		if(timberType.equalsIgnoreCase("premium")) {
			rate = 0.25f;
		}
		float price = (float) (volume * timberPrice*rate);
		
		float tax = (float) (price *0.3);
		
		float transportCost=0;
		
		String vehicle = vehicleSelection();
		if(vehicle.equalsIgnoreCase("Truck")) {
			transportCost =1000;
		}else if(vehicle.equalsIgnoreCase("Lorry")) {
			transportCost = 1700;
		}else {
			transportCost =3000;
		}
		float discount;
		if(getTransportRating()==5) {
			discount = price *0.20f;
		}else if (getTransportRating()>=3) {
			discount = (float) (price*0.10);
		}else {
			discount =0;
		}
		return (price + transportCost +tax)-discount;
		
	}
	
}
