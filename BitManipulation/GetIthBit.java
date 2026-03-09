class GetIthBit {
    public static int get_ith_bit(int n, int i) {
        int bitMask = 1 << i;
        if ((bitMask & 1) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.print(get_ith_bit(num, 2));
    }
}