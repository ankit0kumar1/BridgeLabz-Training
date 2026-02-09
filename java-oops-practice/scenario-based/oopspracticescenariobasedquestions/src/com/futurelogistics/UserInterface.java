package com.futurelogistics;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Goods Transport details ");
		String input = sc.nextLine();
		Utility u = new Utility();

		GoodsTransport t = u.parseDetails(input);
		if (t == null) {
			return;
		}
	
		System.out.println("Transporter id : " + t.getTransportId());
		System.out.println("Date of transport : " + t.getTransportDate());
		System.out.println("Rating of the transport : " + t.getTransportRating());

		String type = u.findObjectType(t);

		if (type.equals("BrickTransport")) {
			BrickTransport bt = (BrickTransport) t;
			System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
			System.out.println("Brick price : " + bt.getBrickPrice());
		} else {
			TimberTransport tt = (TimberTransport) t;
			System.out.println("Type of the timber : " + tt.getTimberType());
			System.out.println("Timber price per kilo : " + tt.getTimberPrice());
		}

		System.out.println("Vehicle for transport : " + t.vehicleSelection());
		System.out.println("Total charge : " + t.calculateTotalCharge());
	}
}
