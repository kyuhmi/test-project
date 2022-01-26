package stuffs;

import java.util.ArrayList;
import java.util.Scanner;

public class LetterReverserNumPreserver {

	public static void main(String[] args) {

		//reverses letters in string while maintaining position and order of non-letters

		Scanner scan = new Scanner(System.in);
		
		String userInput = scan.nextLine();
		
		char[] testArray = userInput.toCharArray();
		
		boolean[] order = new boolean[userInput.length()];
		ArrayList<Character> alphaArrayList = new ArrayList<Character>();
		ArrayList<Character> nonAlphaArrayList = new ArrayList<Character>();
		
		String buildString = "";
		
		for (int i = 0; i < testArray.length; i++) {
			if (Character.isAlphabetic(testArray[i])) {
				alphaArrayList.add(testArray[i]);
				order[i] = true;
			} else {
				nonAlphaArrayList.add(testArray[i]);
				order[i] = false;
			}
		}
		int position = 0;
		int alphaIndex = alphaArrayList.size() - 1;
		int nonAlphaIndex = 0;
		
		while (position < userInput.length()) {
			if (order[position]) {
				buildString += alphaArrayList.get(alphaIndex);
				alphaIndex--;
			} else {
				buildString += nonAlphaArrayList.get(nonAlphaIndex);
				nonAlphaIndex++;
			}
			position++;
		}
		
		System.out.println(buildString);
		
	}

}
