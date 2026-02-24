public class InvertedHalfPyramid {
    public static void IHalfPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        IHalfPyramid(6);
    }

}
