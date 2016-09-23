import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Finish time:
//ID: 2311425

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
			addFrame(test);
			
			
		
		}
		int txt = score();
		//System.out.println(frames); //[Frame@5387f9e0, Frame@6e5e91e4, Frame@2cdf8d8a, Frame@30946e09, Frame@5cb0d902, Frame@46fbb2c1, Frame@1698c449, Frame@5ef04b5]
	}
	
	public int bowlThrow(int min, int max){
		Random rand = new Random();
		int randNum = rand.nextInt((max - min)+1 )+min;
		return randNum;
	}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		frames.add(frame);
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
		System.out.println("Size " + frames.size());
		for(i=0; i< frames.size(); i++){
			Frame score = frames.get(i);
			int sc = score.score();
			System.out.println(sc);
			totalScore = totalScore + sc;
		}
		
		return totalScore;
	}
}
