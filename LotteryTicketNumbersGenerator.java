/* Implementing a Java class named LotteryTicketNumbersGenerator, which can generate a Powerball ticket’s numbers or Mega Millions ticket’s numbers. 
(1) Inside the class, there is a method named GeneratePowerballTicketNumbers, which is used to randomly generate a Powerball ticket numbers.
(2) Inside the class, there is a method named GenerateMegaMillionsTicketNumbers, which is used to randomly generate a Mega Millions ticket numbers.
(3) Inside the class, its main method prompts its users to select which lottery to play and allow the uses to select the lottery through input from 
keyboard and generate the corresponding lottery ticket numbers and print it out.
*/

import java.util.Random;
import java.util.Scanner;
import java.lang.System;

public class LotteryTicketNumbersGenerator {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int lottery = 0;
		System.out.println("Please select which lottery to play: ");
		System.out.println("1. Powerball");
		System.out.println("2. Mega Millions");
		
        try {
            lottery = input.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid Input");
            System.exit(lottery);
        }
		
		
		if (lottery == 1) {
			GeneratePowerballTicketNumbers();
		}
		else if (lottery == 2) {
			GenerateMegaMillionsTicketNumbers();
		}
		else {
			System.out.println("Invalid input");
		}
		
		input.close();
	}
	
	public static void GeneratePowerballTicketNumbers() {
		
		Random random = new Random();
		
		int[] powerball = new int[6];
		
		for (int i = 0; i < 5; i++) {
			powerball[i] = random.nextInt(69) + 1;
		}
		
		powerball[5] = random.nextInt(26) + 1;
		
		System.out.println("Your Powerball ticket numbers are: ");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(powerball[i] + " ");
		}
		
		System.out.print("Powerball: " + powerball[5]);
	}
	
	public static void GenerateMegaMillionsTicketNumbers() {
		
		Random random = new Random();
		
		int[] megaMillions = new int[6];
		
		for (int i = 0; i < 5; i++) {
			megaMillions[i] = random.nextInt(70) + 1;
		}
		
		megaMillions[5] = random.nextInt(25) + 1;
		
		System.out.println("Your Mega Millions ticket numbers are: ");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(megaMillions[i] + " ");
		}
		
		System.out.print("Mega Ball: " + megaMillions[5]);
	}
}