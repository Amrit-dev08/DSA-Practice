package Recursion;

public class A08_X_toPower_n {
    static int myFun(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * myFun(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 10;
        int n = 3;
        int res = myFun(x, n);
        System.out.println(res);
    }
}
