package Basic;

public class Armstrong_Number {
    public static boolean armstrong(int num) {
        int hold=num;
        int result=0;
        while (num != 0) {
            int digit=num%10;
            result += (Math.pow(digit, 3));
            num/=10;
        }
        return result==hold;
    }
    public static void main(String[] args) {
        System.out.println(armstrong(1));
    }
}
