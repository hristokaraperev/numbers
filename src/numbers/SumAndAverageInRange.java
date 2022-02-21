package numbers;

import java.util.Scanner;

public class SumAndAverageInRange {
	long x = 0, y = 0;
	
	public SumAndAverageInRange() {
		Scanner input = new Scanner(System.in);
		System.out.print("Sum and average of numbers in a range from: ");
		x = input.nextLong();
		System.out.print("To: ");
		y = input.nextLong();
		System.out.println();
		input = null;
		System.gc();
	}
	
	public void sumAndAverage(long x, long y) {
		long sum = 0;
		long n = ((y - x) + 1);
		for(long i = x; i <= y; i++) {
			sum += i;
		}
		System.out.print("N = ");
		System.out.println(n);
		System.out.print("The sum is: ");
		System.out.println(sum);
		System.out.print("The average is: ");
		System.out.println((double) sum / n);
		System.out.println();
	}
}
