package ccc._06;

import java.util.*;

//	INCOMPLETE

public class ccc06_J3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<String> words = new ArrayList<String>();
		while (true) {
			String word = in.nextLine();
			if (word.equals("halt")) {
				break;
			}
			words.add(word);
		}

	}

	public static int time(String word) {
		int time = 0;
		String[] letters = new String[word.length()];
		for (String letter: letters) {
			for (int i = 65; i <= 90; i++) {
			}
		}
		
		return 0;
	}

	// public static boolean onePress(String letter) {
	// }
}