package Recursion;

class Recursion_02 {
    static int myFun(int n) {
        // base
        if (n == 0) {
            return 1;
        }
        return n * myFun(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int fact = myFun(n);
        System.out.println(fact);
    }
}