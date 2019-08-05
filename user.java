package lastDay;

import java.util.Scanner;

public class user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sncr = new Scanner(System.in);
		
		String name = "";
		String color = "";
		String age = "";
		
		System.out.println("welcome");
		
		System.out.println("enter your name");
		name = sncr.next();
		
		System.out.println("what's your favorite color?");
		color = sncr.next();
		
		System.out.println("how old are you?");
		age = sncr.next();
		
		System.out.println("my name is " + name);
		System.out.println("my favorite color is " + color);
		System.out.println("my age is " + age);
		
		System.out.println("watch this majic trick");
		
		for( int i = 2; i < 1000; i *= 2) {
			System.out.println(i);
		}
			System.out.println("Here's our while loop");
			
			System.out.println("Flipped loop");
				int k = 5;
				int d = 15;
				
				while(d > 5) {
					
					k++;
					d--;
				}
					System.out.println(k);
					System.out.println(d);
			}
		}


