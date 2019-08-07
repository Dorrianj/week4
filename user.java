package lastDay;	

import java.util.Scanner;

public class user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sncr = new Scanner(System.in);
		
		String name = "";
		String color = "";
		int age = 0;
		int green= 10;
		int age1 = 16;
		System.out.println("welcome");
		
		System.out.println("enter your name");
		name = sncr.next();
		
		System.out.println("what's your favorite color?");
		color = sncr.next();
		
		System.out.println("how old are you?");
		age = sncr.nextInt();
		
		System.out.println("my name is " + name);
		System.out.println("my favorite color is " + color);
		System.out.println("my age is " + age);
		
		System.out.println("enter your age");

		
		for ( int x = age; x<= 100; x++){
			
			
			 if( x%3 ==0 && x%5 == 0) {
					System.out.println("color buzz");
					
				}else if( x%5 == 0) {
						System.out.println("color");
						
				}else if( x%3 == 0) {
					System.out.println("buzz"); 
						
					}
					System.out.println(x);

			
			
	
		
			
	}

}

}
