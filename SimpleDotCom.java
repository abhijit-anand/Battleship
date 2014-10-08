public class SimpleDotCom{
	int[] locationCells;
	int numOfHits = 0;
	
	public void setLocationCells(int[] locs){
		locationCells = locs;
	}

	public String checkYourself(String stringGuess){
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for (int cell:locationCells){
			if (guess==cell){
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if (numOfHits == locationCells.length) {
			result = "kill shot";
		}
		if (result=="miss")
			System.out.println("Damn! You "+result+"ed, better luck next time!");
		else if(result=="hit")
			System.out.println("Attaboy! Force is strong with this one. Nice Hit!!");
		return result;
	}
}