import java.util.Scanner;

public class Scratch {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Am I supposed to scratch it?");
		int input = scan.nextInt();

		if(input == 1) {
			System.out.println("Dont bother");
		} else {
			System.out.println("Is it expensive?");
		}
			input = scan.nextInt();
		if(input == 1) {
			System.out.println("Definitley scratch it!");
		} else {
			System.out.println("Have I been yelled at for scratching it before?");
		}
			input = scan.nextInt();
		if(input == 1) {
			System.out.println("Definitley scratch it!");
		} else {
			System.out.println("Will Dr.Batemen be angry if I scratch it?");
		}
			input = scan.nextInt();
		if(input == 1) {
			System.out.println("Definitley scratch it!");
		} else {
			System.out.println("Dont bother.");
		}



	}
}