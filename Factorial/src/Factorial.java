public class Factorial {

    private Factorial(){
    }

    public static int compute(int n){
        int produs=1;
        for(int i=2;i<=n;i++){
            produs*=i;
        }
        return produs;
    }

    public static int execute(int n){
        if(n==0 || n==1) return 1;
        else return execute(n-1)*n;
    }
}
