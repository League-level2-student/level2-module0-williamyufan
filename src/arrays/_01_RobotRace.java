package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot[] robots= new Robot[5];
		//2. create an array of 5 robots.
		
	//3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i]=new Robot();
			robots[i].setSpeed(100);
		}
	//4. make each robot start at the bottom of the screen, side by side, facing up
		int n=350;
		int u=550;
		for (int i = 0; i < robots.length; i++) {
			robots[i].setX(n);
			robots[i].setY(u);
		}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	/*	boolean u1=true;
		while(u1) {
			Random ran=new Random();
			for (int i = 0; i < robots.length; i++) {
				robots[i].move(ran.nextInt(50));
				if(robots[i].getY()<=0) {
					u1=false;
					System.out.println(i);
				}
			}
		}
*/
	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	boolean o=true;
		while(o) {	for (int i = 0; i <robots.length; i++) {
			Random random=new Random();
			robots[i].move(random.nextInt(10));
			robots[i].turn(2);
			if(robots[i].getY()>=550&&robots[i].getX()<=350) {
				o=false;
				System.out.println(i);
			}
			
			
		}
		}
		
		
	}

}
