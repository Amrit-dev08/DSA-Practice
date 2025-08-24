package Recursion;

class A10_SumOf_N_Numbers_with_AlternativeSign {
    static int myFun(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        if (n % 2 == 0) {
            sum = sum + n;
        } else {
            sum = sum - n;
        }
        return myFun(n - 1, sum);
    }

    public static void main(String[] args) {
        int n = 5;
        int sum = myFun(n, 0);
        System.out.println(sum);
    }
}