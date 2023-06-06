

package java_a_rahma;


public class RAHMA_F {
public static void main(String[] args) {
 int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
 for (int i = 1; i < arr.length - 1; i++) {
 if (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0 && arr[i + 1] % 2 == 0) {
 System.out.print(arr[i] + " ");
 }
 }
 System.out.println();
}    
}
