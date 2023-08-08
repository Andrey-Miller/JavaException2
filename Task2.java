public class Task2 {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
        try {
            int d = 0;
            double catchedRes1 = intArray[7] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching ArithmeticException: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catching IndexOutOfBoundsException: " + e);
        }
    }  
}
