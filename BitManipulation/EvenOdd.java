package BitManipulation;

public class EvenOdd {
    public static void evenOdd()
    {
        int bitMask=1;
        if ((bitMask &1)==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        evenOdd();
    }
}
