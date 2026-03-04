package arrays;

class BubbleSort {
    public static void bubble_sort(int num[]) {

        for (int i = 0; i < num.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < num.length - 1 - i; j++) {

                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                if (i == 0) {
                    System.out.println("Array already sorted");
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        int num[] = {1,6,5,4,8,7};

        bubble_sort(num);

        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}