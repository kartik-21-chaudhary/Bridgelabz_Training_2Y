public class sumofN {
    static int sumOfN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfN(10));
    }
}