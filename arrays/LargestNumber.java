package arrays;

public class LargestNumber {
    public static int largest_number(int num[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++)
        {
            if (num[i]>largest)
            {
                largest=num[i];
            }
            
        }
        return largest;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,6,8,5};
        int res=largest_number(num);
        System.out.println("Largest number is : "+res);
    }
}
