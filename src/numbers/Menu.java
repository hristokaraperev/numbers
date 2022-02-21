package numbers;

import java.util.Scanner;

public class Menu {
	int menu = 3;
	
	public Menu() {
		while(menu != 0) {
			Scanner input = new Scanner(System.in);
			System.out.println("1. Find perfect numbers in range?");		
			System.out.println("2. Find sum and average of numbers in range?");		
			System.out.println("0. Exit");
			System.out.println();
			System.out.print("What would it be?: ");
			menu = input.nextInt();
			System.out.println();
			if(menu == 1) {
				PerfectNumbersInRange test = new PerfectNumbersInRange();
				test.calculatePerfect(test.x, test.y);
				test = null;
				System.gc();
			}else if(menu == 2) {
				SumAndAverageInRange test = new SumAndAverageInRange();
				test.sumAndAverage(test.x, test.y);
				test = null;
				System.gc();
			}
			input = null;
			System.gc();
		}
	}
}

