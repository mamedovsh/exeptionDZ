public class Homework2 {
    public static void main(String[] args) {
        try {
            int[] intArray = {5,6,4,3,6,3,1,8,9};

            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
