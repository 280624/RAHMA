

package java_a_rahma;


public class RAHMA_K {
 public static void main(String[] args) {
 int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
 for (int i = 0; i < arr.length - 1; i++) {
 if (arr[i] < arr[i + 1]) {
 System.out.print(arr[i] + " ");
 }
 }
 System.out.println();
 }
}
