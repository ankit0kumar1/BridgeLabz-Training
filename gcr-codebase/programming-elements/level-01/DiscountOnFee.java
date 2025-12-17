public class DiscountOnFee{
	public static void main(String [] args){
		int initialFee = 125000;
		double discountPercent =10;
		double discountAmount = initialFee*(discountPercent/100);
		System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + (initialFee-discountAmount));
	}
}