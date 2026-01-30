package com.csvdatahandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLargeCSVInChunks {

	private static final int CHUNK_SIZE = 100;

	public static void main(String[] args) {

		String filePath = "src/main/resources/employees.csv";

		int totalRecordsProcessed = 0;
		List<String> batch = new ArrayList<>(CHUNK_SIZE);

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

			String line;

			// Skip header
			reader.readLine();

			while ((line = reader.readLine()) != null) {

				if (line.trim().isEmpty()) {
					continue;
				}

				batch.add(line);

				if (batch.size() == CHUNK_SIZE) {
					totalRecordsProcessed += processBatch(batch);
					batch.clear(); 
				}
			}

			if (!batch.isEmpty()) {
				totalRecordsProcessed += processBatch(batch);
				batch.clear();
			}

			System.out.println("Total Records Processed: " + totalRecordsProcessed);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int processBatch(List<String> batch) {

		int batchSize = batch.size();

		System.out.println("Processed batch of " + batchSize + " records");

		return batchSize;
	}
}