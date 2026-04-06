class PowerN
{
    public static int powerOfN(int number,int pow)
    {
        if (pow==0)
        {
            return 1;
        }
        // int nm1=powerOfN(number,pow-1);
        // int result =number *nm1;
        // return result;
        return number *powerOfN(number,pow-1);
    }
    public static void main(String[] args) {
        int number=2;
        int pow=10;
        System.out.println(powerOfN(number, pow));
    }
}