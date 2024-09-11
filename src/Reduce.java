public class Reduce {
    public static void main(String[] args) {
        int number = 100;
        int result = reducer(number);
        System.out.println(result);
    }

    public static int reducer(int n) {
        int sum = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n -= 1;
            }
            sum += 1;
        }
        return sum;
    }
}
