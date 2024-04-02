package poly;

public class FibonacciNumber {
	public void print(int n) {
        int prev = 0;
        int current = 1;
        int next = prev+current;
        int ctr = 0;
        
        System.out.println("The Fibonacci Sequence is: ");
        if (n == 0) {
            System.out.println("0");
        } 
        else if (n == 1) {
            System.out.println("0");
        }
        else {
            for (int i = 3; i <= n; i++) {
                if (i == 3) {
                    System.out.print("0, 1, ");
                }
                System.out.print(next );
                if (i < n){
                System.out.print(", ");
                }
                prev = current;
                current = next;
                next = prev + current;
                ctr++;

                if (ctr == 9) {
                    System.out.println(" ");
                    ctr = 0;
                }
            }
        }
       
    }
}
