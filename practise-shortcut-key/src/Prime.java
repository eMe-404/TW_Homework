
public class Prime {

    void primeNumbers(int begin, int end) {
        for (int i = begin; i < end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

     private boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}