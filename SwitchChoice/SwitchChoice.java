//1-3 1 tea 2 coffe 3 juice invalid choice

import java.util.Scanner;

class SwitchChoice{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your choice : ");
		int choice = input.nextInt();
				
		switch (choice){
			case 1:
				System.out.print("Tea");
				break;
			case 2:
				System.out.print("Coffee");
				break;
			case 3:
				System.out.print("Juice");
				break;
			default:
				System.out.print("Invalid Choice");
		}
	}
}