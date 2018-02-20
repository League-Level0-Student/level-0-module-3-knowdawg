//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package modulo;


/*
1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz

*/

public class FizzBuzz {
	public static void main(String[] args) {
		
		
		for (int i = 1; i < 21; i++) {
			
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzBuzz!");
				
			} else if (i % 3 == 0 ) {
				System.out.println("fizz");
				
			} else if (i % 5 == 0) {
				System.out.println("buzz");
				
			}  else {
				System.out.println( i);
				
			}
			
			
			
			
			
		}
		
		
		
	}
}

