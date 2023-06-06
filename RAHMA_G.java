

package java_a_rahma;


public class RAHMA_G {
 public static void main(String[] args) {
 int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
 for (int i = 1; i < arr.length; i++) {
 if (arr[i] % 5 == 0 && arr[i - 1] % 5 == 0) {
 System.out.print(arr[i] + " ");
 }
 }
 System.out.println();
 }
}
