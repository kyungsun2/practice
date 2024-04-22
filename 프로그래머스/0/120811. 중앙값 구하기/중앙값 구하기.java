import java.util.Arrays;

class Solution {
    public double solution(int[] array) {
      
         Arrays.sort(array);
        int length = array.length;
        
        if (length % 2 == 1) {
            return array[length / 2];
        }else{
            int midIndex1 = length / 2 - 1;
            int midIndex2 = length / 2;
            return (array[midIndex1] + array[midIndex2]) / 2.0;
        }
    }
}