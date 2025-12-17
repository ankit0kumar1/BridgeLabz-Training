public class VolumeOfEarth{
	public static void main(String [] args){
		int radius = 6378;
		
		//formula to find volume 
		double volumeInKilometers = (4.0/3.0)*Math.PI*Math.pow(radius,3);
		double volumeInMiles = volumeInKilometers*Math.pow(0.621371,3);
		
		//Displaying the volume in cubic kilometers and cubic miles
		System.out.println("The volume of earth in cubic kilometers is " + volumeInKilometers + " and cubic miles is " +volumeInMiles);
		
	}
}