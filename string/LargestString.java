package string;
public class LargestString {
    public static String largest_string(String names[])
    {
        String largest=names[0];
        for(int i =0;i<names.length;i++)
        {
            if(largest.compareTo(names[i])<0)
            {
                largest=names[i];
            }
        }
        return largest;


    }
    public static void main(String[] args) {
        String names[]={"sandesh","shubham","sanket"};
        System.out.println(largest_string(names));
    }
}
