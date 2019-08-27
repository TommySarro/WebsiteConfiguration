import java.util.Scanner;

public class ShawKeygen {
	
	public static void main(String [] args) {
		
		//Created by Tommy Sarro
		//This program currently finds the first 7 characters of the default SHAW router password
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|");
		System.out.println("|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|");
		System.out.println("|/|\\|  _____ _                       _____                _               |/|\\| ");
		System.out.println("|/|\\| / ____| |                     / ____|              | |              |/|\\|");
		System.out.println("|/|\\|| (___ | |__   __ ___      __ | |     _ __ __ _  ___| | _____ _ __   |/|\\|");
		System.out.println("|/|\\| \\___ \\| '_ \\ / _` \\ \\ /\\ / / | |    | '__/ _` |/ __| |/ / _ \\ '__|  |/|\\|");
		System.out.println("|/|\\| ____) | | | | (_| |\\ V  V /  | |____| | | (_| | (__|   <  __/ |     |/|\\|");
		System.out.println("|/|\\||_____/|_| |_|\\__,_| \\_/\\_/    \\_____|_|  \\__,_|\\___|_|\\_\\___|_|     |/|\\| ");   
		System.out.println("|/|\\|                                                                     |/|\\|");
		System.out.println("|/|\\|                         Created by                                  |/|\\|");
		System.out.println("|/|\\|                        Tommy Sarro                                  |/|\\|");
		System.out.println("|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|");
		System.out.println("|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|/|\\|");
		System.out.println();
		System.out.println("Enter router name in the following format: SHAW-XXXXXX");
		System.out.println("For example, enter as: SHAW-2A3C40");
		System.out.println();
		System.out.print("Enter the router name: SHAW-");
		String hitronChoice= input.next();

		System.out.println("Entered: SHAW-" + hitronChoice);
			
		char[] hitronList = new char[6];	
			
		for (int i = 0; i <= 5; i++)
			hitronList[i] = hitronChoice.charAt(i);
		
		System.out.println();
		System.out.println();
		System.out.println("If router is HITRON type enter \"1\"");
		System.out.println("If router is PEGATRON type enter \"2\" [CURRENTLY NOT WORKING]");
		System.out.println();
		int userChoice;
		userChoice = input.nextInt();
	
		if (userChoice == 1) {
		
			System.out.println("*****************************");
			System.out.println("[HITRON TYPE ROUTER SELECTED]");
			System.out.println("Default type HITRON routers have a password length of 12 characters");
			System.out.println();
			//System.out.println("If the MAC address of the HITRON router is known, enter \"1\"");
			//System.out.println("If the MAC address of the HITRON router is NOT known, enter \"2\"");
			System.out.println("Press: \"1\" to continue ");
			System.out.println();
			userChoice = input.nextInt();
			
			if (userChoice != 1) {
				
			}
			
			if (userChoice == 1) {
				System.out.println("***********************************************");
				System.out.println("[MAC address of the HITRON router is not known]");
				System.out.println();
				System.out.println("Beginning SHAW-" + hitronChoice + " decryption");
				
				for (int r = 1; r < 74; r++) {
					
					if (r % 2 != 0 && r < 48)
						System.out.print("o");
					
					if (r % 2 == 0 && r < 48)
						System.out.print("O");
					
					if (r == 47) {
						System.out.println();
						System.out.print("Commencing decryption");
					}
					if (r > 48)
						System.out.print(".");
					
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
				}
				
				System.out.println();
				System.out.println();
				
				
				int fifthHitronChar = 0;
				int sixthHitronChar = 0;
				
				int hitronRouterOne = hitronList[0];
				int hitronRouterTwo = hitronList[1];
				int hitronRouterThree = hitronList[2];
				int hitronRouterFour = hitronList[3];
				int hitronRouterFive = hitronList[4];
				int hitronRouterSix = hitronList[5];
				int hitronNumberOne = Character.getNumericValue(hitronRouterOne);
				int hitronNumberTwo = Character.getNumericValue(hitronRouterTwo);
				int hitronNumberThree = Character.getNumericValue(hitronRouterThree);
				int hitronNumberFour = Character.getNumericValue(hitronRouterFour);
				int hitronNumberFive = Character.getNumericValue(hitronRouterFive);
				int hitronNumberSix = Character.getNumericValue(hitronRouterSix);
				
				if (hitronNumberOne == 0) {
					fifthHitronChar = 0;
					sixthHitronChar = 0;
				}
					
				if (hitronNumberOne == 1) {
					fifthHitronChar = 0;
					sixthHitronChar = 0;
				}
				
				if (hitronNumberOne == 2) {
					if (hitronNumberTwo == 0) {
						fifthHitronChar = 5;
						sixthHitronChar = 6;
					}
					
					if (hitronNumberTwo == 1) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					
					if (hitronNumberTwo == 2) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					
					if (hitronNumberTwo == 3) {
						fifthHitronChar = 5;
						sixthHitronChar = 1;
					}
					
					if (hitronNumberTwo == 4) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					
					if (hitronNumberTwo == 5) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					
					if (hitronNumberTwo == 6) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					
					if (hitronNumberTwo == 7) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					
					if (hitronNumberTwo == 8) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					
					if (hitronNumberTwo == 9) {
						fifthHitronChar = 5;
						sixthHitronChar = 6;
					}
					
					if (hitronNumberTwo == 10) {
						fifthHitronChar = 5;
						sixthHitronChar = 1;
					}
					
					if (hitronNumberTwo == 11) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					
					if (hitronNumberTwo == 12) {
						fifthHitronChar = 7;
						sixthHitronChar = 6;
					}
					
					if (hitronNumberTwo == 13) {
						fifthHitronChar = 5;
						sixthHitronChar = 1;
					}
					
					if (hitronNumberTwo == 14) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					
					if (hitronNumberTwo == 15) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
				}
				
				if (hitronNumberOne == 3) {
					if (hitronNumberTwo == 0) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 1) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 2) {
						fifthHitronChar = 5;
						sixthHitronChar = 6;
					}
					if (hitronNumberTwo == 3) {
						fifthHitronChar = 5;
						sixthHitronChar = 1;
					}
					if (hitronNumberTwo == 4) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 5) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 6) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 7) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 8) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 9) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 10) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 11) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 12) {
						fifthHitronChar = 7;
						sixthHitronChar = 7;
					}
					if (hitronNumberTwo == 13) {
						fifthHitronChar = 7;
						sixthHitronChar = 7;
					}
					if (hitronNumberTwo == 14) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 15) {
						fifthHitronChar = 5;
						sixthHitronChar = 12;
					}
				}
				
				if (hitronNumberOne == 4) {
					if (hitronNumberTwo == 0) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 1) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 2) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 3) {
						fifthHitronChar = 5;
						sixthHitronChar = 7;
					}
					if (hitronNumberTwo == 4) {
						fifthHitronChar = 5;
						sixthHitronChar = 7;
					}
					if (hitronNumberTwo == 5) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 6) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 7) {
						fifthHitronChar = 7;
						sixthHitronChar = 1;
					}
					if (hitronNumberTwo == 8) {
						fifthHitronChar = 5;
						sixthHitronChar = 12;
					}
					if (hitronNumberTwo == 9) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 10) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 11) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 12) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 13) {
						fifthHitronChar = 8;
						sixthHitronChar = 2;
					}
					if (hitronNumberTwo == 14) {
						fifthHitronChar = 6;
						sixthHitronChar = 8;
					}
					if (hitronNumberTwo == 15) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
				}
				
				if (hitronNumberOne == 5) {
					if (hitronNumberTwo == 0) {
						fifthHitronChar = 6;
						sixthHitronChar = 8;
					}
					if (hitronNumberTwo == 1) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 2) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 3) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 4) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 5) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 6) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 7) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 8) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 9) {
						fifthHitronChar = 6;
						sixthHitronChar = 8;
					}
					if (hitronNumberTwo == 10) {
						fifthHitronChar = 6;
						sixthHitronChar = 8;
					}
					if (hitronNumberTwo == 11) {
						fifthHitronChar = 6;
						sixthHitronChar = 8;
					}
					if (hitronNumberTwo == 12) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 13) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 14) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 15) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
				}
				
				if (hitronNumberOne == 6) {
					if (hitronNumberTwo == 0) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 1) {
						fifthHitronChar = 6;
						sixthHitronChar = 9;
					}
					if (hitronNumberTwo == 2) {
						fifthHitronChar = 7;
						sixthHitronChar = 8;
					}
					if (hitronNumberTwo == 3) {
						fifthHitronChar = 6;
						sixthHitronChar = 1;
					}
					if (hitronNumberTwo == 4) {
						fifthHitronChar = 6;
						sixthHitronChar = 9;
					}
					if (hitronNumberTwo == 5) {
						fifthHitronChar = 7;
						sixthHitronChar = 8;
					}
					if (hitronNumberTwo == 6) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 7) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 8) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 9) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 10) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 11) {
						fifthHitronChar = 6;
						sixthHitronChar = 9;
					}
					if (hitronNumberTwo == 12) {
						fifthHitronChar = 6;
						sixthHitronChar = 9;
					}
					if (hitronNumberTwo == 13) {
						fifthHitronChar = 6;
						sixthHitronChar = 9;
					}
					if (hitronNumberTwo == 14) {
						fifthHitronChar = 6;
						sixthHitronChar = 9;
					}
					if (hitronNumberTwo == 15) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
				}
				
				if (hitronNumberOne == 7) {
					if (hitronNumberTwo == 0) {
						fifthHitronChar = 5;
						sixthHitronChar = 3;
					}
					if (hitronNumberTwo == 1) {
						fifthHitronChar = 6;
						sixthHitronChar = 9;
					}
					if (hitronNumberTwo == 2) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 3) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 4) {
						fifthHitronChar = 6;
						sixthHitronChar = 9;
					}
					if (hitronNumberTwo == 5) {
						fifthHitronChar = 6;
						sixthHitronChar = 9;
					}
					if (hitronNumberTwo == 6) {
						fifthHitronChar = 6;
						sixthHitronChar = 9;
					}
					if (hitronNumberTwo == 7) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 8) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 9) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 10) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 11) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 12) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 13) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 14) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 15) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
				}
				
				if (hitronNumberOne == 8) {
					if (hitronNumberTwo == 0) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 1) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 2) {
						fifthHitronChar = 6;
						sixthHitronChar = 10;
					}
					if (hitronNumberTwo == 3) {
						fifthHitronChar = 6;
						sixthHitronChar = 1;
					}
					if (hitronNumberTwo == 4) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 5) {
						fifthHitronChar = 6;
						sixthHitronChar = 1;
					}
					if (hitronNumberTwo == 6) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 7) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 8) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 9) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 10) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 11) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 12) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 13) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 14) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 15) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
				}
				
				if (hitronNumberOne == 9) {
					fifthHitronChar = 0;
					sixthHitronChar = 0;
				}
				
				if (hitronNumberOne == 10) {
					if (hitronNumberTwo == 0) {
						fifthHitronChar = 7;
						sixthHitronChar = 9;
					}
					if (hitronNumberTwo == 1) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 2) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 3) {
						fifthHitronChar = 5;
						sixthHitronChar = 4;
					}
					if (hitronNumberTwo == 4) {
						fifthHitronChar = 5;
						sixthHitronChar = 9;
					}
					if (hitronNumberTwo == 5) {
						
						fifthHitronChar = 5;
						sixthHitronChar = 4;
					}
					if (hitronNumberTwo == 6) {
						fifthHitronChar = 6;
						sixthHitronChar = 7;
					}
					if (hitronNumberTwo == 7) {
						fifthHitronChar = 6;
						sixthHitronChar = 2;
					}
					if (hitronNumberTwo == 8) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 9) {
						fifthHitronChar = 7;
						sixthHitronChar = 9;
					}
					if (hitronNumberTwo == 10) {
						fifthHitronChar = 5;
						sixthHitronChar = 1;
					}
					if (hitronNumberTwo == 11) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 12) {
						fifthHitronChar = 6;
						sixthHitronChar = 7;
					}
					if (hitronNumberTwo == 13) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 14) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 15) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
				}
				
				if (hitronNumberOne == 11) {
					if (hitronNumberTwo == 0) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 1) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 2) {
						fifthHitronChar = 6;
						sixthHitronChar = 7;
					}
					if (hitronNumberTwo == 3) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 4) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 5) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 6) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 7) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 8) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 9) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 10) {
						fifthHitronChar = 5;
						sixthHitronChar = 10;
					}
					if (hitronNumberTwo == 11) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 12) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 13) {
						fifthHitronChar = 4;
						sixthHitronChar = 11;
					}
					if (hitronNumberTwo == 14) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 15) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
				}
				
				if (hitronNumberOne == 12) {
					if (hitronNumberTwo == 0) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 1) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 2) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 3) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 4) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 5) {
						
						fifthHitronChar = 5;
						sixthHitronChar = 4;
					}
					if (hitronNumberTwo == 6) {
						fifthHitronChar = 4;
						sixthHitronChar = 11;
					}
					if (hitronNumberTwo == 7) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 8) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 9) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 10) {
						fifthHitronChar = 7;
						sixthHitronChar = 6;
					}
					if (hitronNumberTwo == 11) {
						fifthHitronChar = 5;
						sixthHitronChar = 4;
					}
					if (hitronNumberTwo == 12) {
						fifthHitronChar = 4;
						sixthHitronChar = 11;
					}
					if (hitronNumberTwo == 13) {
						fifthHitronChar = 4;
						sixthHitronChar = 11;
					}
					if (hitronNumberTwo == 14) {
						fifthHitronChar = 5;
						sixthHitronChar = 10;
					}
					if (hitronNumberTwo == 15) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
				}
				
				if (hitronNumberOne == 13) {
					if (hitronNumberTwo == 0) {
						fifthHitronChar = 7;
						sixthHitronChar = 11;
					}
					if (hitronNumberTwo == 1) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 2) {
						fifthHitronChar = 5;
						sixthHitronChar = 1;
					}
					if (hitronNumberTwo == 3) {
						fifthHitronChar = 5;
						sixthHitronChar = 1;
					}
					if (hitronNumberTwo == 4) {
						fifthHitronChar = 5;
						sixthHitronChar = 1;
					}
					if (hitronNumberTwo == 5) {
						
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 6) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 7) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 8) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 9) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 10) {
						fifthHitronChar = 5;
						sixthHitronChar = 10;
					}
					if (hitronNumberTwo == 11) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 12) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 13) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 14) {
						fifthHitronChar = 6;
						sixthHitronChar = 10;
					}
					if (hitronNumberTwo == 15) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
				}
				
				if (hitronNumberOne == 14) {
					if (hitronNumberTwo == 0) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 1) {
						fifthHitronChar = 6;
						sixthHitronChar = 3;
					}
					if (hitronNumberTwo == 2) {
						fifthHitronChar = 6;
						sixthHitronChar = 3;
					}
					if (hitronNumberTwo == 3) {
						fifthHitronChar = 5;
						sixthHitronChar = 5;
					}
					if (hitronNumberTwo == 4) {
						fifthHitronChar = 6;
						sixthHitronChar = 3;
					}
					if (hitronNumberTwo == 5) {
						
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 6) {
						fifthHitronChar = 5;
						sixthHitronChar = 6;
					}
					if (hitronNumberTwo == 7) {
						fifthHitronChar = 5;
						sixthHitronChar = 5;
					}
					if (hitronNumberTwo == 8) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 9) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 10) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 11) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 12) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 13) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 14) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 15) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
				}
				
				if (hitronNumberOne == 15) {
					if (hitronNumberTwo == 0) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 1) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 2) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 3) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 4) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 5) {
						
						fifthHitronChar = 5;
						sixthHitronChar = 11;
					}
					if (hitronNumberTwo == 6) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 7) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 8) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 9) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 10) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 11) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 12) {
						fifthHitronChar = 5;
						sixthHitronChar = 11;
					}
					if (hitronNumberTwo == 13) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
					if (hitronNumberTwo == 14) {
						fifthHitronChar = 5;
						sixthHitronChar = 11;
					}
					if (hitronNumberTwo == 15) {
						fifthHitronChar = 0;
						sixthHitronChar = 0;
					}
				}
					
				String hitronSixDigit = (Integer.toHexString(sixthHitronChar));
				
				int hitronTimer = 500;
				
					
				for (int firstCountHitron = 0; firstCountHitron < hitronTimer; firstCountHitron++) {
					System.out.println("xxxxxxxxxxxx");
					try {
						Thread.sleep(1);
					} catch (Exception e) {
					}
				}
				
				for (int secondCountHitron = 0; secondCountHitron < hitronTimer; secondCountHitron++) {
					System.out.println("2xxxxxxxxxxx");
					try {
						Thread.sleep(1);
					} catch (Exception e) {
					}
				}
				
				for (int thirdCountHitron = 0; thirdCountHitron < hitronTimer; thirdCountHitron++) {
					System.out.println("25xxxxxxxxxx");
					try {
						Thread.sleep(1);
					} catch (Exception e) {
					}
				}
					
				for (int fourthCountHitron = 0; fourthCountHitron < hitronTimer; fourthCountHitron++) {
					System.out.println("251xxxxxxxxx");
					try {
						Thread.sleep(1);
					} catch (Exception e) {
					}
				}
				
				for (int fifthCountHitron = 0; fifthCountHitron < hitronTimer; fifthCountHitron++) {
					System.out.println("2511xxxxxxxx");
					try {
						Thread.sleep(1);
					} catch (Exception e) {
					}
				}
				
				for (int sixthCountHitron = 0; sixthCountHitron < hitronTimer; sixthCountHitron++) {
					System.out.println("2511" + fifthHitronChar + "xxxxxxx");
					try {
						Thread.sleep(1);
					} catch (Exception e) {
					}
				}
				
				for (int seventhCountHitron = 0; seventhCountHitron < hitronTimer; seventhCountHitron++) {
					System.out.println("2511" + fifthHitronChar + hitronSixDigit + "xxxxxx");
					try {
						Thread.sleep(1);
					} catch (Exception e) {
					}
				}
				
				for (int eighthCountHitron = 0; eighthCountHitron < hitronTimer; eighthCountHitron++) {
					System.out.println("2511" + fifthHitronChar + hitronSixDigit + "0xxxxx");
					try {
						Thread.sleep(1);
					} catch (Exception e) {
					}
					
				}
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("SHAW router password found: 2511" + fifthHitronChar + hitronSixDigit + "0xxxxx");
				System.out.println();
				System.out.println();
				System.out.println("SHAW Router possible passwords reduced by 1,000,000,000,000 (1*10^12; 1 Trillion)");
				System.out.println("Remaining number of possible passwords: 1,000,000 (1*10^6; 1 Million)");
				System.out.println();
				System.out.println("I AM CURRENTLY ADAPTING THIS PROGRAM TO SOLVE THE SHAW ROUTER DEFAULT PASSWORD");
				System.out.println("FULL PROGRAM WILL BE COMPLETED EARLY 2020");
		
			}

		}
	}
}