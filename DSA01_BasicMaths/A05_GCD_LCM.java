class A05_GCD_LCM {
    
    // Function to find GCD using Euclidean algorithm
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to find LCM
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String args[]) {
        int num1 = 24, num2 = 36;  // example numbers
        
        int g = gcd(num1, num2);
        int l = lcm(num1, num2);
        
        System.out.println("GCD of " + num1 + " and " + num2 + " = " + g);
        System.out.println("LCM of " + num1 + " and " + num2 + " = " + l);
    }
}