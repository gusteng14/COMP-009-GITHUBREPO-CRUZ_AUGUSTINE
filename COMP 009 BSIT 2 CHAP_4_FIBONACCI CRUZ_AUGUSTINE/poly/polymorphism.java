/*
 2.) Research on making the Fibonacci series interactive by asking user to input how many elements should be printed
 	A. Using polymorphism and inheritance make the user choose if he wants it in numbers or in words
 */


package poly;
import java.util.Scanner;

class FiboWords extends FibonacciNumber { // class that inherits method from FibonacciNumber class
	public void print(int n) {
        NumberWords nw = new NumberWords(); // class about translating numbers into words
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

public class polymorphism {
	public static void main(String[] args) {
		System.out.print("Enter number of Fibonacci Elements: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		System.out.println("Do you want to print the elements in: ");
		System.out.println("1 - Numbers");
		System.out.println("2 - Words");
		System.out.print("Enter your choice: ");
		Boolean choice = false;
		
		FibonacciNumber fibonum = new FibonacciNumber();
		FiboWords fiboword = new FiboWords();
		
		while(!choice) {
			int m = scanner.nextInt();
			if (m == 1) {
				choice = true;
				fibonum.print(num);
			}
			else if (m == 2) {
				choice = true;
				fiboword.print(num);
			}
			else {
				System.out.println("Wrong input. Please try again.");
			}
		}
		

	}
}
