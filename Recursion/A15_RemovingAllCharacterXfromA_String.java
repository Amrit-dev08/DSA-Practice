package Recursion;

public class A15_RemovingAllCharacterXfromA_String {
    public static String myFun(String str, int i, char ch) {
        if (i >= str.length()) {
            return "";
        }
        if (str.charAt(i) == ch) {
            // skip this char
            return myFun(str, i + 1, ch);
        } else {
            // keep this char
            return str.charAt(i) + myFun(str, i + 1, ch);
        }
    }

    public static void main(String[] args) {
        String str = "xenonxoxide"; // enonoide
        String res = myFun(str, 0, 'x');
        System.out.println(res);
    }
}