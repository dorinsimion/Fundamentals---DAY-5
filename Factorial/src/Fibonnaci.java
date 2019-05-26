public class Fibonnaci {
    // 0 1 1 2 3 5 8 13 21 35 ...
    private Fibonnaci(){}

    public static int compute(int n){
        if(n==0 || n==1) return n;
        int prevprevfib=0;
        int prevfib=1;
        int fib=0;
        for(int i=2;i<=n;i++){
            fib=prevprevfib+prevfib;
            prevprevfib=prevfib;
            prevfib=fib;
        }
        return fib;
    }

    public static int execute(int n){
        if(n==0 || n==1) return n;
        return execute(n-2)+execute(n-1);
    }
}
