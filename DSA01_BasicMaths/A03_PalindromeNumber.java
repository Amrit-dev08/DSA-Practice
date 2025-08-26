class A03_PalindromeNumber {
    
    // Function to reverse a number
    static int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }

    // Function to check palindrome
    static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }

    public static void main(String args[]) {
        int num = 12321;  // example number
        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome");
        } else {
            System.out.println(num + " is NOT a Palindrome");
        }
    }
}