package DSA03_Recursion;

public class A04_Palindrom_For_String {
    static String myFun(String str, int l, int r) {
        // base case
        if (l > r) {
            return str;
        }
        // str-->char then char-->str
        char[] chars = str.toCharArray();
        char temp = chars[l];
        chars[l] = chars[r];
        chars[r] = temp;
        str = new String(chars);
        return myFun(str, l + 1, r - 1);
    }

    public static void main(String[] args) {
        String str = "madam";
        String org = str;
        String rev = myFun(str, 0, str.length() - 1);
        if (org.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}

// Easy Method
// static boolean isPalindrome(String str, int l, int r) {
// if (l >= r) {
// return true;
// }
// if (str.charAt(l) != str.charAt(r)) {
// return false;
// }
// return isPalindrome(str, l + 1, r - 1);
//