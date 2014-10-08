public class Board{
	public static void showBoard(String[] board){
		System.out.println("***************************************************");
		System.out.println("*   **   **   **   **   **   **   **   **   **    *");
		for(String x:board)
			System.out.print("* "+x+" *");
		System.out.println("");
		System.out.println("*   **   **   **   **   **   **   **   **   **    *");
		System.out.println("***************************************************");
	}
	public static void main(String... args){
		String[] locations = {"1","2","3","4","5","6","7","8","9","10"};
		showBoard(locations);
	}
}