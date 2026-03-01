package string;
class Palindrome
{
    public static boolean palindrome_check(String pal)
    {   int n=pal.length();
        for (int i=0;i<pal.length()/2;i++)//halfway
        {
            if (pal.charAt(i)!=pal.charAt(n-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pal="nan";
        System.out.println(palindrome_check(pal));
    }
}