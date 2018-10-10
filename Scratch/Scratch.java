import java.util.Scanner;

public class Scratch {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		

		System.out.println("Am I supposed to scratch it?");
		int input = scan.nextInt();
		if(input == 0) {							// if the user enters 0 (no), it then asks if its expensive
			System.out.println("Is it expensive?");
				input = scan.nextInt();
		if(input == 0) {							// if the user enters 0, it then asks if jango will be yelled at
			System.out.println("Have I been yelled at for scratching it before?");
				input = scan.nextInt();
		if(input == 0) {							// if the user enters 0, it then asks if dr Batemen will be angry
			System.out.println("Will Dr.Batemen be angry if I scratch it?");
				input = scan.nextInt();
		if(input == 0) {							// if the user enters 0, it then just says "Dont bother"
			System.out.println("Dont bother");
		} 
	}
} 				
} if(input == 1){ // if the user ever enters 1 (yes) during the nested if statements, it will tell Jango to scratch it
	System.out.println("Definitley scratch it!");
}


	}
}