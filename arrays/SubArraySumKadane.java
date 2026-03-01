package arrays;

public class SubArraySumKadane {
    public static void kadaneAlgo(int num[])
    {
        int currentSum=0;
        int maxSubArray=Integer.MIN_VALUE;
        for (int i=0;i<num.length;i++)
        {
            currentSum+=num[i];
            if (currentSum<0)
            {
                currentSum=0;
            }
            maxSubArray=Math.max(currentSum,maxSubArray);
             
            

        }
        System.out.println("Max Sub Array : "+maxSubArray);
    }
    public static void main(String[] args) {
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        kadaneAlgo(num);
    }
    
}
