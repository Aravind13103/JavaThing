package com.strings;

public class Example2 {

	public static void main(String[] args) {
		String[] words = { "flower", "flow", "floor", "float", "flex" };
		String shortest = words[0];
		String prefix = "";

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() < shortest.length()) {
				shortest = words[i];
			}
		}

		for (int i = 0; i < shortest.length(); i++) {

			int count = 0;

			for (int j = 0; j < words.length; j++) {
				if (words[j].charAt(i) == shortest.charAt(i)) {
					count++;
				}
			}

			if (count == words.length) {

				prefix = prefix + shortest.charAt(i);

			} else {
				break;
			}
		}
		System.out.println(prefix);

	}

}
