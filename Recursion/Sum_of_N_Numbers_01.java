package Recursion;

class Sum_of_N_Numbers_01 {
    static int myFun(int n) {
        // base
        if (n == 0) {
            return 0;
        }
        return n + myFun(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int sum = myFun(n);
        System.out.println(sum);
    }
}