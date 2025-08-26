package DSA03_Recursion;

class A01_Sum_of_N_Numbers {
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