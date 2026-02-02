package com.functionalinterface.dataserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class BackupProcessor {

	public static void backup(Object obj, String filePath) {
		if (!(obj instanceof BackupSerializable)) {
			System.out.println("Backup denied: Class not marked for backup -> " + obj.getClass().getSimpleName());
			return;
		}

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
			oos.writeObject(obj);
			System.out.println("Backup successful for: " + obj.getClass().getSimpleName());
		} catch (IOException e) {
			System.out.println("Backup failed: " + e.getMessage());
		}
	}
}
