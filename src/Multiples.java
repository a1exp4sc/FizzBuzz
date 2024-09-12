public class Multiples {

    // Original main method which calculates the sum of multiples
    public static int main(int n, int a, int b) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            boolean divisibleByA = i % a == 0;
            boolean divisibleByB = i % b == 0;

            if (divisibleByA || divisibleByB) {
                sum += i;
            }
        }

        return sum;
    }

    // Overloaded main method which calls the original main method with default values
    public static void main(String[] args) {
        // Call the original main method with default values
        int result = main(1000, 3, 5);
        System.out.println(result);
    }
}
