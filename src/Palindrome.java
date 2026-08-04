public class Palindrome {
    static boolean isPalindrome(int n){
        int org =n;
        int rev =0;

        while(n>0){
            int dig = n % 10;
            rev = rev*10 + dig;
            n = n/10;
        }
        return org ==rev;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
