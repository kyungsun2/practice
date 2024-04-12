class Solution {
    public int solution(int n) {
         
        int piecesPerPizza = 7;
        
        int pizzas = n / piecesPerPizza;
        if (n % piecesPerPizza != 0) {
            pizzas++;
            
            
        }
        
        return pizzas;
    }
}