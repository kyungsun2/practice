class Solution {
    public double solution(int[] numbers) {
        double total = 0;
        
        for (int number : numbers) {
            total += number;
        }
        
        double average = total / numbers.length;
        
        return average;
    }
}