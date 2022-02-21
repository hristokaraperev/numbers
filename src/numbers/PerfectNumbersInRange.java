package numbers;

import java.util.Scanner;

public class PerfectNumbersInRange {
	long x = 0, y = 0;
	
	public PerfectNumbersInRange() {
		Scanner input = new Scanner(System.in);
		System.out.print("Show perfect numbers from: ");
		x = input.nextLong();
		System.out.print("To: ");
		y = input.nextLong();
		System.out.println();
		input = null;
		System.gc();
	}
	
	public void calculatePerfect(long x, long y) {
		boolean isPrime = false, isMersennePrime = false;
		long mersennePrime = 0, perfectNumber = 0, limit = 2305843008139952128l;
		for(long i = 2; i < y; i++) {
			isPrime = true;
			isMersennePrime = true;
			mersennePrime = 0;
			perfectNumber = 0;
			for(long d = 2; d <= i/2; d++) {
				if(i % d == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				mersennePrime = (long) (Math.pow(2, i) - 1);
				for(long d = 2; d <= mersennePrime/2; d++) {
					if(mersennePrime % d == 0) {
						isMersennePrime = false;
						break;
					}
				}
				if(isMersennePrime) {
					perfectNumber = (mersennePrime * (mersennePrime + 1)) / 2;
					if(perfectNumber > y) {
						System.out.println();
						System.out.println("No more perfect numbers in range");
						System.out.println();
						break;
					}
					if(perfectNumber >= x && perfectNumber <= y) {
						System.out.println(perfectNumber);
						if(perfectNumber == limit) {
							System.out.println("Cannot compute longer numbers");
							System.out.println();
							break;
						}
					}
				}
			}
		}
	}
}


//Brute forces perfect numbers. Perfect numbers are always even
		/*
		long x = input.nextLong();
		long sum = 0;
		for (long i = 1; i < x; i++) {
			sum = 0;
			if (i % 2 != 0) {
				continue;
			}
			for (long d = 1; d <= i/2; d++) {
				if (i % d == 0) {
					sum = sum + d;
				}
				if (sum > i) {
					System.out.print(i);
					System.out.println(" is not a perfect number");
					break;
				}
			}
			if (sum + i == i * 2) {
				System.out.print(i);
				System.out.println(" is a perfect number");
			}
			sum = 0;
			
		}
		 */	
