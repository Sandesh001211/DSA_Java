package arrays;

public class SubArrays {
    public static void subarrays(int num[]) {
        int tp=0;
        for (int i = 0; i < num.length; i++) {
            int start = i;
             
            for (int j = i; j < num.length; j++) {
                int end = j;
                for (int k = start; k<=end; k++) {
                    System.out.print(num[k] + " ");
                }
                System.out.println();
                tp++;
            }
            System.out.println();
        }
         System.out.println("Total Pairs are : "+tp);
    }

    public static void main(String[] args) {
        int num[] = { 3, 4, 5, 6, 8 };
        subarrays(num);
        
    }

}
