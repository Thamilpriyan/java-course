import java.util.Scanner;

class SwitchGrade{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your grade (A to C): ");
		char grade = input.next().toUpperCase().charAt(0);
		
		switch (grade){
			case 'A': 
				System.out.println("Excellent");
				break;
			case 'B':
				System.out.println("Very Good");
				break;
			case 'C':
				System.out.println("Good");
				break;
			default:
				System.out.println("Try Again");
				break;
		}
	}
}