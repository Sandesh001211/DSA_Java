import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        System.out.print("Enter a Size : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int line = 1; line <= n; line++) {
            for(int star=1;star<=line;star++)
            {
                System.out.print ("*");
            }
            System.out.println();
            // Add pattern logic here
        }

        System.out.println("For numbered Pattern");

        //for number pattern 
        for(int line = 1; line <= n; line++) {
            for(int star=1;star<=line;star++)
            {
                System.out.print (star);
            }
            System.out.println();
            // Add pattern logic here
        }
    }
}
