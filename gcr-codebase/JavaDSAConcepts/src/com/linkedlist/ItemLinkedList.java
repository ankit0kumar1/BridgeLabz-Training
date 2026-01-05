package com.linkedlist;


public class ItemLinkedList {
	private ItemNode head;

	// 1. Add at Beginning
	public void addAtBeginning(int itemId ,String itemName, int quantity,double price) {
		ItemNode newNode = new ItemNode(itemId, itemName, quantity,price);
		newNode.next = head;
		head = newNode;
	}

	//2. Add at End
	public void addAtEnd(int itemId ,String itemName, int quantity,double price) {
		ItemNode newNode = new ItemNode(itemId, itemName, quantity,price);
		if(head ==null) {
			head = newNode;
			return;
		}
		
		ItemNode temp = head;
		while(temp.next !=null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	// 3. Add at Specific Position (1-based index)
	public void addAtPosition(int position, int itemId ,String itemName, int quantity,double price) {
		if(position <=0) {
			System.out.println("Invalid position");
			return;
		}
		if(position ==1) {
			addAtEnd(itemId, itemName, quantity, price);
			return;
		}
		
		ItemNode newNode = new ItemNode(itemId, itemName, quantity, price);
		ItemNode temp = head;
		
		for(int i =1; i < position -1 && temp!= null; i++) {
			temp = temp.next;
		}
		 if (temp == null) {
	            System.out.println("Position out of range");
	            return;
	    }
		newNode.next = temp.next;
		temp.next = newNode;
		
		
	}
	
	//4. Remove an item by item ID.
	public void removeItem(int itemId) {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		if(head.itemId == itemId) {
			head= head.next;
			System.out.println("Item Removed");
			return;
		}
		ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item removed");
        }
	}
	
	// 5. Update Item
	 public void updateQuantity(int itemId, int newQuantity) {
	        ItemNode temp = head;

	        while (temp != null) {
	            if (temp.itemId == itemId) {
	                temp.quantity = newQuantity;
	                System.out.println("Quantity updated");
	                return;
	            }
	            temp = temp.next;
	        }

	        System.out.println("Item not found");
	    }
	 
	 //6. Search item
	  public void searchByItemId(int itemId) {
	        ItemNode temp = head;

	        while (temp != null) {
	            if (temp.itemId == itemId) {
	                displayItem(temp);
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Item not found");
	    }

	    public void searchByItemName(String name) {
	        ItemNode temp = head;
	        boolean found = false;

	        while (temp != null) {
	            if (temp.itemName.equalsIgnoreCase(name)) {
	                displayItem(temp);
	                found = true;
	            }
	            temp = temp.next;
	        }

	        if (!found) {
	            System.out.println("Item not found");
	        }
	    }
	    //Calculate Total Value
	    public void calculateTotalValue() {
	        double total = 0;
	        ItemNode temp = head;

	        while (temp != null) {
	            total += temp.price * temp.quantity;
	            temp = temp.next;
	        }

	        System.out.println("Total Inventory Value: ₹" + total);
	    }
	    
	    //Sorting (Merge Sort)
	    public void sortByName(boolean ascending) {
	        head = mergeSort(head, ascending, true);
	    }

	    public void sortByPrice(boolean ascending) {
	        head = mergeSort(head, ascending, false);
	    }

	    private ItemNode mergeSort(ItemNode node, boolean asc, boolean byName) {
	        if (node == null || node.next == null)
	            return node;

	        ItemNode middle = getMiddle(node);
	        ItemNode nextOfMiddle = middle.next;
	        middle.next = null;

	        ItemNode left = mergeSort(node, asc, byName);
	        ItemNode right = mergeSort(nextOfMiddle, asc, byName);

	        return sortedMerge(left, right, asc, byName);
	    }

	    private ItemNode sortedMerge(ItemNode a, ItemNode b, boolean asc, boolean byName) {
	        if (a == null) return b;
	        if (b == null) return a;

	        boolean condition;
	        if (byName) {
	            condition = asc
	                ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
	                : a.itemName.compareToIgnoreCase(b.itemName) > 0;
	        } else {
	            condition = asc ? a.price <= b.price : a.price > b.price;
	        }

	        ItemNode result;
	        if (condition) {
	            result = a;
	            result.next = sortedMerge(a.next, b, asc, byName);
	        } else {
	            result = b;
	            result.next = sortedMerge(a, b.next, asc, byName);
	        }
	        return result;
	    }

	    private ItemNode getMiddle(ItemNode head) {
	        if (head == null) return head;

	        ItemNode slow = head, fast = head.next;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        return slow;
	    }
	    
	    //Display
	    public void displayAll() {
	        if (head == null) {
	            System.out.println("Inventory empty");
	            return;
	        }

	        ItemNode temp = head;
	        while (temp != null) {
	            displayItem(temp);
	            temp = temp.next;
	        }
	    }

	    private void displayItem(ItemNode item) {
	        System.out.println(
	            "ID: " + item.itemId +
	            ", Name: " + item.itemName +
	            ", Qty: " + item.quantity +
	            ", Price: ₹" + item.price
	        );
	    }


}
