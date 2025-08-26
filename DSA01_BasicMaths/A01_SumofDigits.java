class A01_SumofDigits {
    
    // Function to calculate sum of digits
    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;  // add last digit
            n = n / 10;     // remove last digit
        }
        return sum;
    }

    public static void main(String args[]) {
        int num = 12345;  // example number
        int result = sumOfDigits(num);
        System.out.println("Sum of digits of " + num + " = " + result);
    }
}