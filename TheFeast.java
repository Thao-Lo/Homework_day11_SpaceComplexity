package be5_day13_DSA_sort_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TheFeast {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Money: ");
		int money = keyboard.nextInt();
		System.out.print("Candy's price: ");
		int price = keyboard.nextInt();

		int exchange = 0;
		do {
			System.out.print("Exchange value: ");
			exchange = keyboard.nextInt();
		} while (exchange <= 1);

		int totalCandies = theFeast(money, price, exchange);
		System.out.println("Total candies: " + totalCandies);

	}
	//TIME COMPLEXITY: On
	//SPACE COMPLEXITY: On

	static public int theFeast(int money, int price, int exchange) {
		int candy = 0;		
		if (money < price) {
			return 0;
		}
		
		if (money >= price) {
			candy = money / price;			
		}
		
		int total = candy;
		while (candy / exchange >= 1) {			
			total += (candy / exchange);
			candy = candy / exchange + (candy % exchange);
		}

		return total;
	}

}