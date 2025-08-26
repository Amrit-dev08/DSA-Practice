class A06_AllDivisors {

    // Function to print all divisors of a number
    static void printDivisors(int n) {
        System.out.print("Divisors of " + n + " = ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int num = 28;  // example number
        printDivisors(num);
    }
}