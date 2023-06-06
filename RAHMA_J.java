

package java_a_rahma;


public class RAHMA_J {
 public static void main(String[] args) {
 int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
 for (int i = 0; i < arr.length - 1; i++) {
 if (arr[i] % 2 == 0 && arr[i + 1] % 2 == 0) {
 int selisih = arr[i + 1] - arr[i];
 System.out.print(selisih + " ");
 }
 }
 System.out.println();
 }   
}
