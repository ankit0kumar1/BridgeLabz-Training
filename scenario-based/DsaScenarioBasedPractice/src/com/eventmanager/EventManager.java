package com.eventmanager;

public class EventManager {
	public static void quickSort(Ticket [] tickets , int low , int high) {
		if(low < high) {
			int pivot = partitions(tickets,low , high);
			quickSort(tickets, low, pivot - 1);
            quickSort(tickets, pivot + 1, high);
		}
	}

	private static int partitions(Ticket[] tickets, int low, int high) {
		
		// Pivot chosen as last element
        double pivotPrice = tickets[high].price;

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (tickets[j].price <= pivotPrice) {
                i++;

                // Swap tickets[i] and tickets[j]
                Ticket temp = tickets[i];
                tickets[i] = tickets[j];
                tickets[j] = temp;
            }
        }

        // Place pivot in correct position
        Ticket temp = tickets[i + 1];
        tickets[i + 1] = tickets[high];
        tickets[high] = temp;

        return i + 1;
    
	}
}
