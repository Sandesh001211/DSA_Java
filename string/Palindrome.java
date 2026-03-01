package string;
class Palindrome
{
    public static boolean palindrome_check(String pal)
    {   int n=pal.length();
        for (int i=0;i<pal.length();i++)
        {
            if (pal.charAt(i)!=pal.charAt(n-1-i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pal="na";
        System.out.println(palindrome_check(pal));
    }
}