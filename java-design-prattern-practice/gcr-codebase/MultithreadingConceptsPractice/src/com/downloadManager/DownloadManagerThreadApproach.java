package com.downloadManager;

public class DownloadManagerThreadApproach {

	public static void main(String[] args) throws InterruptedException {

		FileDownloaderRunnable t1 = new FileDownloaderRunnable("Document.pdf");
		FileDownloaderRunnable t2 = new FileDownloaderRunnable("Image.jpg");
		FileDownloaderRunnable t3 = new FileDownloaderRunnable("Video.mp4");

		t1.start();
		t2.start();
		t3.start();

		// Main thread waits
		t1.join();
		t2.join();
		t3.join();

		System.out.println("All downloads complete!");
	}
}
