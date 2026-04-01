public class DecreasingNumber {
    public static void PrintDes(int n)
    {
        if (n==1)
        {
            System.out.println(n);
            return ;
        }
        System.out.print(n +" ");
        PrintDes(n-1);
    }
    public static void main(String[] args) {
        int n =10;
        PrintDes(n);
    }
    
}
