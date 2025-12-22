public class NullPointerExceptionDemo {
	// Method to generate NullPointerException
    public static void generateException() {
        String text = null;      // variable initialized to null
        System.out.println(text.length()); // Exception occurs here
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;      // variable initialized to null

        try {
            System.out.println(text.length()); // risky code
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught and handled!");
        }
    }

    public static void main(String[] args) {

        // 1. Calling method that generates exception
        System.out.println("Generating NullPointerException:");
        //generateException();

        // 2. Refactored code – handling the exception
        System.out.println("\nHandling NullPointerException:");
        handleException();
    }
}
