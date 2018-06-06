package helpermethods;

public class GetCurrentExecutableTestName {

    // Helper method for getting the name of the current method dynamically
    private static String getMethodName() {
        return Thread.currentThread().getStackTrace()[3].getMethodName();
    }

    public static void printCurrentExecutableTestName() {
        System.out.println();
        System.out.println("Current executable test is: " + getMethodName());
        System.out.println();
    }
}
