import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Finish time:
//ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	//Frame test = new Frame();
	
	public BowlingGame(){
		int i;
		int firstThrow;
		int secondThrow;
		int pinsLeft;
		
		for(i=0; i<9; i++){
			
			firstThrow = bowlThrow(0, 10);
			pinsLeft = 10 - firstThrow;
			secondThrow = bowlThrow(0, pinsLeft);

			new Frame(firstThrow, secondThrow);
			
			
			//test.setFirstThrow(firstThrow);
			//test.setSecondThrow(secondThrow
		}
	}
	
	public int bowlThrow(int min, int max){
		Random rand = new Random();
		int randNum = rand.nextInt((max - min)+1 )+min;
		return randNum;
	}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score 
		
		return 0;
	}
}
