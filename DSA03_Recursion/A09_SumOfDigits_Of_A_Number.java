package DSA03_Recursion;

public class A09_SumOfDigits_Of_A_Number {
    public static int myFun(int num, int sum) {
        if (num < 1) {
            return sum;
        }
        return myFun(num / 10, sum + (num % 10));
    }
    
    public static void main(String[] args) {
        int n = 2536;
        int res = myFun(n, 0);
        System.out.println(res);
    }
}
