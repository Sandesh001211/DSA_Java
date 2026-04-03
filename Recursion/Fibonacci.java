class Fibonnaci
{
    public static int fib(int n )
    {
        if (n==1|n==0)
        {
            return n ;
        }
        int fibn1=fib(n-1);
        int fibm2=fib(n-2);
        int fibb=fibn1 +fibm2;
        return fibb;
    }
    public static void main(String[] args) {
        int n=25;
        System.out.println(fib(n));
    }
}