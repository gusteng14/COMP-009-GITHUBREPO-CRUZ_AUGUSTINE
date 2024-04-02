package poly;

public class Fibonacci {
	public void print(int n) {
        NumberWords nw = new NumberWords();
        int prev = 0;
        int current = 1;
        int next = prev+current;
        int ctr = 0;
                  
        System.out.println("The Fibonacci Sequence is: ");
        if (n == 0) {
            System.out.println("zero");
        } 
        else if (n == 1) {
            System.out.println("zero");
        }
        else {
            for (int i = 3; i <= n; i++) {
                if (i == 3) {
                    System.out.print("zero, one, ");
                }
                nw.numtoword(next);
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
