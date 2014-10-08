public class Game{
	public static void main(String... args){
		int start = (int)((Math.random()*8+1));
		String[] board = {"1","2","3","4","5","6","7","8","9","10"};
		int[] locations = {start,start+1,start+2};
		int numOfGuesses = 0;
		String trialResult;
		String guess;
		SimpleDotCom oneDotCom = new SimpleDotCom();
		GameHelper helper = new GameHelper();
		oneDotCom.setLocationCells(locations);
		setupGame(helper);
		do{
			Board.showBoard(board);
			guess = helper.getUserInput("Make a guess.. Down with the .Coms");
			if (guess.equals(board[Integer.parseInt(guess)-1]))
			{
				trialResult = oneDotCom.checkYourself(guess);
				updateArray(board, Integer.parseInt(guess)-1,trialResult);
				numOfGuesses++;
			}
			else
			{
				System.out.println("Lets not waste time! Focus, you must!");
				System.out.println(board[Integer.parseInt(guess)-1]);
				trialResult = "";				
			}
		}while (trialResult!="kill shot");
		System.out.println("You killed the whale in "+numOfGuesses+" trials!!");
	}
	public static void updateArray(String[] board, int pos, String result){
		String addTxt = "";
		if (result=="miss")
			addTxt = "x";
		else if (result=="hit")
			addTxt = "0";
		else
			System.out.println("Whoa!");
		if (pos==9)
			board[pos] = " "+addTxt;
		else
			board[pos] = addTxt;
	}
	public static void setupGame(GameHelper helper){
		String guess;
		guess = helper.getUserInput("Welcome to .Com killer!! Press any key to continue..");
		guess = helper.getUserInput("Select a position where you think a .com could be hiding..");
		guess = helper.getUserInput("remember.. it takes 3 hits to kill these giants...");
		guess = helper.getUserInput("Good Luck!! Lets kill some .coms!!");
	}
}