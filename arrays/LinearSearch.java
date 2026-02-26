package arrays;

public class LinearSearch {
    public static int linear_search(int num[],int key)
    {
        for (int i=0;i<num.length;i++)
        {
            if (num[i]==key)
            {
                return i;
            }
             
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={2,4,3,6,8,10,12,14,16};
        int key=10;
        int index=linear_search(num, key);
        if (index==-1)
        {
            System.out.println("Not Found");
        }
        else{
            System.out.println("Found at index : "+index);
        }
    }
    
}
