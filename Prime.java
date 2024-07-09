import java.util.ArrayList;

public class Prime {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= 50; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        System.out.println("Prime numbers between 0 and 50: " + primes);
    }
}
