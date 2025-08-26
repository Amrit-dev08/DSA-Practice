class A02_ReverseNumber {
    
    // Function to reverse a number
    static int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;     // extract last digit
            rev = rev * 10 + digit; // add digit to reversed number
            n = n / 10;             // remove last digit
        }
        return rev;
    }

    public static void main(String args[]) {
        int num = 12345;  // example number
        int result = reverseNumber(num);
        System.out.println("Reverse of " + num + " = " + result);
    }
}