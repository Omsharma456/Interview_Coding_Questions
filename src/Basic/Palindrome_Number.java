package Basic;

public class Palindrome_Number {
    public static boolean palindrome(int num){
        int hold=num;
        int rev=0;
        while (num != 0) {
            rev=rev*10+num%10;
            num/=10;
        }
        return hold==rev;
    }

    public static void main(String[] args) {
        System.out.println(palindrome(1232));
    }
}
