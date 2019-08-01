package date1;

import java.util.Scanner;

public class freestyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sncr = new Scanner(System.in);
		
		int blue = 0;
		String movies = "see a movie..... 20$";
		String arcade = "play games.... 7$ per game";
		String dinner = "go have lunch....40$";
		String camping = "go camping in woods.... 45$";
		String picnic = "have lunch at the park....25$";
		String canuing = "go on a canue....40$";
		String park = "walk in the park.... free";
		String games = "play baord games at home....free";
		String name = "";
		String green = "";
		
		
		System.out.println("welcome to your date");
		
		System.out.println("what's your name");
		name = sncr.next();
		
		System.out.println("would you like your date outdoors or indoors " + name);
		green = sncr.next();
		
		System.out.println("what's your budget?");
		green = sncr.next();
		
		if (name.equalsIgnoreCase("indoors") && blue<= 25) 
		System.out.println(movies);
		System.out.println(arcade);
		System.out.println(picnic);
		System.out.println(games);
		{
		
		if (name.equalsIgnoreCase("outdoors") && blue>= 40)
		System.out.println(camping);
		System.out.println(dinner);
		System.out.println(canuing);
		System.out.println(park);
		{
			
		}
			
		System.out.println("thanks for your participation " + name + " hope you enjoy your date ");	
		}
		
		
		
		
	}

}
