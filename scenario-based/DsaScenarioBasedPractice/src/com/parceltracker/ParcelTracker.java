package com.parceltracker;

public class ParcelTracker {
	private Stage head;

	public void addStage(String stage, Product product) {
		Stage newNode = new Stage(stage, product);
		if (head == null) {
			head = newNode;
			return;
		}
		Stage temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public void trackForward() {

		if (head == null) {
			System.out.println("No tracking information available.");
			return;
		}

		Stage current = head;
		boolean delivered = false;

		System.out.println("Tracking Parcel:");
        while (current != null) {
            System.out.println("Stage: " + current.stageName);

            if (current.stageName.equals("Delivered")) {
                delivered = true;
                break;
            }

            current = current.next;
        }

        if (!delivered) {
            System.out.println("Parcel status unknown. Parcel may be lost.");
        }
	}
}
