

package java_a_rahma;


public class RAHMA_L {
 public static void main(String[] args) {
 int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
 int total = 0;
 for (int i = 0; i < arr.length - 1; i++) {
 int jumlah = arr[i] + arr[i + 1];
 if (jumlah % 2 == 0) {
 System.out.print(jumlah + " ");
 total++;
 }
 }
 System.out.println();
 }   
}
