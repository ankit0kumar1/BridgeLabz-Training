package com.smartshelf;

public class SmartShelf {
	static void insertionSort(Book [] book) {
		int n  = book.length;
		
		for(int i = 1; i < n; i++) {
			Book temp = book[i];
			int j = i-1;
			
			while(j>=0 && book[j].title.compareToIgnoreCase(temp.title)>0) {
				book[j+1] = book[j];
				j=j-1;
				
			}
			book[j+1] = temp;
		}


	}
}
