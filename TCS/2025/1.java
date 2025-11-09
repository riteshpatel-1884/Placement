 
import java.util.*;
class practice{
  public static int[] function(int[] arr){
    int n = arr.length;
    int[] ans = new int[n];
    int j=0;
    for(int i=0; i<n; i++){
      if (arr[i] != 0) {
        ans[j++] = arr[i];
      }
    }
    return ans;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {4,5,0,1,9,0,5,0};

    int[] result = function(arr);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }
}
