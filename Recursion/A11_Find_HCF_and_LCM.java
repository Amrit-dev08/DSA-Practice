package Recursion;

public class A11_Find_HCF_and_LCM {
    public static int findLCM(int dividend, int divisor) {
        int hcf = findHCF(dividend, divisor);
        int lcm = ((dividend * divisor) / hcf);
        return lcm;
    }

    public static int findHCF(int dividend, int divisor) {
        if (divisor == 0) {
            return dividend;
        }
        return findHCF(divisor, dividend % divisor);
    }

    public static void main(String[] args) {
        int dividend = 20;
        int divisor = 8;
        int hcf = findHCF(dividend, divisor);
        System.out.println("HCF is => " + hcf);
        int lcm = findLCM(dividend, divisor);
        System.out.println("LCM is => " + lcm);
    }
}
