class PowerOfTwo
{
    public static boolean isPowerOfTwo(int n )
    { 
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(15));
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(20));
        System.out.println(isPowerOfTwo(32));
    }
}