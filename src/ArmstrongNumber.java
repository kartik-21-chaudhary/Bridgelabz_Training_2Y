public class ArmstrongNumber {
    public static int armstrong(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n/10;
        }
        return count;
    }

    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int power = armstrong(n);
        int sum = 0;
        while (n > 0) {
            int remainder = n % 10;
            sum += Math.pow(remainder, power);
            n = n / 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int n = 153;
        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
