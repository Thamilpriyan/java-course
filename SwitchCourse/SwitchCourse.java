// course Java Python Unknown Course 
import java.util.Scanner;

class SwitchCourse{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter course : ");
		String course = input.nextLine().toLowerCase();
		
		switch(course){
			case "java":
				System.out.println("Java Selected");
				break;
			case "python":
				System.out.println("Python Selected");
				break;
			default:
				System.out.println("Invalid Course");
		}
	}
}