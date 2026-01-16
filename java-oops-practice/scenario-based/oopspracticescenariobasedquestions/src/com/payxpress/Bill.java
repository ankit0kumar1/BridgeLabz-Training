package com.payxpress;

abstract class Bill implements IPayable{
	private String type;
	private double amount;
	private String dueDate;
	private boolean isPaid;
	
	public Bill(String type, double amount, String dueDate) {
		this.type = type;
		this.amount = amount;
		this.dueDate = dueDate;
		this.isPaid = false;
	}
	
	//Encapsulated payment logic
	public void pay() {
		if(!isPaid) {
			isPaid = true;
			System.out.println(type + " bill paid successfully.");
		}else {
			System.out.println(type + " bill is already paid.");
		}
	}
	
	//Protected mehtod for late fee calculation
	protected double calculateLateFee(double penalty) {
		return amount + penalty;
	}
	
	 
    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getDueDate() {
        return dueDate;
    }

    protected boolean isPaid() {
        return isPaid;
    }
}
