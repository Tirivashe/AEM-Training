class Batsman2 {
	
	String name;
	public int runsScored;
	public int centuries;
	public int halfCenturies;
	public int ballsFaced;
	public int fours;
	public int sixes;
	
	public Batsman2(String name, int runsScored, int centuries, int halfCenturies, int ballsFaced, int fours, int sixes){
		this.name = name;
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.ballsFaced = ballsFaced;
		this.fours = fours;
		this.sixes = sixes;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getRunsScored(){
		return runsScored;
	}
	
	public void setRunsScored(int runsScored){
		this.runsScored = runsScored;
	}
	
	public int getCenturies(){
		return centuries;
	}
	
	public void setCenturies(int centuries){
		this.centuries = centuries;
	}
	
	
	public int getHalfCenturies(){
		return halfCenturies;
	}
	
	public void setHalfCenturies(int halfCenturies){
		this.halfCenturies = halfCenturies;
	}
	
	public int getBallsFaced(){
		return ballsFaced;
	}
	
	public void setBallsFaced(int ballsFaced){
		this.ballsFaced = ballsFaced;
	}
	
	public int getFours(){
		return fours;
	}
	
	public void setFours(int fours){
		this.fours = fours;
	}
	
	public int getSixes(){
		return sixes;
	}
	
	public void setSixes(int sixes){
		this.sixes = sixes;
	}
}

public class T2_Batsman {

	public static void main(String[] args) {

		Batsman batsman1 = new Batsman();
		batsman1.name = "Virak Kohli";
		batsman1.runsScored = 973;
		batsman1.centuries = 4;
		batsman1.halfCenturies = 7;
		batsman1.ballsFaced = 640;
		batsman1.fours = 83;
		batsman1.sixes = 38;

		System.out.println("Name : " + batsman1.name);
		System.out.println("Runs Scored : " + batsman1.runsScored);
		System.out.println("Balls Faced : " + batsman1.ballsFaced);
		System.out.println("Centuries : " + batsman1.centuries);
		System.out.println("Half Centuries : " + batsman1.halfCenturies);
		System.out.println("Fours : " + batsman1.fours);
		System.out.println("Sixes : " + batsman1.sixes);
		System.out.println("Strike Rate : " + batsman1.getStrikeRate());
		System.out.println("RunsScoredInBoundaries : " + batsman1.getRunsScoredInBoundaries());

		Batsman batsman2 = new Batsman();
		batsman2.setData("AB de Villers", 687, 1, 6, 407, 57, 37);
		System.out.println("Name : " + batsman2.name);
		System.out.println("Runs Scored : " + batsman2.runsScored);
		System.out.println("Balls Faced : " + batsman2.ballsFaced);
		System.out.println("Centuries : " + batsman2.centuries);
		System.out.println("Half Centuries : " + batsman2.halfCenturies);
		System.out.println("Fours : " + batsman2.fours);
		System.out.println("Sixes : " + batsman2.sixes);
		System.out.println("Strike Rate : " + batsman2.getStrikeRate());
		System.out.println("RunsScoredInBoundaries : " + batsman2.getRunsScoredInBoundaries());

	}

}