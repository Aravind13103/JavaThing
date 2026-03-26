package com.strings;

import java.util.HashSet;

public class Unique_Char {

	public static void main(String[] args) {
		HashSet<Character> seen = new HashSet<Character>();
		String str = "seen";
		for (int i = 0; i < str.length(); i++) {
			char character = str.charAt(i);
			if (seen.contains(character)) {
				System.out.println("Contains duplicates");
				break;

			} else {
				seen.add(character);
			}

		}
		System.out.println(str+"=>"+seen);

	}
}
