class A07_PrimeUptoN {
    
    // Function to check prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Function to print all primes up to N
    static void printPrimes(int N) {
        System.out.print("Prime numbers up to " + N + " = ");
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int N = 50;  // example value
        printPrimes(N);
    }
}