package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static boolean noWinner = true;
	///JOptionPane jop = new JOptionPane();
	//1. make a main method
		public static void main(String[] args) {
			Robot[] r = new Robot[5];
			
			for(int i = 0; i < r.length; i++) {
				r[i] = new Robot(100+(100*i),400);
				
			}
			
			
			Random rand = new Random();
			while(noWinner) {
				for(int i = 0; i < r.length; i++) {
					//r[i].move(rand.nextInt(50));
					r[i].setY(r[i].getY()-rand.nextInt(2));
					if(r[i].getY() < 0) {
						noWinner = false;
						JOptionPane.showMessageDialog(null, "Robot " + (i+1) + " Wins!");

					}
				}
			}
		}
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.

			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	
}
