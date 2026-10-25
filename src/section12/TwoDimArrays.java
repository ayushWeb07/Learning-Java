package section12;

public class TwoDimArrays {

    static void show(int[][] arr, int r, int c) {
        for (int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

        System.out.println();
    }
    public static void main(String[] args) {
        int[][] nums= {{1, 2, 3}, {4, 5, 6}};
        show(nums, nums.length, nums[0].length);
    }
}
