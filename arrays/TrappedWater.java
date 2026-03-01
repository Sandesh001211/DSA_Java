package arrays;

public class TrappedWater {
    public static int trapped_water(int height[])
    {
        int n =height.length;
        //leftMaxBoundry
        int left []=new int [n];
        left[0]=height[0];
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(height[i],left[i-1]);
        }

        //rightMaxBoundry
        int right[]=new int[n];
        right[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(height[i],right[i+1]);
        }
         
        //waterLevel
        int trapped_water=0;
        for(int i=0;i<n;i++)
        {
            int waterLevel=Math.min(left[i],right[i]);
            trapped_water+=waterLevel-height[i];
        }
        return trapped_water;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println("Trapped water : "+trapped_water(height));
    }
}
