
package euler2;

public class Euler2 {

    public static void main(String[] args) {
        int count = 2;
        int prev = 0;
        
        int[] fib = new int[4000000];
        fib[0] = 1;
        fib[1] = 2;
        
        for(int i = 2; i < fib.length; i++){
            
            int prev1 = fib[i-1];
            int prev2 = fib[i-2];
            
            int temp = prev1 + prev2;
            fib[i] = temp;
            
            if(temp % 2 == 0){
                count += temp;
            }
            
            if(temp > 4000000){
                System.out.println(count);
                break;
            }
        }
    }
    
}
