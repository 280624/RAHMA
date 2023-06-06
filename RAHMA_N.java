

package java_a_rahma;

public class RAHMA_N {
 public static void main(String[] args) {
 int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
 int[] cumulativeSum = new int[arr.length];
 cumulativeSum[0] = arr[0];
 System.out.print(cumulativeSum[0] + " ");
 for (int i = 1; i < arr.length; i++) {
 cumulativeSum[i] = cumulativeSum[i - 1] + arr[i];
 System.out.print(cumulativeSum[i] + " ");
 }
 System.out.println();
}   
}
