public class Fibonacci {
    static int fibonnaci(int n){
        int fir =0;
        int sec =1;
        for(int i=0;i<=n;i++){
            int next = fir + sec;
            fir = sec;
            sec = next;
        }
        return fir;
    }
    public static void main(String[] args){
        System.out.println((fibonnaci(10)));
    }
}
