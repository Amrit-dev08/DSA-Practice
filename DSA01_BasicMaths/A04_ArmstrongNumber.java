class A04_ArmstrongNumber {
    
    // Function to check Armstrong number
    static boolean isArmstrong(int n) {
        int temp = n, sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;  // cube of digit
            n = n / 10;
        }
        return sum == temp;
    }

    public static void main(String args[]) {
        int num = 153;  // example number
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is NOT an Armstrong Number");
        }
    }
}