package poly;

public class NumberWords {
	static String onetonineteen[] = {
	        " ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
	        "sixteen", "seventeen", "eighteen", "nineteen"
	    };

	    static String tens[] = {
	        " ", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
	    };

	    void tens (int n) {
	       int last = n%10;
	       int div = n/10;
	       int second = div%10;
	       int first = n/100;

	       System.out.print(tens[second] + " " + onetonineteen[last]);
	   }

	    void hundreds (int n) {
	       int last = n%10;
	       int div = n/10;
	       int second = div%10;
	       int last_two = n%100;
	       int first = n/100;

	       if (last_two > 19 ) {
	           System.out.print( onetonineteen[first] + " hundred " + tens[second] + " " + onetonineteen[last]);
	       }
	       else if (last_two < 19) {
	           System.out.print(onetonineteen[first] + " hundred " + onetonineteen[last_two]);

	       }
	   }

	    void thousands (int n) {
	       int fourth = n%10;
	       int div1 = n/10;
	       int third = div1%10;
	       int div2 = div1/10;
	       int second = div2%10;
	       int last_two = n%100;
	       int first = n/1000;

	       if (n == 1000) {
	           System.out.print("one thousand");
	       }
	       else if (last_two > 19) {
	           System.out.print(onetonineteen[first] + " thousand " + onetonineteen[second] + " hundred " +
	               tens[third] + " " + onetonineteen[fourth]);
	       }
	       else if (last_two < 20) {
	           System.out.print(onetonineteen[first] + " thousand " + onetonineteen[second] + " hundred " +
	               onetonineteen[last_two]);
	       }
	   }

