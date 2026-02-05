package com.studentlibrarysystem;

public interface Subject {
	void subscribe(Observer o);

	void unsubscribe(Observer o);

	void notifyUsers(String msg);
}
