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
		boolean strike = true;
		boolean spare = true;
		
		for(i=0; i<10; i++){
			
			firstThrow = bowlThrow(0, 10);
			if(firstThrow == 10){
				Frame test = new Frame(firstThrow, 0);
				strike = test.isStrike();
				continue;
			}
			pinsLeft = 10 - firstThrow;
			secondThrow = bowlThrow(0, pinsLeft);
			if(secondThrow == pinsLeft){
				Frame test = new Frame(firstThrow, secondThrow);
				spare = test.isSpare();
				continue;
			}
			Frame test = new Frame(firstThrow, secondThrow);
			if(strike == false){
				strike = true;
			}
			if(spare == false){
				spare = true;
			}
			frames.add(test);
			int txt = score();
			System.out.println(frames);
			
		
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
		int i;
		int totalScore = 0;
		for(i=0; i< frames.size(); i++){
			Frame score = frames.get(i);
			int sc = score.score();
			totalScore = totalScore + sc;
		}
		
		return totalScore;
	}
}