	    void ten_thousands (int n) {
	       int fifth = n%10;
	       int div1 = n/10;
	       int fourth = div1%10;
	       int div2 = div1/10;
	       int third = div2%10;
	       int div3 = div2/10;
	       int second = div3%10;
	       int first_two = n/1000;
	       int last_two = n%100;
	       int first = n/10000;
	       
	       if (n == 10000) {
	           System.out.print("ten thousand");
	       }
	       else if (n == 20000) {
	            System.out.print("twenty thousand");
	       }
	       else if (n == 30000) {
	            System.out.print("thirty thousand");
	       }
	       else if (n == 40000) {
	            System.out.print("forty thousand");
	       }
	       else if (n == 50000) {
	            System.out.print("fifty thousand");
	       }
	       else if (n == 60000) {
	            System.out.print("sixty thousand");
	       }
	       else if (n == 70000) {
	            System.out.print("seventy thousand");
	       }
	       else if (n == 80000) {
	            System.out.print("eighty thousand");
	       }
	       else if (n == 90000) {
	            System.out.print("ninety thousand");
	       }
	       else if(first_two > 19 && last_two > 19 && third == 0) {
	            System.out.print( tens[first] + " " + onetonineteen[second] + " thousand " + 
	                    tens[fourth] + " " + onetonineteen[fifth]);
	       }
	       else if (first_two < 20 && last_two > 19) {
	           System.out.print( onetonineteen[first_two] + " thousand " + 
	                   onetonineteen[third] + " hundred " + tens[fourth] + " " + onetonineteen[fifth]);
	       }
	       else if (first_two < 20 && last_two < 20) {
	           System.out.print( onetonineteen[first_two] + " thousand " + 
	                   onetonineteen[third] + " hundred " + onetonineteen[last_two]);
	       }
	       else if (first_two > 19 && last_two < 20) {
	           System.out.print( tens[first] + " " + onetonineteen[second] + " thousand " + 
	                   onetonineteen[third] + " hundred " + onetonineteen[last_two]);
	       }
	       else if(first_two > 19 && last_two > 19) {
	            System.out.print( tens[first] + " " + onetonineteen[second] + " thousand " + 
	                   onetonineteen[third] + " hundred " + tens[fourth] + " " + onetonineteen[fifth]);
	       }
	       

	   }  
	    void hun_thousands (int n) {
	       int sixth = n%10;  
	       int div1 = n/10;
	       int fifth = div1%10;
	       int div2 = div1/10;
	       int fourth = div2%10;
	       int div3 = div2/10;
	       int third = div3%10;
	       int div4 = div3/10;
	       int second = div4%10;
	       int first_two = (n/1000)%100;
	       int last_two = n%100;
	       int first = n/100000;
	       

	       if (n == 100000) {
	           System.out.print("one hundred thousand");
	       }
	       else if (n == 200000) {
	            System.out.print("two hundred thousand");
	       }
	       else if (n == 300000) {
	            System.out.print("three hundred thousand");
	       }
	       else if (n == 400000) {
	            System.out.print("four hundred thousand");
	       }
	       else if (n == 500000) {
	            System.out.print("five hundred thousand thousand");
	       }
	       else if (n == 600000) {
	            System.out.print("six hundred thousand");
	       }
	       else if (n == 700000) {
	            System.out.print("seven hundred thousand");
	       }
	       else if (n == 800000) {
	            System.out.print("eight hundred thousand");
	       }
	       else if (n == 900000) {
	            System.out.print("nine hundred thousand");
	       }
	       else if (first_two == 0 && last_two < 20) {
	           System.out.print( onetonineteen[first] + " hundred thousand " + onetonineteen[fourth] + " hundred " + 
	                   onetonineteen[sixth]);
	       }
	       else if (first_two < 20 && last_two < 20) {
	           System.out.print( onetonineteen[first] + " hundred " + onetonineteen[first_two] + " thousand " + 
	                   onetonineteen[fourth] + " hundred " + onetonineteen[last_two]);
	       }
	       else if (first_two > 19 && last_two < 20) {
	           System.out.print( onetonineteen[first] + " hundred " + tens[second] + onetonineteen[third] + " thousand " + 
	                   onetonineteen[fourth] + " hundred " + onetonineteen[last_two]);
	       }
	       else if (first_two == 0 && last_two > 19) {
	           System.out.print( onetonineteen[first] + " hundred thousand " + onetonineteen[fourth] + " hundred " + 
	                   tens[fifth] + " " + onetonineteen[sixth]);
	       }
	        else if (first_two < 20 && last_two > 19) {
	           System.out.print( onetonineteen[first] + " hundred " + onetonineteen[first_two] + " thousand " + 
	                   onetonineteen[fourth] + " hundred " + tens[fifth] + " " + onetonineteen[sixth]);
	       }
	       else if (first_two > 19 && last_two > 19) {
	           System.out.print( onetonineteen[first] + " hundred " + tens[second] + onetonineteen[third] + " thousand " + 
	                   onetonineteen[fourth] + " hundred " + tens[fifth] + " " + onetonineteen[sixth]);
	       }
	   }
	    void millions (int n) {
	       int seventh = n%10;
	       int div1 = n/10;
	       int sixth = div1%10;  
	       int div2 = div1/10;
	       int fifth = div2%10;
	       int div3 = div2/10;
	       int fourth = div3%10;
	       int div4 = div3/10;
	       int third = div4%10;
	       int div5 = div4/10;
	       int second = div5%10;
	       int first_two = (n/10000)%100;
	       int last_two = n%100;
	       int first = n/1000000;

	       


	       if (n == 1000000) {
	           System.out.println("one million");
	       }
	       else if (n == 2000000) {
	            System.out.println("two million");
	       }
	       else if (n == 3000000) {
	            System.out.println("three million");
	       }
	       else if (n == 4000000) {
	            System.out.println("four million");
	       }
	       else if (n == 5000000) {
	            System.out.println("five million");
	       }
	       else if (n == 6000000) {
	            System.out.println("six million");
	       }
	       else if (n == 7000000) {
	            System.out.println("seven million");
	       }
	       else if (n == 8000000) {
	            System.out.println("eight million");
	       }
	       else if (n == 9000000) {
	            System.out.println("nine million");
	       }
	        else if (first_two == 0 && last_two < 20) {
	           System.out.print(onetonineteen[first] + " million " + onetonineteen[second] + " hundred thousand " + onetonineteen[fifth] + " hundred " + 
	                   onetonineteen[seventh]);
	       }
	       else if (first_two < 20 && last_two < 20) {
	           System.out.print( onetonineteen[first] + " million " + onetonineteen[second] + " hundred " + onetonineteen[first_two] + " thousand " + 
	                   onetonineteen[fifth] + " hundred " + onetonineteen[last_two]);
	       }
	       else if (first_two > 19 && last_two < 20) {
	           System.out.print(onetonineteen[first] + " million " + onetonineteen[second] + " hundred " + tens[third] + onetonineteen[fourth] + " thousand " + 
	                   onetonineteen[fifth] + " hundred " + onetonineteen[last_two]);
	       }
	       else if (first_two == 0 && last_two > 19) {
	           System.out.print( onetonineteen[first] + " million " + onetonineteen[second] + " hundred thousand " + onetonineteen[fifth] + " hundred " + 
	                   tens[sixth] + " " + onetonineteen[seventh]);
	       }
	        else if (first_two < 20 && last_two > 19) {
	           System.out.print(onetonineteen[first] + " million " + onetonineteen[second] + " hundred " + onetonineteen[first_two] + " thousand " + 
	                   onetonineteen[fifth] + " hundred " + tens[sixth] + " " + onetonineteen[seventh]);
	       }
	   }

