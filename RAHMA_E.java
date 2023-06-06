

package java_a_rahma;


public class RAHMA_E {
 public static void main(String[] args) {
 int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    
 for (int nilai : arr) {
 if (String.valueOf(nilai).contains("2")) {
 System.out.print(nilai + " ");
 }
 }
 System.out.println();
 }
}
