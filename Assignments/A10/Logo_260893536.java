import java.lang.*;
import java.util.*;
import java.math.*;

public class Logo {
	public static void main(String[] args) {
		int cases; int numCommands;
		String command; int amount;
		Scanner sc = new Scanner(System.in);

		cases = sc.nextInt();
		//System.out.println("Cases: " + cases);

		for (int i = 0; i < cases; i++) {
			numCommands = sc.nextInt();
			//System.out.println("NumCommands: " + numCommands);
			double x=0, y=0, theta=0;
			for (int j = 0; j < numCommands; j++) {
				command= sc.next();
				amount = sc.nextInt();

				//System.out.println("Command: " + command + "\tAmount: " + amount);
				
				if (command.equals("fd")){
					x += amount*Math.cos(Math.toRadians(theta));
					y += amount*Math.sin(Math.toRadians(theta));
				}
				else if (command.equals("lt")){
					theta += amount;
					theta = (theta%360+360)%360;
				}
				else if (command.equals("rt")){
					theta -= amount;
					theta = (theta%360+360)%360;
				}
				else {
					x -= amount*Math.cos(Math.toRadians(theta));
					y -= amount*Math.sin(Math.toRadians(theta));
				}
			}
			System.out.println(Math.round(Math.hypot(x, y)));
		}
	}
}