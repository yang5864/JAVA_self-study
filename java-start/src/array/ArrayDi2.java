package array;

public class ArrayDi2 {
    public static void main(String[] args) {
        int [][] arr = new int[2][3]; // 2행 3열

        arr[0][0] = 1; // 0행 0열
        arr[0][1] = 2; // 0행 0열
        arr[0][2] = 3; // 0행 0열
        arr[1][0] = 4; // 0행 0열
        arr[1][1] = 5; // 0행 0열
        arr[1][2] = 6; // 0행 0열

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
