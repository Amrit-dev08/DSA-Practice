class A08_Factorial {
    
    // Function to calculate factorial
    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String args[]) {
        int num = 5;  // example number
        long result = factorial(num);
        System.out.println("Factorial of " + num + " = " + result);
    }
}