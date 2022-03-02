package week9;

import java.util.Scanner;

public class EnumDemo {

	public static void main(String[] args) {
		Day today;
		today = Day.TUE;
		Scanner inp = new Scanner(System.in);
		
		for(Day d:Day.values()) {
			System.out.println(d);
		}
		System.out.println("What day is today? Enter only first three characters");
		String newDay = inp.nextLine().toUpperCase();
		Day userInput = Day.valueOf(newDay);
		
	
		switch(userInput) {
		case SUN:
			System.out.println("It's Sunday");
			break;
		case MON:
			System.out.println("It's Monday");
			break;
		case TUE:
			System.out.println("It's Tuesday");
			break;
			default:
				System.out.println("It's invalid");
		}
		
		if(userInput ==Day.SUN){//you must specify "Day.SUN" 
			
		}
		
		inp.close();
	}

}