	    void ten_millions (int n) {
	        int eigth = n%10;
	        int div1 = n/10;
	        int seventh = div1%10;
	        int div2 = div1/10;
	        int sixth = div2%10;  
	        int div3 = div2/10;
	        int fifth = div3%10;
	        int div4 = div3/10;
	        int fourth = div4%10;
	        int div5 = div4/10;
	        int third = div5%10;
	        int div6 = div5/10;
	        int second = div6%10;
	        int first_two = (n/10000)%100;
	        int last_two = n%100;
	        int first = n/10000000;
	        int f_first_two = 1000000;
	        
	      
	        if (n == 10000000) {
	            System.out.println("ten million");
	        }
	        else if (n == 20000000) {
	             System.out.println("twenty million");
	        }
	        else if (n == 30000000) {
	             System.out.println("thirty million");
	        }
	        else if (n == 40000000) {
	             System.out.println("forty million");
	        }
	        else if (n == 50000000) {
	             System.out.println("fifty million");
	        }
	        else if (n == 60000000) {
	             System.out.println("sixty million");
	        }
	        else if (n == 70000000) {
	             System.out.println("seventy million");
	        }
	        else if (n == 80000000) {
	             System.out.println("eighty million");
	        }
	        else if (n == 90000000) {
	             System.out.println("ninety million");
	        }
	        else if (f_first_two < 20 && first_two < 20 && last_two < 20) {
	            System.out.println( onetonineteen[f_first_two] + " million " + onetonineteen[third] + " hundred thousand " +
	                    onetonineteen[sixth]);     
	        }
	        else if (f_first_two > 19 && first_two < 20 && last_two < 20) {
	            System.out.println(tens[first] + " " + onetonineteen[second] + " million " + onetonineteen[third] + " hundred thousand " +
	                    onetonineteen[sixth]);     
	       }
	        else if (f_first_two < 20 && first_two > 19 && last_two < 20) {
	            System.out.println(onetonineteen[f_first_two] + " million " + onetonineteen[third] + " hundred " + tens[fourth] + 
	                    " " + onetonineteen[fifth] + " thousand " +
	                    onetonineteen[sixth]);     
	       }
	    }
	       
	       
	   
	    
	    public  void numtoword(int n) {
	      
	        if (n == 0) {
	            System.out.print("zero");
	        }
	        else if (n < 20) {
	            System.out.print( onetonineteen[n]);
	        }  
	        else if (n < 100) {
	           tens(n);
	        } 
	        else if (n < 1000) {
	             hundreds(n);         
	        }
	        else if (n < 10000) {
	            thousands(n);
	        }
	        else if (n < 100000) {
	            ten_thousands(n);
	        }
	        else if (n < 1000000) {
	            hun_thousands(n);
	        }
	        else if (n < 10000000) {
	            millions(n);
	        }
	        else if (n < 100000000) {
	            ten_millions(n);
	        }
	       
	        

	    }
}
